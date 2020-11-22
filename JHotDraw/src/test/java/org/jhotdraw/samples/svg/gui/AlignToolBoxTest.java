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
    
    private JPanel panel;
    private GridBagConstraints gbc;
    public static AlignToolBar toolBar;
 
        @BeforeClass
        public static void setUpClass() throws Exception {
            toolBar = new AlignToolBar();
        }
        
        @Before
        public void setUp(){
            panel = mock(JPanel.class);
            gbc = mock(GridBagConstraints.class);

        }
        
        
        @Test
        public void testBorderAlignToolBox() {
            toolBar.createBorder();
            EmptyBorder border = (EmptyBorder) toolBar.panel.getBorder();
            
            assertNotNull(border);
            
            EmptyBorder testBorder = new EmptyBorder(5,5,5,8);
            
            assertEquals(testBorder.getBorderInsets(), border.getBorderInsets());
            
        }
        
        @Test
        public void testCreateButton() {
            toolBar.createEastButton(panel, gbc);
            EmptyBorder testBorder = new EmptyBorder(0,3,0,0);
            
            assertEquals(testBorder.getBorderInsets(), gbc.insets);
        }
    
}
