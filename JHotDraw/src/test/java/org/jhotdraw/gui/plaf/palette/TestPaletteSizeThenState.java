/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.gui.plaf.palette;

import com.tngtech.jgiven.Stage;
import java.awt.Dimension;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author madsm
 */
class TestPaletteSizeThenState extends Stage<TestPaletteSizeThenState>  {
    
    protected Dimension horizontalDimension; 
    
    public TestPaletteSizeThenState TheSliderWillBeHorizontal() {
        
         horizontalDimension = (Dimension) PaletteLookAndFeel.getInstance().get("Slider.horizontalSize");
         assertThat(TestPaletteSizeGivenState.horizDim.getSize()).isEqualTo(horizontalDimension.getSize());
        
        return self(); 
    }
    
    
    
}
