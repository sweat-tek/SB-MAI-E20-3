/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jhotdraw.draw.Figure;

/**
 *
 * @author theun
 */
public class WhenAutomaticSelectionIsUsed extends Stage<WhenAutomaticSelectionIsUsed>{

    protected static Set<Figure> selectedFigures = new LinkedHashSet<Figure>();
    
    public WhenAutomaticSelectionIsUsed WhenAutomaticSelectionIsUsedMethod() {
        
        selectedFigures = new LinkedHashSet<Figure>();
        selectedFigures.add(GivenFigure.figure);
                
        return self();
    }
    
    
}
