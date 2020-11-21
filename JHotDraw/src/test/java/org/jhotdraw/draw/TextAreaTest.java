/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author nicol
 */
public class TextAreaTest extends ScenarioTest<GivenAnEmptyDrawingCanvas, WhenATextAreaIsCreated, ThenItWillContainATextArea> {
    
    @Test
    public void additionOfANodeWhenDoubleclickingTest() {
        given()
                .emptyDrawingCanvasCreated();
        when()
                .textFigureAddedToCanvas();
        then()
                .canvasContainsTextArea();
    }
}
