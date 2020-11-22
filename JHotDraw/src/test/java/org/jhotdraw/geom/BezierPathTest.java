/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Denmads
 */
public class BezierPathTest {
    
    public BezierPathTest() {
    }
    
    private BezierPath path;
    
    @Before
    public void setupPath () {
        path = new BezierPath();
    }

    @Test
    public void testGetBounds2DSingleLine() {
        path.add(new Point2D.Double(0, 0));
        path.add(new Point2D.Double(5, 3));
        Rectangle2D.Double calculatedBounds = path.getBounds2D();
        Rectangle2D.Double expectedBounds = new Rectangle2D.Double(0, 0, 5, 3);
        assertEquals(expectedBounds, calculatedBounds);
    }
    
    @Test
    public void testGetBounds2DTwoLines() {
        path.add(new Point2D.Double(0, 0));
        path.add(new Point2D.Double(5, 3));
        path.add(new Point2D.Double(3, 5));
        Rectangle2D.Double calculatedBounds = path.getBounds2D();
        Rectangle2D.Double expectedBounds = new Rectangle2D.Double(0, 0, 5, 5);
        assertEquals(expectedBounds, calculatedBounds);
    }
}
    