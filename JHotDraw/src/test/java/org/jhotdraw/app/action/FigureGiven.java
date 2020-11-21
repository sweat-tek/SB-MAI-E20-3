/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.Figure;

/**
 *
 * @author theun
 */
public class FigureGiven extends Stage<FigureGiven>{
    
    protected static Figure figure;
    
    
    
    public FigureGiven aFigure() {
        
        figure = new BezierFigure();
        
        return self();
    }
    
}
