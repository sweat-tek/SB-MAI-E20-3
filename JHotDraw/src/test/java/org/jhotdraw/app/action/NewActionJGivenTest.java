/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Mikkel H
 */
public class NewActionJGivenTest extends ScenarioTest<GivenAnApplication, WhenOpeningANewWindow, ThenThereIsTwoViews> {
    
    @Test
    public void NewActionJGivenTest() throws InterruptedException {
        given()
                .an_application();
        when()
                .opening_a_new_window();
        then()
                .there_is_two_views();
    }
}
