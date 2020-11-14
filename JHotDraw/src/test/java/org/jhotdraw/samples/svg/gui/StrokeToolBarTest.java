/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.util.ResourceBundleUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karla
 */
public class StrokeToolBarTest {
    
    public StrokeToolBarTest() {
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

    @RunWith(Paramterized.class)
    public class stateClassTest{
        private int state;
        private int expectedState;
        
    }
    
    


    /**
     * Test of createDisclosedComponent method, of class StrokeToolBar.
     */
    @Test
    public void testCreateDisclosedComponent() {
        System.out.println("createDisclosedComponent");
        int state = 0;
        StrokeToolBar instance = new StrokeToolBar();
        JComponent expResult = null;
        JComponent result = instance.createDisclosedComponent(state);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
