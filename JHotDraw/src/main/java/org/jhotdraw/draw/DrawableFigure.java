package org.jhotdraw.draw;

import org.jhotdraw.geom.Dimension2DDouble;

import java.awt.*;

import static org.jhotdraw.draw.AttributeKeys.*;
import static org.jhotdraw.draw.AttributeKeys.TEXT_COLOR;

public interface DrawableFigure extends Figure {
    @Override
    default void draw(Graphics2D graphics2D) {
        if (AttributeKeys.FILL_COLOR.get(this) != null) {
            graphics2D.setColor(AttributeKeys.FILL_COLOR.get(this));
            drawFill(graphics2D);
        }
        if (STROKE_COLOR.get(this) != null && STROKE_WIDTH.get(this) > 0d) {
            graphics2D.setStroke(AttributeKeys.getStroke(this));
            graphics2D.setColor(STROKE_COLOR.get(this));

            drawStroke(graphics2D);
        }
        if (TEXT_COLOR.get(this) != null) {
            if (TEXT_SHADOW_COLOR.get(this) != null &&
                    TEXT_SHADOW_OFFSET.get(this) != null) {
                Dimension2DDouble d = TEXT_SHADOW_OFFSET.get(this);
                graphics2D.translate(d.width, d.height);
                graphics2D.setColor(TEXT_SHADOW_COLOR.get(this));
                graphics2D.translate(-d.width, -d.height);
            }
            graphics2D.setColor(TEXT_COLOR.get(this));
        }
    }

    /**
     * This method is called by method draw() to draw the text of the figure
     * . AbstractAttributedFigure configures the Graphics2D object with
     * the TEXT_COLOR attribute before calling this method.
     * If the TEXT_COLOR attribute is null, this method is not called.
     */
    default void drawStroke(java.awt.Graphics2D graphics2D){
        throw new UnsupportedOperationException();
    }

    /**
     * This method is called by method draw() to draw the fill
     * area of the figure. AbstractAttributedFigure configures the Graphics2D
     * object with the FILL_COLOR attribute before calling this method.
     * If the FILL_COLOR attribute is null, this method is not called.
     */
    default void drawFill(java.awt.Graphics2D graphics2D){
        throw new UnsupportedOperationException();
    }
}
