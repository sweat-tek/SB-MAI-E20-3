package AccpetanceTest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

/**
 *
 * @author Victor
 */
public class ImageToolAcceptanceTest extends ScenarioTest<GivenMousePressedAndMouseDragged, WhenMouseReleased, ThenImageFigureIsCreated> {
    
    @Test
    public void imageToolDrawTest() {
        
        System.out.println("ImageTool acceptance test");
        
        given().mousePressedAndMouseDragged();
        when().mouseReleased();
        then().figureCreated();
    }
}
