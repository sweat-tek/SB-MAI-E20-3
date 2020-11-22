package org.jhotdraw.samples.svg.figures;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.geom.Point2D;

public class WhenTheRectToolHaveLegalBounds extends Stage<WhenTheRectToolHaveLegalBounds> {
    @ExpectedScenarioState
    SVGRectFigure svgRectFigure;
    
    
    Point2D.Double anchor;
    Point2D.Double lead;
    
    @BeforeStage
    private void before() {
        anchor = new Point2D.Double(1, 1);
        lead = new Point2D.Double(2, 2);     
    }
    
    
    public WhenTheRectToolHaveLegalBounds theRectToolHaveLegalBounds(){     
        svgRectFigure.setBounds(anchor, lead);
        
        return self();
    }
    
}
