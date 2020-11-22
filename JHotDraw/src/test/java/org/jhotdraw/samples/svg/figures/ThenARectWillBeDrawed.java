package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.Graphics2D;
import org.jhotdraw.draw.DrawingEditor;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class ThenARectWillBeDrawed extends Stage<ThenARectWillBeDrawed> {
    @ExpectedScenarioState
    SVGRectFigure svgRectFigure;
    DrawingEditor editor;
    
    Graphics2D Graphics2D;
    
    @BeforeStage
    private void before() {
        Graphics2D = mock(Graphics2D.class);
    }
    
    public ThenARectWillBeDrawed aRectWillBeDrawed() {  
        svgRectFigure.drawStroke(Graphics2D);
        return self();
    }
    
  
}
