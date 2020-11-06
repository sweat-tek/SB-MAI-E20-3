package org.jhotdraw.draw;

import org.jhotdraw.geom.Dimension2DDouble;

import java.awt.*;
import java.util.List;

import static org.jhotdraw.draw.AttributeKeys.*;
import static org.jhotdraw.draw.AttributeKeys.TEXT_COLOR;

public interface DrawableFigure extends Figure {
    @Override
    default void draw(Graphics2D g) {
        if (AttributeKeys.FILL_COLOR.get(this) != null) {
            g.setColor(AttributeKeys.FILL_COLOR.get(this));
            drawFill(g);
        }
        if (STROKE_COLOR.get(this) != null && STROKE_WIDTH.get(this) > 0d) {
            g.setStroke(AttributeKeys.getStroke(this));
            g.setColor(STROKE_COLOR.get(this));

            drawStroke(g);
        }
        if (TEXT_COLOR.get(this) != null) {
            if (TEXT_SHADOW_COLOR.get(this) != null &&
                    TEXT_SHADOW_OFFSET.get(this) != null) {
                Dimension2DDouble d = TEXT_SHADOW_OFFSET.get(this);
                g.translate(d.width, d.height);
                g.setColor(TEXT_SHADOW_COLOR.get(this));
                g.translate(-d.width, -d.height);
            }
            g.setColor(TEXT_COLOR.get(this));
        }
    }

    /**
     * This method is called by method draw() to draw the text of the figure
     * . AbstractAttributedFigure configures the Graphics2D object with
     * the TEXT_COLOR attribute before calling this method.
     * If the TEXT_COLOR attribute is null, this method is not called.
     */
    default void drawStroke(java.awt.Graphics2D g){
        throw new UnsupportedOperationException();
    }

    /**
     * This method is called by method draw() to draw the fill
     * area of the figure. AbstractAttributedFigure configures the Graphics2D
     * object with the FILL_COLOR attribute before calling this method.
     * If the FILL_COLOR attribute is null, this method is not called.
     */
    default void drawFill(java.awt.Graphics2D g){
        throw new UnsupportedOperationException();
    }
}
