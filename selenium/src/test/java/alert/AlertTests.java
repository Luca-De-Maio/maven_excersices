package alert;

import base.BaseTests;
import com.solvd.lucademaio.pages.AlertPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {

    @Test
    public void alertTests(){
        AlertPage alertPage = homePage.clickAlertPage();
        alertPage.clickAlertButton();
        alertPage.acceptAlertButton();
        assertEquals(alertPage.getAcceptButtonField(),"You successfuly clicked an alert", "Incorrect");
    }
}
