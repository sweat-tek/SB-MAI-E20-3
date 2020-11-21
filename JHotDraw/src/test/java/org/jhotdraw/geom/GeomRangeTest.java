/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicol
 */
public class GeomRangeTest {
    
    public GeomRangeTest() {
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
     * Test of lineContainsPoint method, of class Geom.
     */
//    @Test
//    public void testLineContainsPoint_6args() {
//        System.out.println("lineContainsPoint");
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 0;
//        int y2 = 0;
//        int px = 0;
//        int py = 0;
//        boolean expResult = false;
//        boolean result = Geom.lineContainsPoint(x1, y1, x2, y2, px, py);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lineContainsPoint method, of class Geom.
//     */
//    @Test
//    public void testLineContainsPoint_7args_1() {
//        System.out.println("lineContainsPoint");
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 0;
//        int y2 = 0;
//        int px = 0;
//        int py = 0;
//        double tolerance = 0.0;
//        boolean expResult = false;
//        boolean result = Geom.lineContainsPoint(x1, y1, x2, y2, px, py, tolerance);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lineContainsPoint method, of class Geom.
//     */
//    @Test
//    public void testLineContainsPoint_7args_2() {
//        System.out.println("lineContainsPoint");
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 0.0;
//        double y2 = 0.0;
//        double px = 0.0;
//        double py = 0.0;
//        double tolerance = 0.0;
//        boolean expResult = false;
//        boolean result = Geom.lineContainsPoint(x1, y1, x2, y2, px, py, tolerance);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of direction method, of class Geom.
//     */
//    @Test
//    public void testDirection_4args_1() {
//        System.out.println("direction");
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 0;
//        int y2 = 0;
//        int expResult = 0;
//        int result = Geom.direction(x1, y1, x2, y2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of direction method, of class Geom.
//     */
//    @Test
//    public void testDirection_4args_2() {
//        System.out.println("direction");
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 0.0;
//        double y2 = 0.0;
//        int expResult = 0;
//        int result = Geom.direction(x1, y1, x2, y2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of outcode method, of class Geom.
//     */
//    @Test
//    public void testOutcode_Rectangle_Rectangle() {
//        System.out.println("outcode");
//        Rectangle r1 = null;
//        Rectangle r2 = null;
//        int expResult = 0;
//        int result = Geom.outcode(r1, r2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of outcode method, of class Geom.
//     */
//    @Test
//    public void testOutcode_Rectangle2DDouble_Rectangle2DDouble() {
//        System.out.println("outcode");
//        Rectangle2D.Double r1 = null;
//        Rectangle2D.Double r2 = null;
//        int expResult = 0;
//        int result = Geom.outcode(r1, r2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of south method, of class Geom.
//     */
//    @Test
//    public void testSouth_Rectangle() {
//        System.out.println("south");
//        Rectangle r = null;
//        Point expResult = null;
//        Point result = Geom.south(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of south method, of class Geom.
//     */
//    @Test
//    public void testSouth_Rectangle2DDouble() {
//        System.out.println("south");
//        Rectangle2D.Double r = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.south(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of center method, of class Geom.
//     */
//    @Test
//    public void testCenter_Rectangle() {
//        System.out.println("center");
//        Rectangle r = null;
//        Point expResult = null;
//        Point result = Geom.center(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of center method, of class Geom.
//     */
//    @Test
//    public void testCenter_Rectangle2DDouble() {
//        System.out.println("center");
//        Rectangle2D.Double r = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.center(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of chop method, of class Geom.
//     */
//    @Test
//    public void testChop() {
//        System.out.println("chop");
//        Shape shape = null;
//        Point2D.Double p = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.chop(shape, p);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of west method, of class Geom.
//     */
//    @Test
//    public void testWest_Rectangle() {
//        System.out.println("west");
//        Rectangle r = null;
//        Point expResult = null;
//        Point result = Geom.west(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of west method, of class Geom.
//     */
//    @Test
//    public void testWest_Rectangle2DDouble() {
//        System.out.println("west");
//        Rectangle2D.Double r = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.west(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of east method, of class Geom.
//     */
//    @Test
//    public void testEast_Rectangle() {
//        System.out.println("east");
//        Rectangle r = null;
//        Point expResult = null;
//        Point result = Geom.east(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of east method, of class Geom.
//     */
//    @Test
//    public void testEast_Rectangle2DDouble() {
//        System.out.println("east");
//        Rectangle2D.Double r = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.east(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of north method, of class Geom.
//     */
//    @Test
//    public void testNorth_Rectangle() {
//        System.out.println("north");
//        Rectangle r = null;
//        Point expResult = null;
//        Point result = Geom.north(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of north method, of class Geom.
//     */
//    @Test
//    public void testNorth_Rectangle2DDouble() {
//        System.out.println("north");
//        Rectangle2D.Double r = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.north(r);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of range method, of class Geom.
     */
    @Test
    public void testRange_3args() {
        Random rand = new Random(1000000000);
        System.out.println("range");
        int min = 0;
        int max = 1000000000;
        int value = rand.nextInt(1000000000);
        assertTrue(value >= min && value <= max);
        }     
    
        @Test
    public void testRange_BoundaryCase() {
        System.out.println("range");
        int min = 0;
        int max = 10;
        int value = 80;
        int expResult = 10;
        int result = Geom.range(min, max, value);
        assertEquals(expResult, result);
    }


    /**
     * Test of range method, of class Geom.
     */
//    @Test
//    public void testRange_3args_2() {
//        System.out.println("range");
//        double min = 0.0;
//        double max = 0.0;
//        double value = 0.0;
//        double expResult = 0.0;
//        double result = Geom.range(min, max, value);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of length2 method, of class Geom.
     */
//    @Test
//    public void testLength2_4args_1() {
//        System.out.println("length2");
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 0;
//        int y2 = 0;
//        long expResult = 0L;
//        long result = Geom.length2(x1, y1, x2, y2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of length method, of class Geom.
//     */
//    @Test
//    public void testLength_4args_1() {
//        System.out.println("length");
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 0;
//        int y2 = 0;
//        long expResult = 0L;
//        long result = Geom.length(x1, y1, x2, y2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of length2 method, of class Geom.
//     */
//    @Test
//    public void testLength2_4args_2() {
//        System.out.println("length2");
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 0.0;
//        double y2 = 0.0;
//        double expResult = 0.0;
//        double result = Geom.length2(x1, y1, x2, y2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of length method, of class Geom.
//     */
//    @Test
//    public void testLength_4args_2() {
//        System.out.println("length");
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 0.0;
//        double y2 = 0.0;
//        double expResult = 0.0;
//        double result = Geom.length(x1, y1, x2, y2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of length method, of class Geom.
//     */
//    @Test
//    public void testLength_Point2DDouble_Point2DDouble() {
//        System.out.println("length");
//        Point2D.Double p1 = null;
//        Point2D.Double p2 = null;
//        double expResult = 0.0;
//        double result = Geom.length(p1, p2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cap method, of class Geom.
//     */
//    @Test
//    public void testCap() {
//        System.out.println("cap");
//        Point2D.Double p1 = null;
//        Point2D.Double p2 = null;
//        double radius = 0.0;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.cap(p1, p2, radius);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of pointToAngle method, of class Geom.
//     */
//    @Test
//    public void testPointToAngle_Rectangle_Point() {
//        System.out.println("pointToAngle");
//        Rectangle r = null;
//        Point p = null;
//        double expResult = 0.0;
//        double result = Geom.pointToAngle(r, p);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of pointToAngle method, of class Geom.
//     */
//    @Test
//    public void testPointToAngle_Rectangle2DDouble_Point2DDouble() {
//        System.out.println("pointToAngle");
//        Rectangle2D.Double r = null;
//        Point2D.Double p = null;
//        double expResult = 0.0;
//        double result = Geom.pointToAngle(r, p);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of angle method, of class Geom.
//     */
//    @Test
//    public void testAngle() {
//        System.out.println("angle");
//        double x1 = 0.0;
//        double y1 = 0.0;
//        double x2 = 0.0;
//        double y2 = 0.0;
//        double expResult = 0.0;
//        double result = Geom.angle(x1, y1, x2, y2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of angleToPoint method, of class Geom.
//     */
//    @Test
//    public void testAngleToPoint_Rectangle_double() {
//        System.out.println("angleToPoint");
//        Rectangle r = null;
//        double angle = 0.0;
//        Point expResult = null;
//        Point result = Geom.angleToPoint(r, angle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of angleToPoint method, of class Geom.
//     */
//    @Test
//    public void testAngleToPoint_Rectangle2DDouble_double() {
//        System.out.println("angleToPoint");
//        Rectangle2D.Double r = null;
//        double angle = 0.0;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.angleToPoint(r, angle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of polarToPoint method, of class Geom.
//     */
//    @Test
//    public void testPolarToPoint() {
//        System.out.println("polarToPoint");
//        double angle = 0.0;
//        double fx = 0.0;
//        double fy = 0.0;
//        Point expResult = null;
//        Point result = Geom.polarToPoint(angle, fx, fy);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of polarToPoint2D method, of class Geom.
//     */
//    @Test
//    public void testPolarToPoint2D() {
//        System.out.println("polarToPoint2D");
//        double angle = 0.0;
//        double fx = 0.0;
//        double fy = 0.0;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.polarToPoint2D(angle, fx, fy);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ovalAngleToPoint method, of class Geom.
//     */
//    @Test
//    public void testOvalAngleToPoint_Rectangle_double() {
//        System.out.println("ovalAngleToPoint");
//        Rectangle r = null;
//        double angle = 0.0;
//        Point expResult = null;
//        Point result = Geom.ovalAngleToPoint(r, angle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ovalAngleToPoint method, of class Geom.
//     */
//    @Test
//    public void testOvalAngleToPoint_Rectangle2DDouble_double() {
//        System.out.println("ovalAngleToPoint");
//        Rectangle2D.Double r = null;
//        double angle = 0.0;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.ovalAngleToPoint(r, angle);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of intersect method, of class Geom.
//     */
//    @Test
//    public void testIntersect_IntersectData() {
//        System.out.println("intersect");
//        IntersectData id = null;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.intersect(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of intersect method, of class Geom.
//     */
//    @Test
//    public void testIntersect_9args() {
//        System.out.println("intersect");
//        double xa = 0.0;
//        double ya = 0.0;
//        double xb = 0.0;
//        double yb = 0.0;
//        double xc = 0.0;
//        double yc = 0.0;
//        double xd = 0.0;
//        double yd = 0.0;
//        double limit = 0.0;
//        Point2D.Double expResult = null;
//        Point2D.Double result = Geom.intersect(xa, ya, xb, yb, xc, yc, xd, yd, limit);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of distanceFromLine method, of class Geom.
//     */
//    @Test
//    public void testDistanceFromLine() {
//        System.out.println("distanceFromLine");
//        int xa = 0;
//        int ya = 0;
//        int xb = 0;
//        int yb = 0;
//        int xc = 0;
//        int yc = 0;
//        double expResult = 0.0;
//        double result = Geom.distanceFromLine(xa, ya, xb, yb, xc, yc);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of grow method, of class Geom.
//     */
//    @Test
//    public void testGrow() {
//        System.out.println("grow");
//        Rectangle2D.Double r = null;
//        double h = 0.0;
//        double v = 0.0;
//        Geom.grow(r, h, v);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of contains method, of class Geom.
//     */
//    @Test
//    public void testContains_Rectangle2DDouble_Rectangle2DDouble() {
//        System.out.println("contains");
//        Rectangle2D.Double r1 = null;
//        Rectangle2D.Double r2 = null;
//        boolean expResult = false;
//        boolean result = Geom.contains(r1, r2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of contains method, of class Geom.
//     */
//    @Test
//    public void testContains_Rectangle2D_Rectangle2D() {
//        System.out.println("contains");
//        Rectangle2D r1 = null;
//        Rectangle2D r2 = null;
//        boolean expResult = false;
//        boolean result = Geom.contains(r1, r2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
