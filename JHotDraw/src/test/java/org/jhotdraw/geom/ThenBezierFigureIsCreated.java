package org.jhotdraw.geom;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.BezierTool;
import org.junit.Assert;

/**
 *
 * @author Denmads
 */
public class ThenBezierFigureIsCreated extends Stage<ThenBezierFigureIsCreated>{
    
    @ExpectedScenarioState
    BezierTool tool;
    @ExpectedScenarioState
    int xAxis;
    @ExpectedScenarioState
    int yAxis;
    
    public ThenBezierFigureIsCreated figureIsCreated() {
        BezierFigure result = tool.getLastFigure();
        Assert.assertNotNull(result);
        
        Assert.assertEquals(2, result.getBezierPath().size());
        
        Assert.assertEquals(xAxis - 100, result.getBezierPath().get(0).x[0], 0.001);
        Assert.assertEquals(yAxis, result.getBezierPath().get(0).y[0], 0.001);
        
        Assert.assertEquals(xAxis, result.getBezierPath().get(1).x[0], 0.001);
        Assert.assertEquals(yAxis, result.getBezierPath().get(1).y[0], 0.001);
        
        return this;
    }
}
