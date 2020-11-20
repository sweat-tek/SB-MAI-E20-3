/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s_b_k
 */
public class ArrangeAcceptanceTest extends ScenarioTest<GivenAFigure, WhenSendToBack, ThenFigureIsAtTheBack> {
    
    @Test
    public void sendToBackAcceptanceTest() {
        given().aFigure();
        when().sendToBack();
        then().figureIsSendToBack();
    }
}
