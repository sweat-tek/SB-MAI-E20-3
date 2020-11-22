package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.*;

/**
 *
 * @author Karla
 */
public class GivenFigureToAlterLines extends Stage<GivenFigureToAlterLines> {

    @ProvidedScenarioState
    DrawingEditor editor;


    @BeforeStage
    private void before() {
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
       
    }

    GivenFigureToAlterLines aFigure() {
        Figure figure = new LineFigure();
        editor.getActiveView().getDrawing().add(figure);
        editor.getActiveView().addToSelection(figure);
        return this;
    }

}
