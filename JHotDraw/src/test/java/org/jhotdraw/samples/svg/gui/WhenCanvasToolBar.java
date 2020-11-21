package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.CompositeFigure;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.samples.svg.figures.SVGGroupFigure;

/**
 * @author $Terpen
 */
public class WhenCanvasToolBar extends Stage<WhenCanvasToolBar>{
    
    @ProvidedScenarioState
    DrawingEditor editor;

    WhenCanvasToolBar chanceColorFieldToGreen(){
        editor.setHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR, Color.GREEN);
        return this;
    }
    
}
