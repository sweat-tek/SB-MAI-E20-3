package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jhotdraw.draw.*;
import org.jhotdraw.samples.svg.SVGAttributeKeys;

/**
 *
 * @author Karla
 */
public class GivenFigureToAlterLines extends Stage<GivenFigureToAlterLines> {

    @ProvidedScenarioState
    DrawingEditor editor;

    @ProvidedScenarioState
    Figure figure;

    @ProvidedScenarioState
    Map<AttributeKey, Object> attribute;

    @BeforeStage
    private void before() {
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
    }

    GivenFigureToAlterLines aFigure() {
        figure = new LineFigure();
        editor.getActiveView().getDrawing().add(figure);
        editor.getActiveView().addToSelection(figure);
        return this;
    }

}
