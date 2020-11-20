package org.jhotdraw.geom.generalpathstrategy;

import java.awt.geom.GeneralPath;
import org.jhotdraw.geom.BezierPath;

/**
 *
 * @author Denmads
 */
public class GeneralPathStrategyLine implements GeneralPathStrategy{

    @Override
    public void makePath(GeneralPath gp, BezierPath path) {
        BezierPath.Node current = path.get(0);
        gp.moveTo((float) current.x[0], (float) current.y[0]);
        gp.lineTo((float) current.x[0], (float) current.y[0] + 1);
    }

}
