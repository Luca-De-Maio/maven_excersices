package time;

import base.BaseTests;
import com.solvd.lucademaio.pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TimeTests extends BaseTests {

    @Test
    public void timeTests(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        dynamicLoadingPage.clickFirstExample();
        assertTrue(dynamicLoadingPage.getText().contentEquals("Hello World!"));
    }
}
