/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.annotation.ScenarioState;
import java.io.File;
import org.jhotdraw.gui.Worker;

/**
 *
 * @author Mikkel H
 */
class WhenSave {
    
    @ScenarioState
    private ExitAction exitAction;
    
    @ScenarioState
    private File testFile;
    
    public void fileSaved() throws InterruptedException {
        File testFile = new File("testFile.txt");

        Worker w = exitAction.saveToFile(testFile);
//        while (w.isRunning) {
////            Thread.sleep(0, 1);
//            Thread.sleep(1000);
//        }
    }
}
