/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.geom.Rectangle2D;
import org.jhotdraw.draw.CreationTool;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author Patrick
 */
public class ThenAnEllipseIsDrawn extends Stage<ThenAnEllipseIsDrawn> {
    @ProvidedScenarioState
    CreationTool tool;
    @ProvidedScenarioState
    int yAxis;
    @ProvidedScenarioState
    int xAxis;
    
    public ThenAnEllipseIsDrawn figureCreated(){
        SVGEllipseFigure result = tool.getLastFigureEllipse();
        assertNotNull(result);
        Rectangle2D.Double resultBounds = result.getBounds();
        double expectedX = 127;
        double expectedY = 408;
        double expectedWidth = 100;
        double expectedHeight = 0.1;
        assertEquals(expectedX, resultBounds.x, 0.0001);
        assertEquals(expectedY, resultBounds.y, 0.0001);
        assertEquals(expectedWidth, resultBounds.width, 0.0001);
        assertEquals(expectedHeight, resultBounds.height, 0.0001);
        
        return self();
    }
}
