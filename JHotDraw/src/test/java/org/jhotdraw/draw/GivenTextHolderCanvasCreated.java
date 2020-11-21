/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;

/**
 *
 * @author Alex
 */
public class GivenTextHolderCanvasCreated extends Stage<GivenTextHolderCanvasCreated>{
    
    @ProvidedScenarioState
    QuadTreeDrawing textHolderCanvas;
    
    public GivenTextHolderCanvasCreated text_holder_canvas(){
        return the_text_holder_canvas(new QuadTreeDrawing());
    }
    
    public GivenTextHolderCanvasCreated the_text_holder_canvas(QuadTreeDrawing textHolderCanvas){
        this.textHolderCanvas = textHolderCanvas;
        return this;
    }
}
