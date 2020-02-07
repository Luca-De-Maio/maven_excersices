package frame;

import base.BaseTests;
import com.solvd.lucademaio.pages.FramePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FrameTests extends BaseTests {

    @Test
    public void frameTests(){
        FramePage framePage = homePage.clickFramePage();
        framePage.clearTextArea();
        framePage.setTextArea("Hello World");
        assertTrue(framePage.getTextArea().contentEquals("Hello World"));
    }
}
