package org.jhotdraw.geom.generalpathstrategy;

import java.awt.geom.GeneralPath;
import org.jhotdraw.geom.BezierPath;

/**
 *
 * @author Denmads
 */
public class GeneralPathStrategyEmpty implements GeneralPathStrategy
{

    @Override
    public void makePath(GeneralPath gp, BezierPath path) {
        gp.moveTo(0, 0);
        gp.lineTo(0, 0 + 1);
    }

}
