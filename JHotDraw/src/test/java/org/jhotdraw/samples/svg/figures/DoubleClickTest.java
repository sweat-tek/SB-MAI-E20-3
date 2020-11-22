package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

public class DoubleClickTest extends ScenarioTest<GivenAPathWithOneChild, WhenThePathIsDoubleclicked, ThenANodeWillBeAdded> {

    @Test
    public void additionOfANodeWhenDoubleclickingTest() {
        given()
                .aPathWithOneChild()
                .and()
                .twoPointsAreAddedToTheChild();

        when()
                .thePathIsDoubleclicked();
        then()
                .aNodeWillBeAdded();
    }
}
