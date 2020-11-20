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
public class GivenTextHolderCreated extends Stage<GivenTextHolderCreated>{
    
    @ProvidedScenarioState
    TextHolderFigure textHolder;
    
    public GivenTextHolderCreated text_holder(){
        return the_text_holder(new SVGTextFigure());
    }
    
    public GivenTextHolderCreated the_text_holder(TextHolderFigure textHolder){
        this.textHolder = textHolder;
        return this;
    }
}
