/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jhotdraw.app.AbstractApplication;
import org.jhotdraw.app.Application;
import org.jhotdraw.app.DefaultSDIApplication;
import org.jhotdraw.app.View;
import org.jhotdraw.gui.Worker;
import org.jhotdraw.samples.svg.SVGApplicationModel;
import org.jhotdraw.samples.svg.SVGView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

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
//    private int unsavedViewsCount;
//    private View unsavedView;
//    private View documentToBeReviewed;
//    public final static String ID = "application.exit";
//    private Component oldFocusOwner;

    @BeforeClass
    public static void setUpClass() throws Exception {
        app = new DefaultSDIApplication();
        exitAction = new ExitAction(app);
        model = new SVGApplicationModel();
    }

    @Before
    public void setUp() {

        app.setModel(model);
//        unsavedViewsCount = 0;
//        documentToBeReviewed = null; 
    }

    @After
    public void tearDown() {
        if (testFile.exists()) {
            System.out.println(testFile.toString() + " was deleted.");
            testFile.delete();

        }
    }

    @Test
    public void testSaveToFile() throws InterruptedException {

        View testView = new SVGView();
        testView.init();
        exitAction.unsavedView = testView;

        testFile = new File("testfile.txt");

        Worker w = exitAction.saveToFile(testFile);
        // Since w is a worker in another thread i need to wait for it, else the test fails. 
        // So i created the loop to run until w is done.
        while (w.isRunning) {
            Thread.sleep(0, 1);
        }
        assertTrue(testFile.exists());
    }
}

//    @Test
//    public void testReturnReviewPane() {
//
//        JOptionPane expectedPane = exitAction.returnReviewPane();
//        
//        JOptionPane testPane = new JOptionPane(
//                "<html>" + UIManager.getString("OptionPane.css")
//                + "<b>Do you want to save changes to this document "
//                + "before exiting?</b><p>"
//                + "If you don't save, your changes will be lost.",
//                JOptionPane.WARNING_MESSAGE
//        );
//        Object[] options = {"Save", "Cancel", "Don't Save"};
//        testPane.setOptions(options);
//        testPane.setInitialValue(options[0]);
//        testPane.putClientProperty("Quaqua.OptionPane.destructiveOption", new Integer(2));
//
//        assertEquals(expectedPane.getOptions(), testPane.getOptions());
//        assertEquals(expectedPane.getmesMessage(), testPane.getMessage());
//    }
//
//    @Test
//    public void testSaveToFile() throws InterruptedException {
//
//        View testView = new SVGView();
//        exitAction.unsavedView = testView;
//
//        testFile = new File("testFile.txt");
//
//        Worker w = exitAction.saveToFile(testFile);
//        while (w.isRunning) {
//            Thread.sleep(0, 1);
//        }
//        assertTrue(testFile.exists());
//    }
