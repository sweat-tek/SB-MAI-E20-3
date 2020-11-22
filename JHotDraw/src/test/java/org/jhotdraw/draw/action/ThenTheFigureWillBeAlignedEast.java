/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import static junit.framework.Assert.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author menta
 */
public class ThenTheFigureWillBeAlignedEast extends Stage<ThenTheFigureWillBeAlignedEast>{
    protected double x;
    protected Rectangle2D.Double b;
    protected AffineTransform tx;
    
    public ThenTheFigureWillBeAlignedEast theFigureWillBeAlignedEast(){
        x = WhenTheDirectionEastIsChosen.x;
        b = WhenTheDirectionEastIsChosen.b;
        tx = new AffineTransform();
        
        GivenAFigureAndSelectionBounds.fig1.willChange();
        tx.translate(x - b.x - b.width, 0);
        GivenAFigureAndSelectionBounds.fig1.transform(tx);
        GivenAFigureAndSelectionBounds.fig1.changed();
        
        assertThat(GivenAFigureAndSelectionBounds.fig1.getBounds().x).isEqualTo(155.0);
        return self();
    }
    
}
