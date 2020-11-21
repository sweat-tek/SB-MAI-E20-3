package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.HashMap;
import java.util.Map;
import org.jhotdraw.draw.*;

/**
 *
 * @author Karla
 */
public class GivenFigureToAlterLines extends Stage<GivenFigureToAlterLines> {

    @ProvidedScenarioState
    private DrawingEditor editor;

    @ProvidedScenarioState
    private Figure figure;

    @ProvidedScenarioState
    Map<AttributeKey, Object> attribute;

    @BeforeStage
    private void before() {
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
        attribute = new HashMap();
    }

    GivenFigureToAlterLines aFigure() {
        figure = new BezierFigure();
        editor.getActiveView().getDrawing().add(figure);
        editor.getActiveView().addToSelection(figure);
        attribute.put(AttributeKeys.STROKE_DASHES, figure);

        return this;
    }

}
