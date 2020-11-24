/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Patrick
 */
public class EllipseToolDrawAcceptanceTest extends ScenarioTest<GivenMousePressedAndDragged, WhenMouseIsReleased, ThenAnEllipseIsDrawn> {
    @Test
    @Ignore
    public void EllipseToolDrawTest(){
        given().mousePressedAndDragged();
        when().mouseReleased();
        then().figureCreated();
    }
}
