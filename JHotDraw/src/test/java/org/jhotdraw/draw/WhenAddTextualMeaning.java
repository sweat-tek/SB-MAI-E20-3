/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

/**
 *
 * @author Alex
 */
public class WhenAddTextualMeaning extends Stage<WhenAddTextualMeaning>{
    @ProvidedScenarioState
    //User user;
    
    @ExpectedScenarioState
    TextHolderFigure textHolder;
            
    @ProvidedScenarioState
    TextHolderFigure figureWithText;
    
    public WhenAddTextualMeaning adding_textual_meaning_to_image(){
        //assertThat( user ).isNotNull();
        //assertThat( textHolder ).isNotNull();
        
       // figureWithText = user.AddTextToFigure(textHolder, "some text");
        return this;
    }
}
