package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import org.jhotdraw.draw.AttributeKeys;
import static org.jhotdraw.draw.AttributeKeys.STROKE_JOIN;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.FigureListener;
import org.jhotdraw.draw.LineFigure;
import org.jhotdraw.draw.QuadTreeDrawing;

/**
 *
 * @author Karla
 */
class WhenAlterFigures extends Stage<WhenAlterFigures> {

    @ExpectedScenarioState
    @ProvidedScenarioState
    DrawingEditor editor;

    @ProvidedScenarioState
    Set<Figure> selectedFigures;

    @BeforeStage
    private void before() {
        selectedFigures = new HashSet<>(editor.getActiveView().getSelectedFigures());
        //selectedFigures.iterator().next().getAttribute(STROKE_JOIN);

}

WhenAlterFigures changingItToStrokeCap() {
        editor.getActiveView().getSelectedFigures().iterator().next().setAttribute(AttributeKeys.STROKE_CAP,3);  
        return this;
    }

}
