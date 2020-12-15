package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Karla
 */
public class FigureToAlterLinesTest extends ScenarioTest<GivenFigureToAlterLines, WhenAlterFigures, ThenFiguresAreAltered> {

    @Test
    public void SelectingAFigureAndChangingItToHaveStrokeCaps() {
        given().aFigure();
        when().changingItToStrokeCap();
        then().thenFigureHasStrokeCap();

    }
}
