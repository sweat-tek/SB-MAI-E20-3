/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.Iterator;
import java.util.LinkedList;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.QuadTreeDrawing;
/**
 *
 * @author s_b_k
 */
class WhenSendToBack extends Stage<WhenSendToBack> {
    
    @ExpectedScenarioState
    public BezierFigure shape;
    
    @ProvidedScenarioState
    public DrawingView view;
    public LinkedList figures;
    public QuadTreeDrawing currentDrawing;
    
    public WhenSendToBack sendToBack() {
 
        
/**       
        
       This is outconverted because i've simply not been able to make it work.
       
         
         
        figures.add(shape);
        
         Iterator i = figures.iterator();
      //  Drawing drawing = view.getDrawing();
        while (i.hasNext()) {
            Figure figure = (Figure) i.next();
           
            //from quadtreedrawing
            if (currentDrawing.children.remove(figure)) {
            currentDrawing.children.add(0, figure);
         
          
            
            
            // needsSorting = true;
            //fireAreaInvalidated(figure.getDrawingArea());
        }
        }
        
        
**/      
        
        
        return self();
    }
    
}
