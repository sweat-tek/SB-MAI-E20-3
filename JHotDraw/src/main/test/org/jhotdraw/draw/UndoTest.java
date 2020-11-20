package org.jhotdraw.draw;

import com.tngtech.jgiven.junit.*;
import org.junit.*;

import static org.mockito.Mockito.mock;

public class UndoTest extends ScenarioTest<org.jhotdraw.draw.GivenAPathFigure, WhenUndoActionIsPerformed, ThenANodeWillBeRemoved> {

    @Test
    public void aFirstLoginTest() {
        given()
                .a_Bezier_Figure();
        when()
                .undo_action_is_performed();
        then()
                .a_Bezier_Figure_will_be_removed();
    }
}