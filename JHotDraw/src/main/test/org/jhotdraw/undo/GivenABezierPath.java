package org.jhotdraw.undo;

import com.tngtech.jgiven.*;
import com.tngtech.jgiven.annotation.*;
import org.jhotdraw.geom.*;
import org.jhotdraw.samples.svg.figures.*;

import java.awt.geom.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.geom.BezierPath;

public class GivenABezierPath extends Stage<GivenABezierPath> {
    @ProvidedScenarioState
    protected SVGPathFigure svgPathFigure;
    protected static final int CHILD_INDEX = 0;

    public GivenABezierPath a_Path_with_one_Child() {
        svgPathFigure = new SVGPathFigure();
        SVGBezierFigure svgBezierFigure = new SVGBezierFigure();
        svgPathFigure.add(CHILD_INDEX, svgBezierFigure);
        return self();
    }

    public GivenABezierPath the_Child_has_two_Points() {
        SVGBezierFigure svgBezierFigure = svgPathFigure.getChild(CHILD_INDEX);
        BezierPath.Node firstNode = new BezierPath.Node(0, 0);
        BezierPath.Node secondNode = new BezierPath.Node(2, 2);
        svgBezierFigure.addNode(firstNode);
        svgBezierFigure.addNode(secondNode);
        return self();
    }

    public GivenABezierPath a_Node_will_be_added(){
        org.assertj.core.api.Assertions.assertThat(svgPathFigure.getChild(GivenABezierPath.CHILD_INDEX))
                .matches(p -> {
                    Point2D.Double point2DDouble = p.getPoint(1);
                    return point2DDouble.x == 1.0 && point2DDouble.y == 1.0;
                });
        return self();
    }
}