package org.jhotdraw.geom.generalpathstrategy;

import java.awt.geom.GeneralPath;
import org.jhotdraw.geom.BezierPath;
import static org.jhotdraw.geom.BezierPath.C1_MASK;
import static org.jhotdraw.geom.BezierPath.C2_MASK;
import org.jhotdraw.geom.BezierPath.Node;

/**
 *
 * @author Denmads
 */
public class GeneralPathStrategyMultiplePoints implements GeneralPathStrategy{

    @Override
    public void makePath(GeneralPath gp, BezierPath path) {
            Node previous;
            Node current;

            previous = current = path.get(0);
            gp.moveTo((float) current.x[0], (float) current.y[0]);
            for (int i = 1, n = path.size(); i < n; i++) {
                previous = current;
                current = path.get(i);

                if ((previous.mask & C2_MASK) == 0) {
                    if ((current.mask & C1_MASK) == 0) {
                        gp.lineTo(
                                (float) current.x[0], (float) current.y[0]);
                    } else {
                        gp.quadTo(
                                (float) current.x[1], (float) current.y[1],
                                (float) current.x[0], (float) current.y[0]);
                    }
                } else {
                    if ((current.mask & C1_MASK) == 0) {
                        gp.quadTo(
                                (float) previous.x[2], (float) previous.y[2],
                                (float) current.x[0], (float) current.y[0]);
                    } else {
                        gp.curveTo(
                                (float) previous.x[2], (float) previous.y[2],
                                (float) current.x[1], (float) current.y[1],
                                (float) current.x[0], (float) current.y[0]);
                    }
                }
            }
            if (path.isClosed()) {
                if (path.size() > 1) {
                    previous = path.get(path.size() - 1);
                    current = path.get(0);

                    if ((previous.mask & C2_MASK) == 0) {
                        if ((current.mask & C1_MASK) == 0) {
                            gp.lineTo(
                                    (float) current.x[0], (float) current.y[0]);
                        } else {
                            gp.quadTo(
                                    (float) current.x[1], (float) current.y[1],
                                    (float) current.x[0], (float) current.y[0]);
                        }
                    } else {
                        if ((current.mask & C1_MASK) == 0) {
                            gp.quadTo(
                                    (float) previous.x[2], (float) previous.y[2],
                                    (float) current.x[0], (float) current.y[0]);
                        } else {
                            gp.curveTo(
                                    (float) previous.x[2], (float) previous.y[2],
                                    (float) current.x[1], (float) current.y[1],
                                    (float) current.x[0], (float) current.y[0]);
                        }
                    }
                }
                gp.closePath();
            }
    }

}
