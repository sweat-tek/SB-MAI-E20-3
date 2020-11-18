/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.app.action;

import com.tngtech.jgiven.junit.ScenarioTest;
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
public class ExitActionJGivenTest extends ScenarioTest<GivenView, WhenSave, ThenIsFileSaved>{
    
    public ExitActionJGivenTest() throws InterruptedException {
        given()
                .a_view();
        when()
                .fileSaved();
        then()
                .IsFileSave();
           
    }
}


        
        