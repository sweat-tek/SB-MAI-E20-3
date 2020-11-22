/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Stroke;
import org.jhotdraw.*;
import static org.jhotdraw.draw.AttributeKeys.IS_STROKE_DASH_FACTOR;
import static org.jhotdraw.draw.AttributeKeys.STROKE_DASHES;
import static org.jhotdraw.draw.AttributeKeys.STROKE_DASH_PHASE;
import static org.jhotdraw.draw.AttributeKeys.STROKE_WIDTH;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author jonas
 */
public class AttributeKeysTest {

    public AttributeKeysTest() {
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


    @Test
    public void testGetStroke() {
        System.out.println("getStroke");
        LineFigure f = new LineFigure();      
        Stroke result = AttributeKeys.getStroke(f);
        System.out.println(result.getClass());
        assertEquals(result.getClass().toString(), "class java.awt.BasicStroke");
    }

    @Test
    public void testisAllZeroes() {
        System.out.println("isAllZeroes");
        float[] input = null;
        boolean result = AttributeKeys.isAllZeroes(input);
        assertEquals(result,true);
    }

    @Test
    public void testcreateDashes() {
        System.out.println("createDashes");
        //Dashes dash = null;
        Dashes dash = new Dashes(1,1, new double[]{1.0,-1.0,3.0});
        AttributeKeys.createDashes(dash);
        assertTrue(dash.getDashPhase()>0);
    }

}
