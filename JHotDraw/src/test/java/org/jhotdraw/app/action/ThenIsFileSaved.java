/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;
import java.io.File;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Mikkel H
 */
class ThenIsFileSaved extends Stage<ThenIsFileSaved>{

    @ScenarioState
    private File testFile;

    public ThenIsFileSaved IsFileSaved() {
        System.out.println("hej med dig");
        assertTrue(testFile.exists());
        return self();
    }

}
