/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.ScenarioStage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.tngtech.jgiven.junit.ScenarioTest;

/**
 *
 * @author Alex
 */
public class WriteTextJGivenTest 
        extends ScenarioTest<GivenTextHolderCreated, WhenAddTextualMeaning, ThenTextWritten> {
    
    @ScenarioStage
    GivenTextHolderCreated givenState;
    
    @ScenarioStage
    WhenAddTextualMeaning whenAction;
    
    @ScenarioStage
    ThenTextWritten thenOutcome;
    
    public WriteTextJGivenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void text_is_written() {
        givenState.given().text_holder();
        whenAction.when().adding_textual_meaning_to_image();
        thenOutcome.then().the_resulting_text_in_figure_is_some_text();
    }
}
