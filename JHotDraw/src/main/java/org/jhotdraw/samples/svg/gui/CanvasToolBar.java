/*
 * @(#)CanvasToolBar.java  1.0  2008-05-18
 *
 * Copyright (c) 2007-2008 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */
package org.jhotdraw.samples.svg.gui;

import org.jhotdraw.text.JavaNumberFormatter;
import javax.swing.border.*;
import org.jhotdraw.gui.*;
import org.jhotdraw.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.SliderUI;
import javax.swing.plaf.TextUI;
import org.jhotdraw.draw.action.*;
import org.jhotdraw.gui.plaf.palette.*;
import org.jhotdraw.text.ColorFormatter;
import static org.jhotdraw.samples.svg.SVGAttributeKeys.*;

/**
 * CanvasToolBar.
 *
 * @author Werner Randelshofer
 * @version 1.0 2008-05-18 Created.
 */
public class CanvasToolBar extends AbstractToolBar {
    
    private final ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.samples.svg.Labels");

    /** Creates new instance. */
    public CanvasToolBar() {
        setName(labels.getString(getID() + ".toolbar"));
        setDisclosureStateCount(3);
    }

    @Override
    protected JComponent createDisclosedComponent(int state) {
        JPanel p = null;

        switch (state) {
            case 1:
                p = stateOne(p);
                break;
            case 2:
                p = stateTwo(p);
                break;
        }
        return p;
    }

    @Override
    protected String getID() {
        return "canvas";
    }
    
    private GridBagConstraints standartGBC(int gridx, int gridy){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        return gbc;
    }
    
    private JPanel setUpStandartJPanel(JPanel p){
        p = new JPanel();
        p.setOpaque(false);

        p.removeAll();
        p.setBorder(new EmptyBorder(5, 5, 5, 8));
        
        GridBagLayout layout = new GridBagLayout();
        p.setLayout(layout);
        
        return p;
    }
    
    private void basicCanvasFillColorBtn(JPanel p){
        // Fill color
        AbstractButton btn = ButtonFactory.createDrawingColorButton(editor,
                CANVAS_FILL_COLOR, ButtonFactory.HSV_COLORS, ButtonFactory.HSV_COLORS_COLUMN_COUNT,
                "attribute.canvasFillColor", labels, null, new Rectangle(3, 3, 10, 10));
        btn.setUI((PaletteButtonUI) PaletteButtonUI.createUI(btn));
        new DrawingComponentRepainter(editor, btn);
        ((JPopupButton) btn).setAction(null, null);
        GridBagConstraints gbc = standartGBC(GridBagConstraints.RELATIVE, 0);
        gbc.gridwidth=2;
        p.add(btn, gbc);
    }
    
    private void setInButton(JPanel p, AbstractButton btn){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.gridwidth=2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        p.add(btn, gbc);
    }
    
    private void basicOpacatySlider(JPanel p){
        JPopupButton opacityPopupButton = opacityPopupButton();
        GridBagConstraints gbc = standartGBC(2, 0);
        gbc.insets = new Insets(0, 3, 0, 0);
        p.add(opacityPopupButton, gbc);
    }
    
    private void advanceOpacatySlider(JPanel p){
        JPopupButton opacityPopupButton = opacityPopupButton();
        GridBagConstraints gbc = standartGBC(1, 1);
        gbc.insets = new Insets(3, 0, 0, 0);
        p.add(opacityPopupButton, gbc);
    }
    
    private JPopupButton opacityPopupButton(){
        JPopupButton opacityPopupButton = new JPopupButton();
        JAttributeSlider opacitySlider = new JAttributeSlider(JSlider.VERTICAL, 0, 100, 100);
        opacitySlider.setUI((SliderUI) PaletteSliderUI.createUI(opacitySlider));
        opacitySlider.setScaleFactor(100d);
        new DrawingAttributeEditorHandler<Double>(CANVAS_FILL_OPACITY, opacitySlider, editor);
        opacityPopupButton.add(opacitySlider);
        labels.configureToolBarButton(opacityPopupButton, "attribute.canvasFillOpacity");
        opacityPopupButton.setUI((PaletteButtonUI) PaletteButtonUI.createUI(opacityPopupButton));
        opacityPopupButton.setIcon(new DrawingOpacityIcon(editor, CANVAS_FILL_OPACITY, CANVAS_FILL_COLOR, null,
                getClass().getResource(labels.getString("attribute.canvasFillOpacity.icon")),new Rectangle(5, 5, 6, 6), new Rectangle(4, 4, 7, 7)));
        new DrawingComponentRepainter(editor, opacityPopupButton);
        return opacityPopupButton;
    }
    
    private void addWidthLabel(JPanel p, JAttributeTextField<Double> widthField, int gridx, int gridy){
        JLabel widthLabel = new javax.swing.JLabel();
        widthLabel.setUI((LabelUI) PaletteLabelUI.createUI(widthLabel));
        widthLabel.setLabelFor(widthField);
        widthLabel.setToolTipText(labels.getString("attribute.canvasWidth.toolTipText"));
        widthLabel.setText(labels.getString("attribute.canvasWidth.text")); // NOI18N
        GridBagConstraints gbc = standartGBC(gridx, gridy);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 0, 0, 0);
        p.add(widthLabel, gbc);
    }
    
    private void addWidth(JPanel p, int gridx, int gridy){
        JAttributeTextField<Double> widthField = new JAttributeTextField<Double>();
        addWidthLabel(p, widthField, gridx-1, gridy);
        widthField = createStandartField(widthField);
        widthField.setToolTipText(labels.getString("attribute.canvasWidth.toolTipText"));
        
        new DrawingAttributeEditorHandler<Double>(CANVAS_WIDTH, widthField, editor);
        GridBagConstraints gbc = standartGBC(gridx, gridy);
        gbc.gridwidth=2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 0, 0);
        p.add(widthField, gbc);
    }
    
    private void addHeightLabel(JPanel p, JAttributeTextField<Double> heightField, int gridx, int gridy){
        JLabel heightLabel = new javax.swing.JLabel();
        heightLabel.setUI((LabelUI) PaletteLabelUI.createUI(heightLabel));
        heightLabel.setLabelFor(heightField);
        heightLabel.setToolTipText(labels.getString("attribute.canvasHeight.toolTipText"));
        heightLabel.setText(labels.getString("attribute.canvasHeight.text")); // NOI18N
        GridBagConstraints gbc = standartGBC(gridx, gridy);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 0, 0, 0);
        p.add(heightLabel, gbc);
    }
    
    private void addHight(JPanel p, int gridx, int gridy){
        JAttributeTextField<Double> heightField = new JAttributeTextField<Double>();
        addHeightLabel(p, heightField, gridx-1, gridy);
        heightField = createStandartField(heightField);
        heightField.setToolTipText(labels.getString("attribute.canvasHeight.toolTipText"));
        
        new DrawingAttributeEditorHandler<Double>(CANVAS_HEIGHT, heightField, editor);
        GridBagConstraints gbc = standartGBC(gridx, gridy);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(3, 3, 0, 0);
        gbc.gridwidth=2;
        p.add(heightField, gbc);
    }
    
    private void opacityField(JPanel p){
        JAttributeTextField<Double> opacityField = new JAttributeTextField<Double>();
        opacityField.setColumns(3);
        opacityField.setToolTipText(labels.getString("attribute.figureOpacity.toolTipText"));
        opacityField.setHorizontalAlignment(JAttributeTextField.RIGHT);
        opacityField.putClientProperty("Palette.Component.segmentPosition", "first");
        opacityField.setUI((PaletteFormattedTextFieldUI) PaletteFormattedTextFieldUI.createUI(opacityField));
        opacityField.setFormatterFactory(JavaNumberFormatter.createFormatterFactory(0d, 100d, 100d, true, false));
        opacityField.setHorizontalAlignment(JTextField.LEADING);
        new DrawingAttributeEditorHandler<Double>(CANVAS_FILL_OPACITY, opacityField, editor);
        GridBagConstraints gbc = standartGBC(0, 1);
        gbc.insets = new Insets(3, 0, 0, 0);
        p.add(opacityField, gbc);
    }
    
    private JPanel stateOne(JPanel p){
        p = setUpStandartJPanel(p);
        basicCanvasFillColorBtn(p);
        basicOpacatySlider(p);
        addWidth(p,1,1);
        addHight(p,1,2);
        return p;
    }
    
    private JPanel stateTwo(JPanel p){
        p = setUpStandartJPanel(p);
        JPanel p1 = new JPanel(new GridBagLayout());
        JPanel p2 = new JPanel(new GridBagLayout());
        JPanel p3 = new JPanel(new GridBagLayout());
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        advanceCanvasFillColorBtn(p1);
        opacityField(p1);
        advanceOpacatySlider(p1);
        addWidth(p3, 1, 2);
        addHight(p3, 4, 2);
        p.add(p1, standartGBC(GridBagConstraints.RELATIVE, 0));
        p.add(p2, standartGBC(GridBagConstraints.RELATIVE, 1));
        p.add(p3, standartGBC(GridBagConstraints.RELATIVE, 2));
        return p;
    }
    
    private void advanceCanvasFillColorBtn(JPanel p){
        JAttributeTextField<Color> colorField = createColorField();
        new DrawingAttributeEditorHandler<Color>(CANVAS_FILL_COLOR, colorField, editor);
        GridBagConstraints gbc = standartGBC(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE);
        gbc.gridwidth=2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        p.add(colorField, gbc);
        AbstractButton btn = ButtonFactory.createDrawingColorButton(editor,CANVAS_FILL_COLOR, ButtonFactory.HSV_COLORS, 
                ButtonFactory.HSV_COLORS_COLUMN_COUNT,"attribute.canvasFillColor", labels, null, new Rectangle(3, 3, 10, 10));
        btn.setUI((PaletteButtonUI) PaletteButtonUI.createUI(btn));
        new DrawingComponentRepainter(editor, btn);
        ((JPopupButton) btn).setAction(null, null);
        gbc = standartGBC(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE);
        p.add(btn, gbc);
    }
    
    private JAttributeTextField<Color> createColorField(){
        JAttributeTextField<Color> colorField = new JAttributeTextField<Color>();
        colorField.setColumns(7);
        colorField.setToolTipText(labels.getString("attribute.canvasFillColor.toolTipText"));
        colorField.putClientProperty("Palette.Component.segmentPosition", "first");
        colorField.setUI((PaletteFormattedTextFieldUI) PaletteFormattedTextFieldUI.createUI(colorField));
        colorField.setFormatterFactory(ColorFormatter.createFormatterFactory());
        colorField.setHorizontalAlignment(JTextField.LEFT);
        return colorField;
    }
    
    private JAttributeTextField<Double> createStandartField(JAttributeTextField<Double> field){
        field.setUI((TextUI) PaletteFormattedTextFieldUI.createUI(field));
        field.setColumns(3);
        
        field.setFormatterFactory(JavaNumberFormatter.createFormatterFactory(1d, 4096d, 1d, true, false));
        field.setHorizontalAlignment(JTextField.LEADING);
        return field;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
