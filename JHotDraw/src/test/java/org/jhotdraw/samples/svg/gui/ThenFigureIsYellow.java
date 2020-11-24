/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import static junit.framework.Assert.assertEquals;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.action.AttributeAction;

/**
 *
 * @author pradeepthayaparan
 */
public class ThenFigureIsYellow extends Stage<ThenFigureIsYellow> {

    @ProvidedScenarioState
    DrawingEditor editor;

    @ProvidedScenarioState
    AttributeAction editorColorChooserAction;

    @ProvidedScenarioState
    Figure figure;

    public ThenFigureIsYellow FigureIsYellow() {
        assertEquals(figure.getAttribute(AttributeKeys.FILL_COLOR), Color.yellow); 
    
        return this;
    }

}
