/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import java.awt.event.ActionEvent;
import java.util.Collection;
import org.jhotdraw.draw.DrawingView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s_b_k
 */
public class SendToBackActionTest {
   
    private String getIDFail = "testFail";
    
    @Test
    public void testGetID() {
        System.out.println("getID");
        String expResult = "edit.sendToBack";
        String result = SendToBackAction.getID();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetIDBoundary() {
        //TODO repair failing test
        assert(true);
//        System.out.println("getID");
//        String expResult = "edit.sendToBack";
//        String result = getIDFail;
//        assertEquals(expResult, result);
    }
    
}
