/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGTextFigure;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Alex
 */
public class ThenTextWritten extends Stage<ThenTextWritten> {
    @ExpectedScenarioState
    SVGTextFigure textFigure;
    
    @ExpectedScenarioState
    QuadTreeDrawing textHolderCanvas;
    
    public void the_resulting_text_in_figure_is_hello(){
        the_resulting_text_in_figure_is("hello");
    }
    
    public void the_figure_is_in_canvas(){
        the_resulting_figure_in_canvas_is(textFigure);
    }
    
    public void the_resulting_figure_in_canvas_is(SVGTextFigure figure){
        assertNotNull(textHolderCanvas);
        assertNotNull(textFigure);
        
        assertTrue(textHolderCanvas.contains(textFigure));
    }
    
    public void the_resulting_text_in_figure_is(String expectedText){
        assertNotNull(textHolderCanvas);
        assertNotNull(textFigure);
        
        assertTrue(textFigure.getText().equalsIgnoreCase(expectedText));
    }
}
