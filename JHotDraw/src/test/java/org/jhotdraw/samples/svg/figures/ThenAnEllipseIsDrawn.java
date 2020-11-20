/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
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
        
        assertEquals(new SVGEllipseFigure(5,5,10,10), result);
        
        return self();
    }
}
