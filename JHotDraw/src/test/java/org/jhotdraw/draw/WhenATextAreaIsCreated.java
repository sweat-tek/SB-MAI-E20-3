/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;

/**
 *
 * @author nicol
 */
public class WhenATextAreaIsCreated extends Stage<WhenATextAreaIsCreated> {

    @ProvidedScenarioState
    SVGTextAreaFigure textAreaFigure;

    @ExpectedScenarioState
    QuadTreeDrawing canvas;

    public WhenATextAreaIsCreated textFigureAddedToCanvas() {
        textAreaFigure = new SVGTextAreaFigure();
        canvas.add(textAreaFigure);
        return this;
    }

}
