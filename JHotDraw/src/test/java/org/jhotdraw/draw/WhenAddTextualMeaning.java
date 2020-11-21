/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;

/**
 *
 * @author Alex
 */
public class WhenAddTextualMeaning extends Stage<WhenAddTextualMeaning>{
    @ExpectedScenarioState
    QuadTreeDrawing textHolderCanvas;
            
    @ProvidedScenarioState
    SVGTextFigure textFigure;
    
    public WhenAddTextualMeaning adding_textual_meaning_to_image(){
        //assertThat( textHolderCanvas ).isNotNull();
        textFigure = new SVGTextFigure();
        textFigure.setText("hello");
        
        textHolderCanvas.add(textFigure);
        return this;
    }
}
