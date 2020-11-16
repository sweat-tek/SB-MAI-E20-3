package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.geom.BezierPath;

public class GivenAPathWithOneChild extends Stage<GivenAPathWithOneChild> {
    @ProvidedScenarioState
    protected SVGPathFigure svgPathFigure;
    protected static final int CHILD_INDEX = 0;

    public GivenAPathWithOneChild the_Child_has_two_Points() {
        SVGBezierFigure svgBezierFigure = svgPathFigure.getChild(CHILD_INDEX);
        BezierPath.Node firstNode = new BezierPath.Node(0, 0);
        BezierPath.Node secondNode = new BezierPath.Node(2, 2);
        svgBezierFigure.addNode(firstNode);
        svgBezierFigure.addNode(secondNode);
        return self();
    }

    public GivenAPathWithOneChild a_Path_with_one_Child() {
        svgPathFigure = new SVGPathFigure();
        SVGBezierFigure svgBezierFigure = new SVGBezierFigure();
        svgPathFigure.add(CHILD_INDEX, svgBezierFigure);
        return self();
    }
}
