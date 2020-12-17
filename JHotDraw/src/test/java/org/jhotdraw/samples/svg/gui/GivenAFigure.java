/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.HashMap;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.QuadTreeDrawing;

/**
 *
 * @author pradeepthayaparan
 */
class GivenAFigure extends Stage<GivenAFigure> {

    @ProvidedScenarioState
    DrawingEditor editor;

    @ProvidedScenarioState
    HashMap<AttributeKey, Object> attr;
    
      @ProvidedScenarioState
      Figure figure;

    @BeforeStage
    private void before() {
        editor = new DefaultDrawingEditor();
        DrawingView DrawingView = new DefaultDrawingView();
        DrawingView.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(DrawingView);  
        attr = new HashMap<>();
        figure = new BezierFigure();
    }

    GivenAFigure aFigure() {
       
        editor.getActiveView().getDrawing().add(figure);
        editor.getActiveView().addToSelection(figure);
       

        return this;
    }

}
