/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.annotation.ScenarioState;
import org.jhotdraw.app.View;
import static org.jhotdraw.app.action.ExitActionTest.exitAction;
import org.jhotdraw.samples.svg.SVGView;

/**
 *
 * @author Mikkel H
 */
class GivenView {
    
    @ScenarioState
    private ExitAction exitAction;
    
    public void a_view() {
        View testView = new SVGView();
        exitAction.unsavedView = testView;
    }
    
}
