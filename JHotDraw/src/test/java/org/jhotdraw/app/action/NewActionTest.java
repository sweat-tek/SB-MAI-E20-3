/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.junit.ScenarioTest;
import java.awt.event.ActionEvent;
import static org.jhotdraw.app.action.ExitActionJGivenTest.app;
import static org.jhotdraw.app.action.ExitActionJGivenTest.model;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikkel H
 */
public class NewActionTest extends ScenarioTest<GivenAnApplication, WhenOpeningANewWindow, ThenThereIsTwoViews> {
    
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
