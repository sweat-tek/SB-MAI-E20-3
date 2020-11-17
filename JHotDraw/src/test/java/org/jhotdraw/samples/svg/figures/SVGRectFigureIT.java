/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Collection;
import java.util.Random;
import org.jhotdraw.draw.ConnectionFigure;
import org.jhotdraw.draw.Connector;
import org.jhotdraw.draw.Handle;
import org.jhotdraw.geom.Dimension2DDouble;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 45277
 */
public class SVGRectFigureIT {
    
    public SVGRectFigureIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of drawFill method, of class SVGRectFigure.
     */
//    @Test
//    public void testDrawFill() {
//        System.out.println("drawFill");
//        Graphics2D g = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.drawFill(g);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of drawStroke method, of class SVGRectFigure.
//     */
//    @Test
//    public void testDrawStroke() {
//        System.out.println("drawStroke");
//        Graphics2D g = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.drawStroke(g);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getX method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetX() {
//        System.out.println("getX");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getX();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getY method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetY() {
//        System.out.println("getY");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getY();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWidth method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetWidth() {
//        System.out.println("getWidth");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getWidth();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHeight method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetHeight() {
//        System.out.println("getHeight");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getHeight();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getArcWidth method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetArcWidth() {
//        System.out.println("getArcWidth");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getArcWidth();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getArcHeight method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetArcHeight() {
//        System.out.println("getArcHeight");
//        SVGRectFigure instance = new SVGRectFigure();
//        double expResult = 0.0;
//        double result = instance.getArcHeight();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBounds method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetBounds() {
//        System.out.println("getBounds");
//        SVGRectFigure instance = new SVGRectFigure();
//        Rectangle2D.Double expResult = null;
//        Rectangle2D.Double result = instance.getBounds();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDrawingArea method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetDrawingArea() {
//        System.out.println("getDrawingArea");
//        SVGRectFigure instance = new SVGRectFigure();
//        Rectangle2D.Double expResult = null;
//        Rectangle2D.Double result = instance.getDrawingArea();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of contains method, of class SVGRectFigure.
//     */
//    @Test
//    public void testContains() {
//        System.out.println("contains");
//        Point2D.Double p = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        boolean expResult = false;
//        boolean result = instance.contains(p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBounds method, of class SVGRectFigure.
//     */
//    @Test
//    public void testSetBounds() {
//        System.out.println("setBounds");
//        Point2D.Double anchor = null;
//        Point2D.Double lead = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.setBounds(anchor, lead);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of transform method, of class SVGRectFigure.
//     */
//    @Test
//    public void testTransform() {
//        System.out.println("transform");
//        AffineTransform tx = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.transform(tx);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setArc method, of class SVGRectFigure.
//     */
//    @Test
//    public void testSetArc_double_double() {
//        System.out.println("setArc");
//        double w = 0.0;
//        double h = 0.0;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.setArc(w, h);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setArc method, of class SVGRectFigure.
//     */
//    @Test
//    public void testSetArc_Dimension2DDouble() {
//        System.out.println("setArc");
//        Dimension2DDouble arc = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.setArc(arc);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getArc method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetArc() {
//        System.out.println("getArc");
//        SVGRectFigure instance = new SVGRectFigure();
//        Dimension2DDouble expResult = null;
//        Dimension2DDouble result = instance.getArc();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of restoreTransformTo method, of class SVGRectFigure.
//     */
//    @Test
//    public void testRestoreTransformTo() {
//        System.out.println("restoreTransformTo");
//        Object geometry = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.restoreTransformTo(geometry);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTransformRestoreData method, of class SVGRectFigure.
//     */
//    @Test
//    public void testGetTransformRestoreData() {
//        System.out.println("getTransformRestoreData");
//        SVGRectFigure instance = new SVGRectFigure();
//        Object expResult = null;
//        Object result = instance.getTransformRestoreData();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createHandles method, of class SVGRectFigure.
//     */
//    @Test
//    public void testCreateHandles() {
//        System.out.println("createHandles");
//        int detailLevel = 0;
//        SVGRectFigure instance = new SVGRectFigure();
//        Collection<Handle> expResult = null;
//        Collection<Handle> result = instance.createHandles(detailLevel);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of canConnect method, of class SVGRectFigure.
//     */
//    @Test
//    public void testCanConnect() {
//        System.out.println("canConnect");
//        SVGRectFigure instance = new SVGRectFigure();
//        boolean expResult = false;
//        boolean result = instance.canConnect();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findConnector method, of class SVGRectFigure.
//     */
//    @Test
//    public void testFindConnector() {
//        System.out.println("findConnector");
//        Point2D.Double p = null;
//        ConnectionFigure prototype = null;
//        SVGRectFigure instance = new SVGRectFigure();
//        Connector expResult = null;
//        Connector result = instance.findConnector(p, prototype);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findCompatibleConnector method, of class SVGRectFigure.
//     */
//    @Test
//    public void testFindCompatibleConnector() {
//        System.out.println("findCompatibleConnector");
//        Connector c = null;
//        boolean isStartConnector = false;
//        SVGRectFigure instance = new SVGRectFigure();
//        Connector expResult = null;
//        Connector result = instance.findCompatibleConnector(c, isStartConnector);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of clone method, of class SVGRectFigure.
//     */
//    @Test
//    public void testClone() {
//        System.out.println("clone");
//        SVGRectFigure instance = new SVGRectFigure();
//        SVGRectFigure expResult = null;
//        SVGRectFigure result = instance.clone();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of isEmpty method, of class SVGRectFigure.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        
        SVGRectFigure instance = new SVGRectFigure(1,1,0,0,1,1);
        
        boolean result = instance.isEmpty();
        
        assertTrue(result);

    }
  @Test
    public void testBoundaryIsEmpty() {
        System.out.println("isEmpty");
        Random rand = new Random(4);
        boolean expectedResult;
        double weight = rand.nextDouble();
        double height = rand.nextDouble();
        SVGRectFigure instance = new SVGRectFigure(1,1,weight,height,1,1);
        if(weight == 0 || height == 0){
            expectedResult = true;
            
        } else {
            expectedResult = false;
        }
        boolean result = instance.isEmpty();
        
        assertEquals(expectedResult, result);

    }
    /**
     * Test of invalidate method, of class SVGRectFigure.
     */
//    @Test
//    public void testInvalidate() {
//        System.out.println("invalidate");
//        SVGRectFigure instance = new SVGRectFigure();
//        instance.invalidate();
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
