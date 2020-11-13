package org.jhotdraw.samples.svg.figures;

import org.jhotdraw.draw.DrawingView;
import org.junit.Before;
import org.junit.Test;

import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SVGPathFigureTest {

    SVGPathFigure svgPathFigure;
    SVGBezierFigure child;
    MouseEvent evt;
    DrawingView view;
    Point2D.Double point2D;


    @Before
    public void setUp() {
        svgPathFigure = spy(SVGPathFigure.class);
        child = mock(SVGBezierFigure.class);
        view = mock(DrawingView.class);
        point2D = mock(Point2D.Double.class);
        evt = mock(MouseEvent.class);
        when(view.getHandleDetailLevel()).thenReturn(2);
        when(evt.getClickCount()).thenReturn(2);
        when(svgPathFigure.getChildren()).thenReturn(Collections.singletonList(child));
    }

    @Test
    public void handleMouseClickWithOnlyOneClick() {
        when(evt.getClickCount()).thenReturn(1);
        assertFalse(svgPathFigure.handleMouseClick(point2D, evt, view));
        verify(svgPathFigure, never()).getChildren();
    }

    @Test
    public void handleMouseClickWithHandleLevelNotDivisibleBy2() {
        when(evt.getClickCount()).thenReturn(1);
        assertFalse(svgPathFigure.handleMouseClick(point2D, evt, view));
        verify(svgPathFigure, never()).getChildren();
    }

    @Test
    public void handleMouseClickWithNoChildren() {
        when(svgPathFigure.getChildren()).thenReturn(Collections.emptyList());
        assertFalse(svgPathFigure.handleMouseClick(point2D, evt, view));
        verify(child, never()).findSegment(point2D, svgPathFigure.getToleranceFor(view));
    }

    @Test
    public void handleMouseClickWithOneChildAndNotFoundIndex() {
        svgPathFigure.add(0, child);
        when(child.findSegment(point2D, svgPathFigure.getToleranceFor(view))).thenReturn(-1);
        assertFalse(svgPathFigure.handleMouseClick(point2D, evt, view));
        verify(child, times(1)).findSegment(point2D, svgPathFigure.getToleranceFor(view));
        verify(evt, never()).consume();
    }

    @Test
    public void handleMouseClickWithOneChildAndRegularIndex() {
        svgPathFigure.add(0, child);
        assertTrue(svgPathFigure.handleMouseClick(point2D, evt, view));
        when(child.findSegment(point2D, svgPathFigure.getToleranceFor(view))).thenReturn(0);
        verify(child, times(1)).findSegment(point2D, svgPathFigure.getToleranceFor(view));
        verify(evt, times(1)).consume();
        verify(child, times(1)).handleMouseClick(point2D, evt, view);
    }
}