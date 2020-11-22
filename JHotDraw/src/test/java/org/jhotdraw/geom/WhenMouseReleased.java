package org.jhotdraw.geom;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.BezierTool;
import org.jhotdraw.draw.DefaultDrawingView;
import org.mockito.Mockito;

/**
 *
 * @author Denmads
 */
public class WhenMouseReleased extends Stage<WhenMouseReleased>{
    
    @ExpectedScenarioState
    DefaultDrawingView defaultDrawingView;
    @ExpectedScenarioState
    BezierTool tool;
    @ExpectedScenarioState
    int xAxis;
    @ExpectedScenarioState
    int yAxis;
    
    public WhenMouseReleased mouseReleased() {
        tool.mouseReleased(getMouseEvent(xAxis+10, yAxis));
        return this;
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
