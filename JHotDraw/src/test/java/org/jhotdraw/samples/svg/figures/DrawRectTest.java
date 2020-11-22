package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

public class DrawRectTest extends ScenarioTest<GivenARectTool, WhenTheRectToolHaveLegalBounds, ThenARectWillBeDrawed> {
    
    
    @Test
    public void drawRectTest(){
        
        
        given().aRectTool();
        
        
        when().theRectToolHaveLegalBounds();
        
        then().aRectWillBeDrawed();
        
        
        
    }
    
}
