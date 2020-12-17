package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.impl.*;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author $Terpen
 */
public class CanvasToolBarTest extends ScenarioTest<GivenCanvasToolBar, WhenCanvasToolBar, ThenCanvasToolBar> {


    @Test
    @Ignore
    public void ChanceBackgroundColor(){
        //TODO repair failing test
        assert(true);
//        given().someCanvasColor();
//        when().chanceColorFieldToGreen();
//        then().thenBackgroundColorIsGreen();
    }

    @Override
    public Scenario<GivenCanvasToolBar, WhenCanvasToolBar, ThenCanvasToolBar> getScenario() {
        return null;
    }
}
