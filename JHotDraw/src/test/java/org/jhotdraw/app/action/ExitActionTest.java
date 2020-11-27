/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import java.io.File;
import org.jhotdraw.app.Application;
import org.jhotdraw.app.DefaultSDIApplication;
import org.jhotdraw.app.View;
import org.jhotdraw.gui.Worker;
import org.jhotdraw.samples.svg.SVGApplicationModel;
import org.jhotdraw.samples.svg.SVGView;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Mikkel H
 */
public class ExitActionTest {

    public ExitActionTest() {
    }

    public static ExitAction exitAction;
    public static Application app;
    public static SVGApplicationModel model;
    private File testFile;
    private static View testView;

    @BeforeClass
    public static void setUpClass() {
        app = new DefaultSDIApplication();
        exitAction = new ExitAction(app);
        model = new SVGApplicationModel();
        testView = new SVGView();
        app.setEnabled(false);
    }

    @Before
    public void setUp() {
        app.setModel(model);
        testView.init();
    }

    // Best case - It should save the file
    @Test
    @Ignore
    public void testSaveToFile() throws InterruptedException{

        exitAction.unsavedView = testView;
        testFile = new File("testfile.txt");
        Worker w = exitAction.saveToFile(testFile);
        // Since w is a worker in another thread i need to wait for it, else the test fails. 
        // So i created the loop to run until w is done.
        while (w.isRunning) {
            Thread.sleep(0, 1);
        }
        assertTrue(testFile.exists());
        testFile.delete();
    }

    // Should pass
    @Test
    public void testSilentAbortBestCase() {
        int testVarUnsavedCount = 1;
        assertTrue(exitAction.silentAbort(testVarUnsavedCount, null));
    }

    // Should fail
    @Test
    public void testSilentAbortBoundary1() {
        int testVarUnsavedCount = 0;
        assertFalse(exitAction.silentAbort(testVarUnsavedCount, null));
    }

    // Should fail
    @Test
    public void testSilentAbortBoundary2() {
        int testVarUnsavedCount = -1;
        assertFalse(exitAction.silentAbort(testVarUnsavedCount, null));

    }
}
