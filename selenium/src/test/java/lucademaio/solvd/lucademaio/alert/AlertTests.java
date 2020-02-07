package lucademaio.solvd.lucademaio.alert;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.AlertPage;
import com.solvd.lucademaio.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {

    @Test
    public void alertTests(){
        AlertPage alertPage = new HomePage(driver).clickAlertPage();
        alertPage.clickAlertButton();
        alertPage.acceptAlertButton();
        assertEquals(alertPage.getAcceptButtonField(),"You successfuly clicked an com.alert", "Incorrect");
    }
}
