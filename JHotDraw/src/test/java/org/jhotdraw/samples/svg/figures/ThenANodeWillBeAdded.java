package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import java.awt.geom.Point2D;

public class ThenANodeWillBeAdded extends Stage<ThenANodeWillBeAdded> {
    @ExpectedScenarioState
    SVGPathFigure svgPathFigure;

    public ThenANodeWillBeAdded a_Node_will_be_added(){
        org.assertj.core.api.Assertions.assertThat(svgPathFigure.getChild(GivenAPathWithOneChild.CHILD_INDEX))
                .matches(p -> {
                    Point2D.Double point2DDouble = p.getPoint(1);
                    return point2DDouble.x == 1.0 && point2DDouble.y == 1.0;
                });
        return self();
    }
}
