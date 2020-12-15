package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DrawingEditor;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Karla
 */
class ThenFiguresAreAltered extends Stage<ThenFiguresAreAltered> {

    @ExpectedScenarioState
    private DrawingEditor editor;

    ThenFiguresAreAltered thenFigureHasStrokeCap() {

        // Checks if the StrokeCap is set to 3 on the figure
    
        int expResult = 3;
        int result = editor.getActiveView().getSelectedFigures().iterator().next().getAttribute(AttributeKeys.STROKE_CAP);
        assertEquals(expResult, result);
        return this;
    }
}
