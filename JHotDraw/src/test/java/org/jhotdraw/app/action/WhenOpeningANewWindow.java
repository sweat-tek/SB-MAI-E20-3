/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.awt.event.ActionEvent;
import org.jhotdraw.app.AbstractApplication;

/**
 *
 * @author Mikkel H
 */
class WhenOpeningANewWindow extends Stage<WhenOpeningANewWindow>{

    @ExpectedScenarioState
    @ProvidedScenarioState
    public AbstractApplication app;

    @ProvidedScenarioState
    public static NewAction newAction;

    public WhenOpeningANewWindow opening_a_new_window() {
        newAction = new NewAction(app);
        ActionEvent evt = new ActionEvent(app, 0, "New Window");
        newAction.actionPerformed(evt);
        newAction.actionPerformed(evt);
        return self();
    }
}
