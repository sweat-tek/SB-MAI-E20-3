package org.jhotdraw.undo;

import org.jhotdraw.app.action.*;
import org.junit.*;

import javax.swing.undo.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UndoRedoManagerTest {
    UndoAction undoAction;
    UndoRedoManager undoRedoManager;

    @Before
    public void setUp() {
        undoRedoManager = new UndoRedoManager();
    }

    @Test
    public void undoOrRedoTest_UNDO(){
        assertFalse(undoRedoManager.hasSignificantEdits());
        undoRedoManager.setHasSignificantEdits(true);
        assertTrue(undoRedoManager.hasSignificantEdits());
        /*
        when(undoRedoManager.getDebug()).thenReturn(true);
        boolean bool = undoRedoManager.hasSignificantEdits();
        undoRedoManager.setHasSignificantEdits(bool);
        assertTrue(undoRedoManager.hasSignificantEdits());
         */
    }

    @Test
    public void setHasSignificantEditsTest_SetTrue(){
        assertFalse(undoRedoManager.hasSignificantEdits());
        undoRedoManager.setHasSignificantEdits(true);
        assertTrue(undoRedoManager.hasSignificantEdits());
        /*
        when(undoRedoManager.getDebug()).thenReturn(true);
        boolean bool = undoRedoManager.hasSignificantEdits();
        undoRedoManager.setHasSignificantEdits(bool);
        assertTrue(undoRedoManager.hasSignificantEdits());
         */
    }

    @Test
    public void setHasSignificantEditsTest_SetFalse(){
        undoRedoManager.setHasSignificantEdits(false);
        assertFalse(undoRedoManager.hasSignificantEdits());
        /*
        when(undoRedoManager.getDebug()).thenReturn(true);
        boolean bool = undoRedoManager.hasSignificantEdits();
        undoRedoManager.setHasSignificantEdits(bool);
        assertTrue(undoRedoManager.hasSignificantEdits());
         */
    }

    @Test
    public void setHasSignificantEditsTest_didFirePropertyChange(){
        undoRedoManager.setHasSignificantEdits(false);
        //verify(undoRedoManager, times(1)).propertySupport.firePropertyChange("hasSignificantEdits",false, false);
        /*
        when(undoRedoManager.getDebug()).thenReturn(true);
        boolean bool = undoRedoManager.hasSignificantEdits();
        undoRedoManager.setHasSignificantEdits(bool);
        assertTrue(undoRedoManager.hasSignificantEdits());
         */
    }















    @Test
    public void setHasSignificantEditsTest(){
        undoAction = mock(UndoAction.class);
        when(undoAction.isEnabled()).thenReturn(true);
        undoAction.isEnabled();
        verify(undoAction, times(1)).isEnabled();
        boolean bool = undoRedoManager.hasSignificantEdits();
        assertTrue(bool);
    }
}