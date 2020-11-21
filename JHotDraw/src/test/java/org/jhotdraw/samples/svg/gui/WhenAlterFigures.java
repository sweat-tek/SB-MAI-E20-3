package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.Set;
import static org.jhotdraw.draw.AttributeKeys.STROKE_JOIN;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.FigureListener;
import org.jhotdraw.draw.LineFigure;

/**
 *
 * @author Karla
 */
class WhenAlterFigures extends Stage<WhenAlterFigures> {

    @ExpectedScenarioState
    @ProvidedScenarioState
    private DrawingEditor editor;

    @ProvidedScenarioState
    private Set<Figure> selectedFigures;

    @ProvidedScenarioState
    private Set<Figure> nonselectedFigures;

    @ProvidedScenarioState
    private Set<Figure> childrenFigures;

    @ProvidedScenarioState
    @ExpectedScenarioState
    private Figure figure;

    @BeforeStage
    public void before() {
    }

    WhenAlterFigures changingItToDashedLines() {
        figure.getAttribute(STROKE_JOIN);
        return this;
    }

}
