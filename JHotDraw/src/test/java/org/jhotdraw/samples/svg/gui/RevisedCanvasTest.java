package org.jhotdraw.samples.svg.gui;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.junit.SimpleScenarioTest;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.jhotdraw.draw.AttributeKeys;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.gui.JAttributeTextField;
import org.jhotdraw.gui.JPopupButton;
import org.jhotdraw.util.ResourceBundleUtil;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author $Terpen
 */
public class RevisedCanvasTest extends SimpleScenarioTest<RevisedCanvasTest.TestSteps> {


    @Test
    public void fill_color_should_be_changed() {
        given().toolbar_of_state_$(2);
        when().set_fill_color_to_$(Color.GREEN);
        then().fill_color_is_set_to_$(Color.GREEN);
    }

    public static class TestSteps extends Stage<TestSteps> {
        private List<Component> components;
        private DrawingView view;
        private ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.samples.svg.Labels");

        public void toolbar_of_state_$(int state) {
            CanvasToolBar toolbar = new CanvasToolBar();
            new JPanel().add(toolbar); 

            DefaultDrawingEditor editor = new DefaultDrawingEditor();
            view = new DefaultDrawingView();
            editor.setActiveView(view);
            view.setDrawing(new QuadTreeDrawing());
            toolbar.setEditor(editor);

            JComponent toolbarComponent = toolbar.createDisclosedComponent(state);
            components = new ArrayList<>();
            expandDeep(components, toolbarComponent);
        }
        
        public void set_fill_color_to_$(Color color) {
            findFieldWithTooltip("attribute.canvasFillColor.toolTipText").setAttributeValue(color);
        }

        public void fill_color_is_set_to_$(Color expected) {
            Color actual = AttributeKeys.CANVAS_FILL_COLOR.get(view.getDrawing());
            assertEquals("Fill color set", expected, actual);
        }


        private void expandDeep(List<Component> components, Component component) {
            components.add(component);
            if (!(component instanceof JComponent)) return;
            JComponent jc = (JComponent) component;
            for (Component c : jc.getComponents()) {
                expandDeep(components, c);
                // Also grab components of submenus
                if (c instanceof JPopupButton) {
                    for (Component c2 : ((JPopupButton) c).getPopupMenu().getComponents()) {
                        expandDeep(components, c2);
                    }
                }
            }
        }

        private <T> JAttributeTextField<T> findFieldWithTooltip(String key) {
            return  (JAttributeTextField<T>) components.stream().filter(c -> c instanceof JAttributeTextField && ((JAttributeTextField<?>) c).getToolTipText().equals(labels.getString(key))).findFirst().get();
        }
    }
}
