package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Karla
 */
public class FigureToAlterLinesTest extends ScenarioTest<GivenFigureToAlterLines, WhenAlterFigures, ThenFiguresAreAltered> {

    @Test
    public void selectingSimpleFigureAndAlteringTheirShapeTransfersThem() {
        given().aFigure();
        when().changingItToStrokeCap();
        then().theFigureHasStrokeCap();

    }
}
