package AccpetanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.CreationTool;
import org.jhotdraw.draw.DefaultDrawingView;
import org.mockito.Mockito;

/**
 *
 * @author Victor
 */
public class WhenMouseReleased extends Stage<WhenMouseReleased> {

    @ExpectedScenarioState
    CreationTool tool;
    @ExpectedScenarioState
    DefaultDrawingView defaultDrawingView;
    @ExpectedScenarioState
    int yAxis;
    @ExpectedScenarioState
    int xAxis;

    public WhenMouseReleased mouseReleased() {
        // Fake mouseReleasedEvent
        tool.mouseReleased(getMouseEvent(xAxis + 10, yAxis + 20));
        return self();
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