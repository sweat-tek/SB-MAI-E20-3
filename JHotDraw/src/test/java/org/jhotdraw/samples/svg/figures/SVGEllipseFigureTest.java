/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Patrick
 */
public class SVGEllipseFigureTest {
    private SVGEllipseFigure ef;
    public SVGEllipseFigureTest() {
    }

    @Before
    public void setUp() throws Exception {
        ef = new SVGEllipseFigure(0,0,1,2.5);
    }
    
    @Test
    public void testGetBounds() {
        Rectangle2D.Double actual = ef.getBounds();
        Rectangle2D.Double compare = new Rectangle2D.Double(0, 0, 1, 2.5);
        assertEquals(compare, actual);
    }
    
}
