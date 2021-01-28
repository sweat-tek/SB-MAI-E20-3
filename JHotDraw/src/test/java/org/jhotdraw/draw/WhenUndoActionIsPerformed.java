package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.samples.svg.figures.*;

import java.awt.event.*;
import java.util.*;

import static org.mockito.Mockito.mock;

public class WhenUndoActionIsPerformed extends Stage<WhenUndoActionIsPerformed> {
    @ExpectedScenarioState
    protected ArgumentList argumentList;

    private CreationTool creationTool;
    private MouseEvent mouseEvent;

    @BeforeStage
    private void prepare() {
        HashMap<AttributeKey, Object> map = new HashMap<>();
        mouseEvent = mock(MouseEvent.class);
        creationTool = new CreationTool(argumentList.svgBezierFigure, map);
        creationTool.createdFigure = argumentList.svgBezierFigure;
        creationTool.editor = argumentList.editor;
    }

    public WhenUndoActionIsPerformed undo_action_is_performed() {
        creationTool.mouseReleased(mouseEvent);
        return self();
    }
}
