/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import java.awt.Dimension;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author madsm
 */
public class PreferredPaletteSizeTest {

    public PreferredPaletteSizeTest() {

    }

    Dimension testVertDimension;
    Dimension testHorizDimension;
    Dimension vertDim;
    Dimension horizDim;

    //Best case input
    @Test
    public void getPreferredHorizontalSizeTest() {

        testHorizDimension = new Dimension(100, 20);

        horizDim = (Dimension) PaletteLookAndFeel.getInstance().get("Slider.horizontalSize");

        assert horizDim != null : "Horizon dimension is null";

        assertEquals(horizDim, testHorizDimension);

    }

    //Boundary test for wrong input 
    @Test
    public void getPreferredVerticalSizeTest() {

        testVertDimension = new Dimension(100, 200);

        vertDim = (Dimension) PaletteLookAndFeel.getInstance().get("Slider.verticalSize");

        assert vertDim != null : "Vertical dimension is null";

        assertFalse(vertDim.equals(testVertDimension));

    }
}
