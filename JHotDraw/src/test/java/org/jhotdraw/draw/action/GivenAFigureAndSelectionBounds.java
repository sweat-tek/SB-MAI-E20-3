/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.Figure;

/**
 *
 * @author menta
 */
public class GivenAFigureAndSelectionBounds extends Stage<GivenAFigureAndSelectionBounds>{
    
    protected static Rectangle2D.Double rect2D;
    protected static Figure fig1;
    
    public GivenAFigureAndSelectionBounds aFigure(){
        fig1 = new BezierFigure();
        fig1.setBounds(new Point2D.Double(25, 70), new Point2D.Double(120, 30));
        
        return self();
    }
    
    public GivenAFigureAndSelectionBounds selectionBounds(){
        rect2D = new Rectangle2D.Double(200, 100, 50, 150);
        
        return self();
    }
}
