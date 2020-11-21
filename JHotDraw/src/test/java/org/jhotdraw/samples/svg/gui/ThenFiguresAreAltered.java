package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.util.Set;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;

/**
 *
 * @author Karla
 */
class ThenFiguresAreAltered extends Stage<ThenFiguresAreAltered> {

    @ExpectedScenarioState
    private DrawingEditor editor;

    @ExpectedScenarioState
    private Set<Figure> selectedFigures;

    @ExpectedScenarioState
    private Set<Figure> nonselectedFigures;

    @ExpectedScenarioState
    private Set<Figure> childrenFigures;

    ThenFiguresAreAltered theFigureHasDashedLines() {
        return this;
    }
}