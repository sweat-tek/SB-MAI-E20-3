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
public class GivenFigure extends Stage<GivenFigure>{
    
    protected static Figure figure;
    
    
    
    public GivenFigure GivenFigureMethod() {
        
        figure = new BezierFigure();
        
        return self();
    }
    
}
