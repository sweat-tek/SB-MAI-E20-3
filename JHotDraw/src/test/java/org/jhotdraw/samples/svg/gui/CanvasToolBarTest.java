package org.jhotdraw.samples.svg.gui;

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
        given().someCanvasColor();
        when().chanceColorFieldToGreen();
        then().thenBackgroundColorIsGreen();
        
    }
}
