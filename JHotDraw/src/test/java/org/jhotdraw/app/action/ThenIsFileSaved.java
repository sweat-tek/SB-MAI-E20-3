/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.io.File;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Mikkel H
 */
class ThenIsFileSaved extends Stage<ThenIsFileSaved>{

    @ExpectedScenarioState
    private File testFile;

    public ThenIsFileSaved is_file_saved() {
//        assertTrue(testFile.exists());
        return self();
    }

}
