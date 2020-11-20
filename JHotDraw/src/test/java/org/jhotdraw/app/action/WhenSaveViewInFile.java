/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.io.File;
import org.jhotdraw.gui.Worker;

/**
 *
 * @author Mikkel H
 */
class WhenSaveViewInFile extends Stage<WhenSaveViewInFile> {

    @ExpectedScenarioState
    private ExitAction exitAction;

    @ProvidedScenarioState
    private File testFile;

    public WhenSaveViewInFile save_view_in_file() throws InterruptedException {
        testFile = new File("testFile.txt");;
        Worker w = exitAction.saveToFile(testFile);
        while (w.isRunning) {
            Thread.sleep(0, 1);
        }
        return self();
    }
}
