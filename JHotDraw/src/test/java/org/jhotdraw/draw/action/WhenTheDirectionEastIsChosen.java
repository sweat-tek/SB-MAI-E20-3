/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author menta
 */
public class WhenTheDirectionEastIsChosen extends Stage<WhenTheDirectionEastIsChosen>{
    protected static double x;
    protected static Rectangle2D.Double b;
    
    
    public WhenTheDirectionEastIsChosen theDirectionEastIsChosen(){
        x = GivenAFigureAndSelectionBounds.rect2D.x + GivenAFigureAndSelectionBounds.rect2D.width;
        b = GivenAFigureAndSelectionBounds.fig1.getBounds();
        
        return self();
    }
}
