/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.annotation.ScenarioState;
import com.tngtech.jgiven.junit.ScenarioTest;
import java.io.File;
import org.jhotdraw.app.Application;
import org.jhotdraw.app.DefaultSDIApplication;
import static org.jhotdraw.app.action.ExitActionTest.app;
import static org.jhotdraw.app.action.ExitActionTest.exitAction;
import org.jhotdraw.samples.svg.SVGApplicationModel;
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
public class ExitActionJGivenTest extends ScenarioTest<GivenView, WhenSaveViewInFile, ThenIsFileSaved> {

    @ScenarioState
    public static Application app = new DefaultSDIApplication();
    @ScenarioState
    public static ExitAction exitAction = new ExitAction(app);
    @ScenarioState
    public static SVGApplicationModel model = new SVGApplicationModel();
    @ScenarioState
    private File testFile;

    @Test
    public void ExitActionJGivenTest() throws InterruptedException {
        app.setModel(model);
        given()
                .aView();
        when()
                .saveViewInFile();
        then()
                .IsFileSaved();
    }
}
