/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author theun
 */
public class FigureWillBeSelected extends Stage<FigureWillBeSelected>{
    /**
     * @param args the command line arguments
     */
    public FigureWillBeSelected theFigureWillBeSelected() {
        
        assertEquals(1, AutomaticSelectionIsUsed.selectedFigures.size());
        
        return self();
    }
    
}
