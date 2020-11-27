/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.annotation.ScenarioState;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.jhotdraw.app.Application;
import org.jhotdraw.app.DefaultSDIApplication;
import org.jhotdraw.samples.svg.SVGApplicationModel;
import org.junit.Test;

/**
 *
 * @author Mikkel H
 */
public class ExitActionJGivenTest extends ScenarioTest<GivenAView, WhenSaveViewInFile, ThenIsFileSaved> {
    
    @ScenarioState
    public static Application app = new DefaultSDIApplication();
    @ScenarioState
    public static ExitAction exitAction = new ExitAction(app);
    @ScenarioState
    public static SVGApplicationModel model = new SVGApplicationModel();
    
    @Test
    public void ExitActionJGivenTest() throws InterruptedException {
        app.setModel(model);
        given()
                .a_view();
        when()
                .save_view_in_file();
        then()
                .is_file_saved();
    }
}
