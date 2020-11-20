
package AccpetanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import static com.tngtech.jgiven.impl.util.AssertionUtil.assertNotNull;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.Constrainer;
import org.jhotdraw.draw.CreationTool;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.GridConstrainer;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.samples.svg.figures.SVGImageFigure;
import org.mockito.Mockito;

/**
 *
 * @author Victor
 */
public class GivenMousePressedAndMouseDragged extends Stage<GivenMousePressedAndMouseDragged> {
    
    @ProvidedScenarioState
    CreationTool tool;
    @ProvidedScenarioState
    DefaultDrawingView defaultDrawingView;
    @ProvidedScenarioState
    int yAxis = 408;
    @ProvidedScenarioState
    int xAxis = 127;
    
    DefaultDrawingEditor defaultDrawingEditor;
    Constrainer constrainer;
    Drawing drawing;
    
    private void mockSetup() {
        tool = new CreationTool(new SVGImageFigure());
        defaultDrawingEditor = Mockito.mock(DefaultDrawingEditor.class);
        defaultDrawingView = Mockito.mock(DefaultDrawingView.class);
        constrainer = Mockito.mock(GridConstrainer.class);
        drawing = Mockito.mock(QuadTreeDrawing.class);
        
        Mockito.when(defaultDrawingEditor.getActiveView()).thenReturn(defaultDrawingView);
        Mockito.when(defaultDrawingEditor.findView(defaultDrawingView)).thenReturn(defaultDrawingView);
        Mockito.when(defaultDrawingView.viewToDrawing(new Point(xAxis, yAxis))).thenReturn(new Point2D.Double(xAxis, yAxis));
        Mockito.when(constrainer.constrainPoint(new Point2D.Double(xAxis, yAxis))).thenReturn(new Point2D.Double(xAxis, yAxis));
        tool.activate(defaultDrawingEditor);
        Mockito.when(defaultDrawingView.getConstrainer()).thenReturn(constrainer);
        //Mockito.when(tool.getDrawing()).thenReturn(drawing);
        //Mockito.when(tool.getView()).thenReturn(defaultDrawingView);
        Mockito.when(defaultDrawingView.getDrawing()).thenReturn(drawing);
    }
    
    public GivenMousePressedAndMouseDragged mousePressedAndMouseDragged() {
        //Setting up variables and mocking out.
        mockSetup();
        
        // Assert that all the mock steps has benn set up correctly.
        assertNotNull(tool);
        assertNotNull(defaultDrawingEditor);
        assertNotNull(defaultDrawingView);
        assertNotNull(constrainer);
        assertNotNull(drawing);
        
        //Fake mouse press at xAxis, yAxis
        givenMousePressed();
        //Fake horizontal drag on xAxis by simulating 10 events with 10 values apart
        givenMouseDragged();
        
        return this;
    }
    
    private void givenMousePressed() {
        tool.mousePressed(getMouseEvent(xAxis, yAxis));
    }
    
    private void givenMouseDragged() {
        for (int i = 0; i < 10; i++) {
            xAxis = 137 + (i * 10);
            tool.mouseDragged(getMouseEvent(xAxis, yAxis));
        }
    }
    
    private MouseEvent getMouseEvent(int x, int y) {
        MouseEvent mouseEventMock = Mockito.mock(MouseEvent.class);
        Mockito.when(mouseEventMock.getPoint()).thenReturn(new Point(x, y));
        Mockito.when(mouseEventMock.getX()).thenReturn(x);
        Mockito.when(mouseEventMock.getY()).thenReturn(y);
        Mockito.when(mouseEventMock.getSource()).thenReturn(defaultDrawingView);
        Mockito.when(defaultDrawingView.viewToDrawing(new Point(xAxis, yAxis))).thenReturn(new Point2D.Double(xAxis, yAxis));
        return mouseEventMock;
    }
    
}
