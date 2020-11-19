package org.jhotdraw.undo;

import com.tngtech.jgiven.*;
import com.tngtech.jgiven.annotation.*;
import org.jhotdraw.samples.svg.figures.*;

import java.awt.geom.*;
import com.tngtech.jgiven.*;
import com.tngtech.jgiven.annotation.*;
import org.jhotdraw.samples.svg.figures.*;

import java.awt.geom.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.geom.Point2D;

public class WhenUndoActionIsPerformed extends Stage<WhenUndoActionIsPerformed> {
    @ExpectedScenarioState
    SVGPathFigure svgPathFigure;

    public WhenUndoActionIsPerformed undo_action_is_performed() {
        org.assertj.core.api.Assertions.assertThat(svgPathFigure.getChild(GivenABezierPath.CHILD_INDEX))
                .matches(p -> {
                    Point2D.Double point2DDouble = p.getPoint(1);
                    return point2DDouble.x == 1.0 && point2DDouble.y == 1.0;
                });
        return self();
    }
}