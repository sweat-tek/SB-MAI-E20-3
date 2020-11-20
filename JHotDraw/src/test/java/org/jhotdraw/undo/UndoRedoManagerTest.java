package org.jhotdraw.undo;

import org.jhotdraw.app.action.*;
import org.junit.*;

import javax.swing.undo.*;

import java.security.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UndoRedoManagerTest {
    UndoRedoManager undoRedoManager;

    @Before
    public void setUp() {
        undoRedoManager = new UndoRedoManager();
    }

    @Test
    public void undoOrRedoTest_UNDO(){
        UndoRedoManager.UndoRedoAction action = undoRedoManager.undoOrRedo(UndoRedoManager.UndoRedoAction.UNDO);
        assertEquals(action, UndoRedoManager.UndoRedoAction.UNDO);
    }

    @Test
    public void undoOrRedoTest_REDO(){
        UndoRedoManager.UndoRedoAction action = undoRedoManager.undoOrRedo(UndoRedoManager.UndoRedoAction.REDO);
        assertEquals(action, UndoRedoManager.UndoRedoAction.REDO);
    }

    @Test
    public void undoOrRedoTest_UNDO_OR_REDO(){
        UndoRedoManager.UndoRedoAction action = undoRedoManager.undoOrRedo(UndoRedoManager.UndoRedoAction.UNDO_OR_REDO);
        assertEquals(action, UndoRedoManager.UndoRedoAction.UNDO_OR_REDO);
    }

    @Test
    public void undoOrRedoTest_null(){
        UndoRedoManager.UndoRedoAction action = undoRedoManager.undoOrRedo(null);
        assertEquals(action, null);
    }

    @Test
    public void undoOrRedoTest_other(){
        try{
            undoRedoManager.undoOrRedo(UndoRedoManager.UndoRedoAction.TEST);
            fail();
        } catch (InvalidParameterException e){
            System.out.println(e.getMessage());
        }
    }

    /*
    @Test
    public void test(){
        assertTrue(true);
    }
    */
}