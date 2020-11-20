/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.app.Application;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author Mikkel H
 */
class ThenThereIsTwoViews extends Stage<ThenThereIsTwoViews> {

    @ExpectedScenarioState
    public static Application app;

    public ThenThereIsTwoViews there_is_two_views() {
        int viewCount = app.views().size();
        assertEquals(viewCount, 2);

        return self();
    }

}
