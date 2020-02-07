package lucademaio.solvd.lucademaio.slider;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.HomePage;
import com.solvd.lucademaio.pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SliderTests extends BaseTests {

    @Test
    public void moveRightTest(){

        HorizontalSliderPage horizontalSliderPage = new HomePage(driver).clickSlider();
        horizontalSliderPage.setSliderValue("4");
        assertTrue(horizontalSliderPage.getSliderValue().contentEquals("4"),"no maru");
    }
}
