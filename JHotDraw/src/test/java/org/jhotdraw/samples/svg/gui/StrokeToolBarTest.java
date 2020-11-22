package org.jhotdraw.samples.svg.gui;

import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import org.mockito.Mockito.*;

/**
 *
 * @author Karla
 */
public class StrokeToolBarTest {

    DrawingEditor editor;
    StrokeToolBar strokeToolBar;

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
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
        strokeToolBar = new StrokeToolBar();

    }

    @After
    public void tearDown() {
        strokeToolBar = null;
    }

    /**
     * Test of createDisclosedComponent method, of class StrokeToolBar.
     */
    @Test
    public void testCreateDisclosedComponent() {

        strokeToolBar.editor = editor;

        JComponent expResult = null;
        JComponent result = null;

        //If state!=1 or state!=2, then the method should return null 
        //Test state<1
        int state = 0;
        result = strokeToolBar.createDisclosedComponent(state);
        assertEquals(expResult, result);

        // test state>2 
        state = 3;
        result = strokeToolBar.createDisclosedComponent(state);
        assertEquals(expResult, result);

        // test state = 1   
        state = 1;
        expResult = new JPanel();
        result = strokeToolBar.createDisclosedComponent(state);
        assertTrue(expResult.getClass().equals(result.getClass()));

        //test 2   
        state = 2;
        result = strokeToolBar.createDisclosedComponent(state);
        assertTrue(expResult.getClass().equals(result.getClass()));
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
        strokeToolBar = new StrokeToolBar();
        strokeToolBar.createLayout(); // sets border 
        EmptyBorder actBorder = (EmptyBorder) strokeToolBar.getJPanel().getBorder();
        Insets actInsets = actBorder.getBorderInsets();

        // test
        boolean areEqual = expInsets.equals(actInsets);
        assertTrue(areEqual);
    }
}
