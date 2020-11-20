/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.Figure;

/**
 *
 * @author s_b_k
 */
class GivenAFigure extends Stage<GivenAFigure> {

    @ProvidedScenarioState
    protected static Figure shape;

    
    public GivenAFigure aFigure() {
        
        shape = new BezierFigure();
        
        return self();
    }

}
