/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.app.View;
import org.jhotdraw.samples.svg.SVGView;


/**
 *
 * @author Mikkel H
 */
class GivenAView extends Stage<GivenAView> {
    
    @ProvidedScenarioState
    private ExitAction exitAction;
    
    public GivenAView a_view() {
        View testView = new SVGView();
        testView.init();
        exitAction.unsavedView = testView;
        
        return self();
    }
    
}
