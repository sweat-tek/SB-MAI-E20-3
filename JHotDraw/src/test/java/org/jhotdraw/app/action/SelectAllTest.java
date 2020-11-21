/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.impl.Scenario;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author theun
 */
public class SelectAllTest extends ScenarioTest<GivenFigure, WhenAutomaticSelectionIsUsed,ThenFigureIsSelected>{

    /**
     * @param args the command line arguments
     */
    @Test
    public void selectedAllTest() {
        given().GivenFigureMethod();
        when().WhenAutomaticSelectionIsUsedMethod();
        then().ThenFigureIsSelectedMethod();
    }


}
