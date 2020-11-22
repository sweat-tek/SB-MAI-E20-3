/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import org.jhotdraw.draw.*;
import static org.jhotdraw.draw.AttributeKeys.*;
import org.jhotdraw.samples.svg.figures.SVGGroupFigure;

class GivenCanvasToolBar extends Stage<GivenCanvasToolBar> {
    
    DrawingEditor editor;

    private void setup() {
        editor = new DefaultDrawingEditor();
        DrawingView view = new DefaultDrawingView();
        view.setDrawing(new QuadTreeDrawing());
        editor.setActiveView(view);
    }

    public GivenCanvasToolBar someCanvasColor(){
        setup();
        editor.setHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR, Color.BLUE);
        return this;
    }
    
}
