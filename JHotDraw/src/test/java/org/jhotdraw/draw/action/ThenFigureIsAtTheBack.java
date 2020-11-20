/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import com.tngtech.jgiven.Stage;
import static org.jhotdraw.draw.action.GivenAFigure.shape;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author s_b_k
 */
class ThenFigureIsAtTheBack extends Stage<ThenFigureIsAtTheBack> {

    public ThenFigureIsAtTheBack figureIsSendToBack() {
        
      //  I have not been able to make it work, look to the report for explaination.
      //  The purpose of this section would be to assert that the index of the children is in fact 0
      //  Becuase if the index is 0 then the figure has been moved back
        
        //
        return self();
    }
    
}
