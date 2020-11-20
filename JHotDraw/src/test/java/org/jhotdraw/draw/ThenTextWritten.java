/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

/**
 *
 * @author Alex
 */
public class ThenTextWritten extends Stage<ThenTextWritten> {
    @ExpectedScenarioState
    TextHolderFigure figureWithText;
    
    public void the_resulting_text_in_figure_is_some_text(){
        the_resulting_text_in_figure_is("some text");
    }
    
    public void the_resulting_text_in_figure_is(String expectedText){
        assertThat( (SVGTextFigure)figureWithText.getText() ).isEqualTo( expectedText );
    }
}
