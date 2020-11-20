package org.jhotdraw.samples.svg.figures;

import java.awt.geom.Rectangle2D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victor
 */
public class SVGImageFigureTest {

    private SVGImageFigure image;

    public SVGImageFigureTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        image = new SVGImageFigure(0, 0, 5, 5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testHeightandWidth() {

        Rectangle2D.Double test = image.getBounds();
        Rectangle2D.Double actual = new Rectangle2D.Double(0, 0, 5, 5);

        double height = image.getHeight();
        double width = image.getWidth();

        assertEquals(actual, test);
    }
}