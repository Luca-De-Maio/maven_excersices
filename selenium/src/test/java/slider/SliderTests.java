package slider;

import base.BaseTests;
import com.solvd.lucademaio.pages.HomePage;
import com.solvd.lucademaio.pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SliderTests extends BaseTests {

    @Test
    public void moveRightTest(){

        HorizontalSliderPage horizontalSliderPage = homePage.clickSlider();
        horizontalSliderPage.setSliderValue("4");
        assertTrue(horizontalSliderPage.getSliderValue().contentEquals("4"),"no maru");
    }
}
