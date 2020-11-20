/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import com.tngtech.jgiven.Stage;
import java.awt.Dimension;

/**
 *
 * @author madsm
 */
class TestPaletteSizeGivenState extends Stage<TestPaletteSizeGivenState> {

    protected static Dimension horizDim;

    public TestPaletteSizeGivenState aDimension() {
        //Random Dimension to be changed in when-state
        horizDim = new Dimension(1, 2);

        return self();

    }

}
 