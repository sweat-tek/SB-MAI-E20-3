/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import org.jhotdraw.draw.CreationTool;
import org.jhotdraw.draw.DefaultDrawingView;
import org.mockito.Mockito;

/**
 *
 * @author Patrick
 */
public class WhenMouseIsReleased extends Stage<WhenMouseIsReleased> {
    @ProvidedScenarioState
    DefaultDrawingView defaultDrawingView;    
    @ProvidedScenarioState
    CreationTool tool;
    @ProvidedScenarioState
    int yAxis;
    @ProvidedScenarioState
    int xAxis;
    
    public WhenMouseIsReleased mouseReleased() {
        tool.mouseReleased(getMouseEvent(yAxis + 10, yAxis + 10));
        return self();
    }
    
    private MouseEvent getMouseEvent(int x, int y) {
        MouseEvent mouseEventMock = Mockito.mock(MouseEvent.class);
        Mockito.when(mouseEventMock.getPoint()).thenReturn(new Point(x,y));
        Mockito.when(mouseEventMock.getX()).thenReturn(x);
        Mockito.when(mouseEventMock.getY()).thenReturn(y);
        Mockito.when(mouseEventMock.getSource()).thenReturn(defaultDrawingView);
        Mockito.when(defaultDrawingView.viewToDrawing(new Point(xAxis,yAxis))).thenReturn(new Point2D.Double(xAxis,yAxis));
        return mouseEventMock;
    }    
}
