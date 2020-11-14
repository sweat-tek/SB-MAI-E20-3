package org.jhotdraw.draw.action;

import java.awt.geom.Rectangle2D;
import java.util.Collection;
import org.jhotdraw.draw.action.AlignAction.*;
import org.jhotdraw.samples.svg.gui.AlignToolBar;
import org.junit.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;



/**
 *
 * @author menta
 */
public class AlignTest {
    public AlignTest(){
        
    }
    
    private North north;
    private South south;
    private East east;
    private West west;
    private Horizontal hori;
    private Vertical verti;
    private Collection figures;
    private Rectangle2D.Double rect2D;
 
        @BeforeClass
        public static void setUpClass() throws Exception {
            
        }
        
        @AfterClass
        public static void tearDownClass() throws Exception{
            
        }
        
        @Before
        public void setUp(){
        north = mock(North.class);
        south = mock(South.class);
        east = mock(East.class);
        west = mock(West.class);
        hori = mock(Horizontal.class);
        verti = mock(Vertical.class);
        figures = mock(Collection.class);
        rect2D = mock(Rectangle2D.Double.class);
        }
        
        @After
        public void tearDown(){
            
        }
        
        @Test
        public void bestCase() {
            north.alignFigures(figures, rect2D);
            verify(figures, never()).isEmpty();
        }
    
}
