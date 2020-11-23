/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Point;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import org.apache.batik.ext.awt.LinearGradientPaint;
import org.apache.batik.ext.awt.MultipleGradientPaint;

/**
 *
 * @author pradeepthayaparan
 */
public class PaletteUtility implements Border, UIResource {

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

    }

    public void doPaint(Graphics2D g, DrawBorder b, Color[] stopColors, float[] stops) {

        Point position = b.getPosition();

        LinearGradientPaint lgp = new LinearGradientPaint(
                new Point2D.Float(position.x, position.y), new Point2D.Float(position.x, position.y + b.getHeight() - 1),
                stops, stopColors,
                MultipleGradientPaint.REPEAT,
                MultipleGradientPaint.LINEAR_RGB);
        g.setPaint(lgp);
        g.fillRect(position.x + 1, position.y + 1, b.getWidth() - 2, b.getHeight() - 2);
        System.out.println("position.x " + position.x);
        System.out.println("b.getWidth()" + b.getWidth()); 
        

    }

    protected String getSegmentPosition(Component c) {
        String segmentPosition = null;
        if (c instanceof JComponent) {
            segmentPosition = (String) ((JComponent) c).getClientProperty("Palette.Component.segmentPosition");
        }
        return (segmentPosition == null) ? "only" : segmentPosition;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        Insets insets;
        String segmentPosition = getSegmentPosition(c);
        if (segmentPosition == "first"
                || segmentPosition == "middle") {
            insets = new Insets(3, 3, 3, 2);
        } else {
            insets = new Insets(3, 3, 3, 3);
        }
        return insets;

    }

    @Override
    public boolean isBorderOpaque() {
        return true;

    }

}
