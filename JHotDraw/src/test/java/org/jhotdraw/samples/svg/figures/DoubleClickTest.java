package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

public class DoubleClickTest extends ScenarioTest<GivenAPathWithOneChild, WhenThePathIsDoubleclicked, ThenANodeWillBeAdded> {

    @Test
    public void aFirstLoginTest() {
        given()
                .a_Path_with_one_Child()
                .and()
                .the_Child_has_two_Points();

        when()
                .the_Path_is_doubleclicked();
        then()
                .a_Node_will_be_added();
    }
}
