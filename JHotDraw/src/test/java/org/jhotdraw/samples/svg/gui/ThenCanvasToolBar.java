package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.CompositeFigure;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * @author $Terpen
 */
public class ThenCanvasToolBar extends Stage<ThenCanvasToolBar>{

    @ExpectedScenarioState
    DrawingEditor editor;
    
    ThenCanvasToolBar thenBackgroundColorIsGreen(){
        System.out.println(editor.getHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR));
        colorIsGreen();
        return this;
    }
    
    private void colorIsGreen(){
        assertEquals(editor.getHandleAttribute(AttributeKeys.CANVAS_FILL_COLOR), Color.GREEN);
    }
    
}
