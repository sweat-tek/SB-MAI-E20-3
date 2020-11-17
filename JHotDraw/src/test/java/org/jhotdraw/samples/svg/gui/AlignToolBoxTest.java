package org.jhotdraw.samples.svg.gui;

import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;



/**
 *
 * @author menta
 */
public class AlignToolBoxTest {
    public AlignToolBoxTest(){
        
    }
    
    private JPanel p;
    private GridBagConstraints gbc;;
    public static AlignToolBar toolBar;
 
        @BeforeClass
        public static void setUpClass() throws Exception {
            toolBar = new AlignToolBar();
        }
        
        @Before
        public void setUp(){
            p = mock(JPanel.class);
            gbc = mock(GridBagConstraints.class);

        }
        
        
        @Test
        public void testBorderAlignToolBox() {
            toolBar.createBorder();
            EmptyBorder border = (EmptyBorder) toolBar.getJPanel().getBorder();
            
            assertNotNull(border);
            
            EmptyBorder testBorder = new EmptyBorder(5,5,5,8);
            
            assertEquals(testBorder.getBorderInsets(), border.getBorderInsets());
            
        }
        
        @Test
        public void testCreateButton() {
            toolBar.createBtnEast(p, gbc);
            EmptyBorder testBorder = new EmptyBorder(0,3,0,0);
            
            assertEquals(testBorder.getBorderInsets(), gbc.insets);
        }
    
}
