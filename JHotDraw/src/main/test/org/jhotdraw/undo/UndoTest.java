package org.jhotdraw.undo;

import com.tngtech.jgiven.junit.*;
import org.junit.*;

import static org.mockito.Mockito.mock;

public class UndoTest extends ScenarioTest<GivenABezierPath, WhenUndoActionIsPerformed, ThenANodeWillBeRemoved> {

    @Test
    public void aFirstLoginTest() {
        given()
                .a_Path_with_one_Child()
                .and()
                .the_Child_has_two_Points()
                .and()
                .a_Node_will_be_added();

        when()
                .undo_action_is_performed();
        then()
                .a_Node_will_be_removed();
    }
}