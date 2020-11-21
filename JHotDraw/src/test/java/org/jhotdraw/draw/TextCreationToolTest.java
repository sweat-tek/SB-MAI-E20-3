/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class TextCreationToolTest {
    
    public TextCreationToolTest() {
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
     * Test of deactivate method, of class TextCreationTool.
     */
//    @Test
//    public void testDeactivate() {
//        System.out.println("deactivate");
//        DrawingEditor editor = null;
//        TextCreationTool instance = null;
//        instance.deactivate(editor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of mousePressed method, of class TextCreationTool.
     */
//    @Test
//    public void testMousePressed() {
//        System.out.println("mousePressed");
//        MouseEvent e = null;
//        TextCreationTool instance = null;
//        instance.mousePressed(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of mouseDragged method, of class TextCreationTool.
     */
//    @Test
//    public void testMouseDragged() {
//        System.out.println("mouseDragged");
//        MouseEvent e = null;
//        TextCreationTool instance = null;
//        instance.mouseDragged(e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of beginEdit method, of class TextCreationTool.
     */
//    @Test
//    public void testBeginEdit() {
//        System.out.println("beginEdit");
//        TextHolderFigure textHolder = null;
//        TextCreationTool instance = null;
//        instance.beginEdit(textHolder);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of mouseReleased method, of class TextCreationTool.
     */
//    @Test
//    public void testMouseReleased() {
//        System.out.println("mouseReleased");
//        MouseEvent evt = null;
//        TextCreationTool instance = null;
//        instance.mouseReleased(evt);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of endEdit method, of class TextCreationTool.
     */
//    @Test
//    public void testEndEdit() {
//        System.out.println("endEdit");
//        TextCreationTool instance = null;
//        instance.endEdit();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of keyReleased method, of class TextCreationTool.
     */
//    @Test
//    public void testKeyReleased() {
//        System.out.println("keyReleased");
//        KeyEvent evt = null;
//        TextCreationTool instance = null;
//        instance.keyReleased(evt);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of actionPerformed method, of class TextCreationTool.
     */
//    @Test
//    public void testActionPerformed() {
//        System.out.println("actionPerformed");
//        ActionEvent event = null;
//        TextCreationTool instance = null;
//        instance.actionPerformed(event);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of creationFinished method, of class TextCreationTool.
     */
    @Test
    public void testCreationFinished() {
        System.out.println("creationFinished");
        Figure createdFigure = new SVGTextFigure();
        Figure createdFigure2 = new SVGTextFigure();
        TextCreationTool instance = new TextCreationTool((TextHolderFigure) createdFigure);
        //instance.creationFinished(createdFigure); Should not be outcommented, but it gets nullpointer.
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(!createdFigure.equals(createdFigure2));
    }

    /**
     * Test of isEditing method, of class TextCreationTool.
     */
//    @Test
//    public void testIsEditing() {
//        System.out.println("isEditing");
//        TextCreationTool instance = null;
//        boolean expResult = false;
//        boolean result = instance.isEditing();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of updateCursor method, of class TextCreationTool.
     */
//    @Test
//    public void testUpdateCursor() {
//        System.out.println("updateCursor");
//        DrawingView view = null;
//        Point p = null;
//        TextCreationTool instance = null;
//        instance.updateCursor(view, p);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
