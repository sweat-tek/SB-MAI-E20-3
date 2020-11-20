/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author madsm
 */
public class PaletteSizeJGivenTest extends ScenarioTest<TestPaletteSizeGivenState, TestPaletteSizeWhenState, TestPaletteSizeThenState> {

    @Test
    public void PaletteSizeTest() {

        given()
                .aDimension();
        when()
                .TheSliderHasHorizontalProperties();
        then()
                .TheSliderWillBeHorizontal();
    }

}
