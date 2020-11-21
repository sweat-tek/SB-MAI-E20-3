/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theun
 */
public class SelectAllActionTest {

    public SelectAllActionTest() {
    }

    @Test
    public void testSelectionSuccess() {
        SelectAllAction testClass = new SelectAllAction();

        JEditorPane Jpane = new JEditorPane();

        assertEquals(true, testClass.selectionSuccess(Jpane));
        assertEquals(false, testClass.selectionSuccess(null));

    }

}
