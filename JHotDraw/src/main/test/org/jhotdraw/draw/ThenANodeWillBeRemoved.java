package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenANodeWillBeRemoved extends Stage<ThenANodeWillBeRemoved> {
    @ExpectedScenarioState
    protected ArgumentList argumentList;

    public ThenANodeWillBeRemoved a_Bezier_Figure_will_be_removed(){
        assertThat(argumentList.drawingView.getDrawing().getChildren()).isNullOrEmpty();
        return self();
    }
}
