/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author s_b_k
 */
public class BringToFrontActionTest {

    private String failID = "fail ID for boundary test";

    @Test
    public void testGetID() {
        System.out.println("getID");
        String expResult = "edit.bringToFront";
        String result = BringToFrontAction.getID();
        assertEquals(expResult, result);

    }

    @Test
    @Ignore
    public void testGetIDBoundary() {
        System.out.println("getID");
        String expResult = "edit.bringToFront";
        String result = failID;
        assertEquals(expResult, result);
    }

}