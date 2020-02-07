package lucademaio.solvd.lucademaio.time;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.DynamicLoadingPage;
import com.solvd.lucademaio.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TimeTests extends BaseTests {

    @Test
    public void timeTests(){
        DynamicLoadingPage dynamicLoadingPage = new HomePage(driver).clickDynamicLoading();
        dynamicLoadingPage.clickFirstExample();
        assertTrue(dynamicLoadingPage.getText().contentEquals("Hello World!"));
    }
}
