package lucademaio.solvd.lucademaio.frame;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.FramePage;
import com.solvd.lucademaio.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FrameTests extends BaseTests {

    @Test
    public void frameTests(){
        FramePage framePage = new HomePage(driver).clickFramePage();
        framePage.clearTextArea();
        framePage.setTextArea("Hello World");
        assertTrue(framePage.getTextArea().contentEquals("Hello World"));
    }
}
