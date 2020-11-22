/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.Graphics2D;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.samples.svg.figures.SVGPathFigure;
import org.junit.Before;
import static org.mockito.Mockito.mock;

/**
 *
 * @author jonas
 */
public class ThenALineIsDrawn extends Stage<ThenALineIsDrawn> {

    @ExpectedScenarioState
    SVGPathFigure svgLineFigure;
    DrawingEditor drawingEditor;
    Graphics2D graphics2D;

    @Before
    private void before() {
        graphics2D = mock(Graphics2D.class);
    }

    public ThenALineIsDrawn aLineIsDrawn() {
        svgLineFigure.draw(graphics2D);
        return self();
    }
}
