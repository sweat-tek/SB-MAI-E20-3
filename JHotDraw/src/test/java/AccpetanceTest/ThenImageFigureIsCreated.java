package AccpetanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static com.tngtech.jgiven.impl.util.AssertionUtil.assertNotNull;
import org.jhotdraw.draw.CreationTool;
import org.jhotdraw.samples.svg.figures.SVGImageFigure;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Victor
 */
public class ThenImageFigureIsCreated extends Stage<ThenImageFigureIsCreated> {
    
    @ExpectedScenarioState
    CreationTool tool;
    @ExpectedScenarioState
    int yAxis;
    @ExpectedScenarioState
    int xAxis;
    
    public ThenImageFigureIsCreated figureCreated() {
        
        // get the final result
        SVGImageFigure result = (SVGImageFigure) tool.getLastFigure();
        
        // Assert that the created figure is not null
        assertNotNull(result);
        // Assert that the created ImageFigure is of correct path size
        assertEquals(new SVGImageFigure(127, 408, 10, 20), result);
        
//        //Assert that the first node has x, y coordinate of the first fake mousePressed mouseEvent
//        assertEquals(xAxis -100, result.getImagePath().get(0).x[0], 0.001);
//        assertEquals(yAxis, result.getImagePath().get(0).y[0], 0.001);
//        
//        // Assert that the last node has x, y coordinate of the last faked dragged mouseEvent
//        assertEquals(xAxis, result.getImagePath().get(1).x[0], 0.001);
//        assertEquals(yAxis, result.getImagePath().get(1).y[0], 0.001);
        
        return self();
    }
    
}
