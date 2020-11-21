/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author nicol
 */
public class ThenItWillContainATextArea extends Stage<ThenItWillContainATextArea> {

    @ExpectedScenarioState
    SVGTextAreaFigure textAreaFigure;
    
    @ExpectedScenarioState
    QuadTreeDrawing canvas;

    public ThenItWillContainATextArea canvasContainsTextArea() {
        assertNotNull(canvas);
        assertNotNull(textAreaFigure);
        assertTrue(canvas.contains(textAreaFigure));
        return this;
    }

}
