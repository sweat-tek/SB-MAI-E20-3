/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import java.awt.Color;
import javax.swing.JComponent;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terpen
 */
public class CanvasToolBarIT {
    
    public CanvasToolBarIT() {
        
    }
    private static DrawingEditor editor;
    @BeforeClass
    public static void setUpClass() {
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
        
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
     * Test of createDisclosedComponent method, of class CanvasToolBar.
     */
    @Test
    public void testCreateDisclosedComponent() {
        System.out.println("createDisclosedComponent");
        int state = 0;
        CanvasToolBar instance = new CanvasToolBar();
        instance.editor = editor;
        JComponent expResult = null;
        JComponent result = null;
        for (int i = 0; i < 12; i++) {
            state = ((state == 2) ? 0 : state+1);
            result = instance.createDisclosedComponent(state);
        }
        //editor.setHandleAttribute(AttributeKeys.CANVAS_WIDTH, 100);
        
        assertEquals(expResult, result);
        result = instance.createDisclosedComponent(1);
        editor.setHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR, Color.BLUE);
        //System.out.println(editor.setHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR, color));
        System.out.println(editor.getHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR));
    }
    
}
