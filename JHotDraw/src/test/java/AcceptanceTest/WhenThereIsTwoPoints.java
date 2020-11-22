/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcceptanceTest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.awt.geom.Point2D;
import org.jhotdraw.samples.svg.figures.SVGPathFigure;

/**
 *
 * @author jonas
 */
public class WhenThereIsTwoPoints extends Stage<WhenThereIsTwoPoints> {
    @ExpectedScenarioState
    SVGPathFigure svgLineFigure;
    
    Point2D.Double point1;
    Point2D.Double point2;
    
    public WhenThereIsTwoPoints thereIsTwoPoints() {
        point1 = new Point2D.Double(0, 0);
        point2 = new Point2D.Double(2,2);
        svgLineFigure.setBounds(point1, point2);
        return self();
    }
}
