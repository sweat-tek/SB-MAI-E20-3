/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import java.util.HashMap;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author nicol
 */
public class GivenAnEmptyDrawingCanvas extends Stage<GivenAnEmptyDrawingCanvas> {

    @ProvidedScenarioState
    QuadTreeDrawing canvas;

    public GivenAnEmptyDrawingCanvas emptyDrawingCanvasCreated() {
        canvas = new QuadTreeDrawing();
        return this;
    }

}