package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenANodeWillBeAdded extends Stage<ThenANodeWillBeAdded> {
    @ExpectedScenarioState
    SVGPathFigure svgPathFigure;

    public ThenANodeWillBeAdded aNodeWillBeAdded() {
        SVGBezierFigure child = svgPathFigure.getChild(GivenAPathWithOneChild.CHILD_INDEX);
        assertThat(child.getPoint(1)).matches(p -> p.x == 1.0 && p.y == 1.0);
        return self();
    }
}
