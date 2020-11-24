/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.draw.action;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import static junit.framework.Assert.assertEquals;
import org.jhotdraw.draw.BezierFigure;
import org.jhotdraw.draw.Figure;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author menta
 */
public class AlignActionTest {
    public AlignActionTest(){
        
    }

    private static Rectangle2D.Double rect2D;
    private Figure fig1;
    private AffineTransform tx;
        
        @Before
        public void setUp(){
            tx = new AffineTransform();
            fig1 = new BezierFigure();
            rect2D = new Rectangle2D.Double(200, 100, 50, 150);

            fig1.setBounds(new Point2D.Double(25, 70), new Point2D.Double(120, 30));
            
            assert fig1 != null : "Figure does not exist";
            assert rect2D != null : "Selected Bounds does not exist";

        }

        
        @Test
        public void txTranslateEastTest(){
            double x = rect2D.x + rect2D.width;
            Rectangle2D.Double b = fig1.getBounds();
            double expectedWidth = 250.0;
            
            System.out.println("Selection bounds: " +rect2D.getBounds() + "\n");
            System.out.println("Old figure bounds: " + fig1.getBounds());
            
            fig1.willChange();
            tx.translate(x - b.x - b.width, 0);
            fig1.transform(tx);
            fig1.changed();
            
            System.out.println("New figure bounds: " + fig1.getBounds() + "\n");
            
            assertEquals(expectedWidth, fig1.getBounds().width);
        }
        
        @Test
        public void txTranslateBoundaryTest(){
            double x = rect2D.x + rect2D.width;
            Rectangle2D.Double b = fig1.getBounds();
            
            System.out.println("Selection bounds: " +rect2D.getBounds() + "\n");
            System.out.println("Old figure bounds: " + fig1.getBounds());
            
            fig1.willChange();
            tx.translate(-x - b.x - b.width, 0);
            fig1.transform(tx);
            fig1.changed();
            
            System.out.println("New figure bounds: " + fig1.getBounds() + "\n");
            
            assertEquals(fig1.getBounds().x, -250.0);
        }
}
