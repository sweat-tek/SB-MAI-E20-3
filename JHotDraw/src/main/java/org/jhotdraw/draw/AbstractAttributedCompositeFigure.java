/*
 * @(#)AbstractAttributedCompositeFigure.java  2.0 2007-05-18
 *
 * Copyright (c) 1996-2007 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */
package org.jhotdraw.draw;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.io.*;
import static org.jhotdraw.draw.AttributeKeys.*;
import org.jhotdraw.geom.*;
import org.jhotdraw.xml.DOMInput;
import org.jhotdraw.xml.DOMOutput;

/**
 * An AbstractAttributedCompositeFigure is a CompositeFigure which has
 * its own attribute set.
 *
 * @author Werner Randelshofer
 * @version 2.0 2007-05-18 Changed due to changes in Figure interface. 
 * <br>1.0 July 9, 2006 Created.
 */
public abstract class AbstractAttributedCompositeFigure extends AbstractCompositeFigure implements DrawableFigure{

    private HashMap<AttributeKey, Object> attributes = new HashMap<AttributeKey, Object>();
    /**
     * Forbidden attributes can't be set by the setAttribute() operation.
     * They can only be changed by setAttribute().
     */
    private HashSet<AttributeKey> forbiddenAttributes;

    /** Creates a new instance. */
    public AbstractAttributedCompositeFigure() {
    }

    public void setAttributeEnabled(AttributeKey key, boolean b) {
        if (forbiddenAttributes == null) {
            forbiddenAttributes = new HashSet<AttributeKey>();
        }
        if (b) {
            forbiddenAttributes.remove(key);
        } else {
            forbiddenAttributes.add(key);
        }
    }

    public boolean isAttributeEnabled(AttributeKey key) {
        return forbiddenAttributes == null || !forbiddenAttributes.contains(key);
    }

    @SuppressWarnings("unchecked")
    public void setAttributes(Map<AttributeKey, Object> map) {
        for (Map.Entry<AttributeKey, Object> entry : map.entrySet()) {
            entry.getKey().basicSet(this, entry.getValue());
        }
    }

    @Override
    public Map<AttributeKey, Object> getAttributes() {
        return new HashMap<AttributeKey, Object>(attributes);
    }

    /**
     * Sets an attribute of the figure.
     * AttributeKey name and semantics are defined by the class implementing
     * the figure interface.
     */
    @Override
    public <T> void setAttribute(AttributeKey<T> key, T newValue) {
        if (forbiddenAttributes == null || !forbiddenAttributes.contains(key)) {
            Object oldValue = attributes.put(key, newValue);
            setAttributeOnChildren(key, newValue);
            fireAttributeChanged(key, oldValue, newValue);
        }
    }

    protected <T> void setAttributeOnChildren(AttributeKey<T> key, T newValue) {
        for (Figure child : getChildren()) {
            key.basicSet(child, newValue);
        }
    }

    /**
     * Gets an attribute from the figure.
     */
    @Override
    public <T> T getAttribute(AttributeKey<T> key) {
        return hasAttribute(key) ? key.get(attributes) : key.getDefaultValue();
    }

    @Override
    public Object getAttributesRestoreData() {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add(new HashMap<AttributeKey, Object>(getAttributes()));
        for (Figure child : getChildren()) {
            list.add(child.getAttributesRestoreData());
        }
        return list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void restoreAttributesTo(Object restoreData) {
        Iterator<Object> i = ((LinkedList<Object>) restoreData).iterator();
        attributes.clear();
        setAttributes((Map<AttributeKey, Object>) i.next());
        for (Figure child : getChildren()) {
            child.restoreAttributesTo(i.next());
        }
    }

    public void drawFigure(Graphics2D g) {
        this.drawGraphicWithChildren(g, getChildren());
    }

    public Stroke getStroke() {
        return AttributeKeys.getStroke(this);
    }

    public double getStrokeMiterLimitFactor() {
        Number value = (Number) getAttribute(AttributeKeys.STROKE_MITER_LIMIT);
        return (value != null) ? value.doubleValue() : 10f;
    }

    public Rectangle2D.Double getFigureDrawBounds() {
        double width = AttributeKeys.getStrokeTotalWidth(this) / 2d;
        if (STROKE_JOIN.get(this) == BasicStroke.JOIN_MITER) {
            width *= STROKE_MITER_LIMIT.get(this);
        }
        width++;
        Rectangle2D.Double r = getBounds();
        Geom.grow(r, width, width);
        return r;
    }

    public AbstractAttributedCompositeFigure clone() {
        AbstractAttributedCompositeFigure that = (AbstractAttributedCompositeFigure) super.clone();
        that.attributes = new HashMap<AttributeKey, Object>(this.attributes);
        if (this.forbiddenAttributes != null) {
            that.forbiddenAttributes = new HashSet<AttributeKey>(this.forbiddenAttributes);
        }
        return that;
    }

    protected void writeAttributes(DOMOutput out) throws IOException {
        Figure prototype = (Figure) out.getPrototype();

        boolean isElementOpen = false;
        for (Map.Entry<AttributeKey, Object> entry : attributes.entrySet()) {
            AttributeKey key = entry.getKey();
            if (forbiddenAttributes == null || !forbiddenAttributes.contains(key)) {
                Object prototypeValue = key.get(prototype);
                Object attributeValue = key.get(this);
                if (prototypeValue != attributeValue ||
                        (prototypeValue != null && attributeValue != null &&
                        !prototypeValue.equals(attributeValue))) {
                    if (!isElementOpen) {
                        out.openElement("a");
                        isElementOpen = true;
                    }
                    out.openElement(key.getKey());
                    out.writeObject(entry.getValue());
                    out.closeElement();
                }
            }
        }
        if (isElementOpen) {
            out.closeElement();
        }
    }

    @SuppressWarnings("unchecked")
    protected void readAttributes(DOMInput in) throws IOException {
        if (in.getElementCount("a") > 0) {
            in.openElement("a");
            for (int i = in.getElementCount() - 1; i >= 0; i--) {
                in.openElement(i);
                String name = in.getTagName();
                Object value = in.readObject();
                AttributeKey key = getAttributeKey(name);
                if (key != null && key.isAssignable(value)) {
                    if (forbiddenAttributes == null || !forbiddenAttributes.contains(key)) {
                        key.basicSet(this, value);
                    }
                }
                in.closeElement();
            }
            in.closeElement();
        }
    }

    protected AttributeKey getAttributeKey(String name) {
        return AttributeKeys.supportedAttributeMap.get(name);
    }

    /**
     * Applies all attributes of this figure to that figure.
     */
    @SuppressWarnings("unchecked")
    protected void applyAttributesTo(Figure that) {
        for (Map.Entry<AttributeKey, Object> entry : attributes.entrySet()) {
            entry.getKey().basicSet(that, entry.getValue());
        }
    }

    @Override
    public void write(DOMOutput out) throws IOException {
        super.write(out);
        writeAttributes(out);
    }

    @Override
    public void read(DOMInput in) throws IOException {
        super.read(in);
        readAttributes(in);
    }

    public <T> void removeAttribute(AttributeKey<T> key) {
        if (hasAttribute(key)) {
            T oldValue = getAttribute(key);
            attributes.remove(key);
            fireAttributeChanged(key, oldValue, key.getDefaultValue());
        }
    }

    public boolean hasAttribute(AttributeKey key) {
        return attributes.containsKey(key);
    }
}
