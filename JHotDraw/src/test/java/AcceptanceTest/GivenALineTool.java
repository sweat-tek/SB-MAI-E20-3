/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.*;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.samples.svg.figures.SVGPathFigure;

/**
 *
 * @author jonas
 */
public class GivenALineTool extends Stage<GivenALineTool>{
    @ProvidedScenarioState
    SVGPathFigure svgLineFigure;
    private DrawingEditor drawingEditor;
    
    @BeforeStage
    private void before(){
        drawingEditor = new DefaultDrawingEditor();
        DrawingView drawingView = new DefaultDrawingView();
        drawingView.setDrawing(new QuadTreeDrawing());
        drawingEditor.setActiveView(drawingView);
    }
    
    public GivenALineTool aLineTool(){
        svgLineFigure = new SVGPathFigure();
        return self();
    }
}
