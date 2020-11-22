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
class TestPaletteSizeWhenState extends Stage<TestPaletteSizeWhenState> {

    public TestPaletteSizeWhenState TheSliderHasHorizontalProperties() {

        TestPaletteSizeGivenState.horizDim.setSize(new Dimension(100, 20));

        return self();
    }

}
