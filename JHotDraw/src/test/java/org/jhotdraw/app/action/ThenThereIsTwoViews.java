/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static org.junit.Assert.*;
import org.jhotdraw.app.AbstractApplication;

/**
 *
 * @author Mikkel H
 */
class ThenThereIsTwoViews extends Stage<ThenThereIsTwoViews> {

    @ExpectedScenarioState
    public AbstractApplication app;

    public ThenThereIsTwoViews there_is_two_views() {
        int viewCount = app.views().size();
        assertEquals(viewCount, 2);
        return self();
    }
}
