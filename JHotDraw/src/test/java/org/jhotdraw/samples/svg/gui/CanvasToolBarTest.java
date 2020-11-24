package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.base.ScenarioTestBase;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 * @author $Terpen
 */
public class CanvasToolBarTest extends ScenarioTest<GivenCanvasToolBar, WhenCanvasToolBar, ThenCanvasToolBar>{

    @Test
    public void ChanceBackgroundColor(){
        given().someCanvasColor();
        when().chanceColorFieldToGreen();
        then().thenBackgroundColorIsGreen();
    }
}
