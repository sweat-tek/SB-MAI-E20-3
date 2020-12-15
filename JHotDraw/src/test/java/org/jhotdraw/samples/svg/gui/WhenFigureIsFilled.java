/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import java.util.HashMap;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.action.AttributeAction;
import org.jhotdraw.draw.action.EditorColorChooserAction;

/**
 *
 * @author pradeepthayaparan
 */
public class WhenFigureIsFilled extends Stage<WhenFigureIsFilled> {

    @ExpectedScenarioState
    DrawingEditor editor;

    @ProvidedScenarioState
    AttributeAction editorColorChooserAction;

    @ProvidedScenarioState
    HashMap<AttributeKey, Object> attr; 
    
     @ProvidedScenarioState
   Figure figure;  
    
     @BeforeStage
    private void before() {
        figure = new BezierFigure();
        editorColorChooserAction = new EditorColorChooserAction(editor, AttributeKeys.FILL_COLOR); 
    }
    

    WhenFigureIsFilled TheFigureIsFilled() {

     
         figure.setAttribute(AttributeKeys.FILL_COLOR, Color.yellow);
        return this;
    }

}
