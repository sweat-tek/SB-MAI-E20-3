/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.geom.generalpathstrategy;

import java.awt.geom.GeneralPath;
import org.jhotdraw.geom.BezierPath;

/**
 *
 * @author Denmads
 */
public interface GeneralPathStrategy {
    public void makePath(GeneralPath gp, BezierPath path);
}
