package org.jhotdraw.draw;

import com.tngtech.jgiven.annotation.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.app.*;
import org.jhotdraw.app.action.*;
import org.jhotdraw.samples.svg.*;
import org.jhotdraw.samples.svg.figures.*;
import org.mockito.*;
import java.awt.event.*;
import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

public class WhenUndoActionIsPerformed extends Stage<WhenUndoActionIsPerformed> {
    @ExpectedScenarioState
    protected ArgumentList argumentList;

    private BezierTool bezierTool;
    private HashMap<AttributeKey, Object> map;
    private CreationTool creationTool;
    private MouseEvent mouseEvent;

    @BeforeStage
    private void prepare() {
        bezierTool = new BezierTool(argumentList.svgBezierFigure);
        bezierTool.activate(argumentList.editor);
        map = new HashMap<AttributeKey, Object>();
        creationTool = new CreationTool(argumentList.svgBezierFigure, map);
        mouseEvent = mock(MouseEvent.class);
        creationTool.createdFigure = argumentList.svgBezierFigure;
        creationTool.editor = argumentList.editor;
    }

    public WhenUndoActionIsPerformed undo_action_is_performed() {
        bezierTool.fireUndoEvent(argumentList.svgBezierFigure, argumentList.drawingView);
        creationTool.mouseReleased(mouseEvent);
        return self();
    }
}
