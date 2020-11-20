package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.*;
import org.jhotdraw.samples.svg.figures.*;
import com.tngtech.jgiven.Stage;
import org.jhotdraw.undo.*;

public class GivenAPathFigure extends Stage<GivenAPathFigure> {
    @ProvidedScenarioState
    protected ArgumentList argumentList;

    @BeforeStage
    private void prepare() {
        argumentList = new ArgumentList();

        argumentList.drawingView = new DefaultDrawingView();
        argumentList.drawingView.setDrawing(new DefaultDrawing());
        argumentList.editor = new DefaultDrawingEditor();
        argumentList.editor.setActiveView(argumentList.drawingView);
    }

    public GivenAPathFigure a_Bezier_Figure() {
        argumentList.svgBezierFigure = new SVGBezierFigure();
        argumentList.drawingView.getDrawing().add(argumentList.svgBezierFigure);
        return self();
    }
}