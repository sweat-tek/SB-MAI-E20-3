package org.jhotdraw.geom.generalpathstrategy;

import java.awt.geom.GeneralPath;
import org.jhotdraw.geom.BezierPath;

/**
 *
 * @author Denmads
 */
public class GeneralPathFactory {
    private GeneralPathFactory () {}
    
    public static GeneralPathStrategy createGeneralPathStrategy (BezierPath bezierPath){
        if (bezierPath.isEmpty()) {
            return new GeneralPathStrategyEmpty();
        } else if (bezierPath.size() == 1) {
            return new GeneralPathStrategyLine();
        } else {
            return new GeneralPathStrategyMultiplePoints();
        }
    }
}
