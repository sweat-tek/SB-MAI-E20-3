package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DrawingView;
import org.mockito.Mockito;

import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import static org.mockito.Mockito.mock;

public class WhenThePathIsDoubleclicked extends Stage<WhenThePathIsDoubleclicked> {
    @ExpectedScenarioState
    protected SVGPathFigure svgPathFigure;

    private MouseEvent mouseEvent;
    private Point2D.Double point2DDouble;
    private DrawingView drawingView;

    @BeforeStage
    private void init() {
        mouseEvent = mock(MouseEvent.class);
        point2DDouble = new Point2D.Double(1, 1);
        Mockito.when(mouseEvent.getClickCount()).thenReturn(2);
        drawingView = mock(DrawingView.class);
        Mockito.when(drawingView.getHandleDetailLevel()).thenReturn(0);
    }

    public WhenThePathIsDoubleclicked thePathIsDoubleclicked() {
        svgPathFigure.handleMouseClick(point2DDouble, mouseEvent, drawingView);
        return self();
    }
}
