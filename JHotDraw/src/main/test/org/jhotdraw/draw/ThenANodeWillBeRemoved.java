package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenANodeWillBeRemoved extends Stage<ThenANodeWillBeRemoved> {
    @ExpectedScenarioState
    protected ArgumentList argumentList;

    public ThenANodeWillBeRemoved a_Bezier_Figure_will_be_removed(){
        List<Figure> list = (argumentList.drawingView.getDrawing().getChildren());
        assertThat(argumentList.drawingView.getDrawing().getChildren()).isNullOrEmpty();
        return self();
    }
}
