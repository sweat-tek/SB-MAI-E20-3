/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.util.ResourceBundleUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.mockito.Mockito.mock;
//import org.mockito.Mockito.mock;
//import org.mockito.Mockito.mock;

/**
 *
 * @author Karla
 */
public class StrokeToolBarTest {

    static public StrokeToolBar instance;

    public StrokeToolBarTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new StrokeToolBar();
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
     * Test of createLayout method, of class StrokeToolBar.
     */
    @Test
    public void testCreateLayoutBorderDimensionsAreCorrect() {
        System.out.println("testCreateLayoutBorderDimensionsAreCorrect");

        // expected border value top, left, buttom, right
        EmptyBorder expBorder = new EmptyBorder(5, 5, 5, 8);
        Insets expInsets = expBorder.getBorderInsets();

        //actual border values 
        instance = new StrokeToolBar();
        instance.createLayout(); // sets border 
        EmptyBorder actBorder = (EmptyBorder) instance.getJPanel().getBorder();
        Insets actInsets = actBorder.getBorderInsets();

        // test
        boolean areEqual = expInsets.equals(actInsets);
        assertTrue(areEqual);
    }

}
