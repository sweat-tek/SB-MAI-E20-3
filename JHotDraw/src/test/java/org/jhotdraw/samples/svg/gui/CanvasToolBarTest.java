package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.base.ScenarioTestBase;
import org.junit.Test;

/**
 * @author $Terpen
 */
public class CanvasToolBarTest extends ScenarioTestBase<GivenCanvasToolBar, WhenCanvasToolBar, ThenCanvasToolBar>{

    @Test
    public void ChanceBackgroundColor(){
        given().someCanvasColor();
        when().chanceColorFieldToGreen();
        then().thenBackgroundColorIsGreen();
        
    }
}
