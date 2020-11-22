package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import java.util.Set;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.Figure;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Karla
 */
class ThenFiguresAreAltered extends Stage<ThenFiguresAreAltered> {

    @ExpectedScenarioState
    private DrawingEditor editor;

    @ExpectedScenarioState
    private Set<Figure> selectedFigures;

    ThenFiguresAreAltered theFigureHasStrokeCap() {

        // Checks if the StrokeCap is set to 3 on the figure
        assertEquals(editor.getActiveView().getSelectedFigures().iterator().next().getAttribute(AttributeKeys.STROKE_CAP), new Integer(3));
        return this;
    }
}
