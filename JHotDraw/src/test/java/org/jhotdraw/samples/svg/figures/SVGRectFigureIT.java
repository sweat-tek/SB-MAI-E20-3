/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jhotdraw.samples.svg.figures;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Collection;
import java.util.Random;
import org.jhotdraw.draw.BoundsOutlineHandle;
import org.jhotdraw.draw.ConnectionFigure;
import org.jhotdraw.draw.Connector;
import org.jhotdraw.draw.Figure;
import org.jhotdraw.draw.Handle;
import org.jhotdraw.geom.Dimension2DDouble;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


/**
 *
 * @author 45277
 */
public class SVGRectFigureIT {
    
    
    BoundsOutlineHandle bounds;
    Figure fig;
    
    public SVGRectFigureIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fig = mock(Figure.class);
        bounds = new BoundsOutlineHandle(fig,false,true);
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testCreateHandles() {
        System.out.println("createHandles");
        int detailLevel = -1;
        SVGRectFigure instance = new SVGRectFigure();
        Collection<Handle> result = instance.createHandles(detailLevel);
        assertTrue(bounds.getClass().equals(result.iterator().next().getClass()));
     
    }
 
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        
        SVGRectFigure instance = new SVGRectFigure(1,1,0,0,1,1);
        
        boolean result = instance.isEmpty();
        
        assertTrue(result);

    }
  @Test
    public void testBoundaryIsEmpty() {
        System.out.println("isEmpty");
        Random rand = new Random(4);
        boolean expectedResult;
        double weight = rand.nextDouble();
        double height = rand.nextDouble();
        SVGRectFigure instance = new SVGRectFigure(1,1,weight,height,1,1);
        if(weight == 0 || height == 0){
            expectedResult = true;
            
        } else {
            expectedResult = false;
        }
        boolean result = instance.isEmpty();
        
        assertEquals(expectedResult, result);

    }
    
    
  
    
}
