package lucademaio.solvd.lucademaio.login;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.HomePage;
import com.solvd.lucademaio.pages.LoginPage;
import com.solvd.lucademaio.pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new HomePage(driver).clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert test is incorrect");
    }
}
