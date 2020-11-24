/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author menta
 */
public class AlignJGivenTest extends ScenarioTest<GivenAFigureAndSelectionBounds, WhenTheDirectionEastIsChosen, ThenTheFigureWillBeAlignedEast>{
    
    @Test
    @Ignore
    public void alignFigureEastTest(){
        given()
                .aFigure()
                .and()
                .selectionBounds();
        
        when()
                .theDirectionEastIsChosen();
        
        then()
                .theFigureWillBeAlignedEast();
    }
    
}
