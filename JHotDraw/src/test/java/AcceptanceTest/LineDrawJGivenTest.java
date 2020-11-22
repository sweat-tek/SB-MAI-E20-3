/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author jonas
 */
public class LineDrawJGivenTest extends ScenarioTest<GivenALineTool, WhenThereIsTwoPoints, ThenALineIsDrawn> {

    @Test
    public void something_should_happen() {
        given().aLineTool();
        when().thereIsTwoPoints();
        then().aLineIsDrawn();
    }
}
