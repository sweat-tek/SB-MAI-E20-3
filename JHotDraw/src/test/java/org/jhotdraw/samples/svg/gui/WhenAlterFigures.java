package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import java.util.Map;
import org.jhotdraw.draw.AttributeKey;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DrawingEditor;

/**
 *
 * @author Karla
 */
class WhenAlterFigures extends Stage<WhenAlterFigures> {

    @ExpectedScenarioState
    @ProvidedScenarioState
    DrawingEditor editor;

    WhenAlterFigures changingItToStrokeCap() {
        editor.getActiveView().getSelectedFigures().iterator().next().setAttribute(AttributeKeys.STROKE_CAP, 3);
        return this;
    }

}
