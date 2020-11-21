package org.jhotdraw.geom;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Denmads
 */
public class BezierToolDrawAcceptanceTest extends ScenarioTest<GivenMousePressedAndMouseDragged, WhenMouseReleased, ThenBezierFigureIsCreated>{
    
    @Test
    public void bezierToolDrawTest() {
        System.out.println("BezierTool draw acceptance test");
        
        given().mousePressedAndMouseDragged();
        when().mouseReleased();
        then().figureIsCreated();
    }
}
