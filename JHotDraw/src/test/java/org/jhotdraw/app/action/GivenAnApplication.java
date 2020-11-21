/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.app.*;
import org.jhotdraw.samples.svg.SVGApplicationModel;

/**
 *
 * @author Mikkel H
 */
class GivenAnApplication extends Stage<GivenAnApplication> {

    @ProvidedScenarioState
    public AbstractApplication app;

    public static DefaultApplicationModel appModel;
    public static SVGApplicationModel model;

    public GivenAnApplication an_application() {
        app = new DefaultSDIApplication();
        model = new SVGApplicationModel();
        app.setModel(model);
        app.initLabels();
        app.init();
        appModel = new DefaultApplicationModel();
        appModel.setViewClassName("org.jhotdraw.samples.svg.SVGView");
        app.setModel(appModel);

        return self();
    }
}
