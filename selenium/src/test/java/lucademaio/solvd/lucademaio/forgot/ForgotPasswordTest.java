package lucademaio.solvd.lucademaio.forgot;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.EmailSentPage;
import com.solvd.lucademaio.pages.ForgotPasswordPage;
import com.solvd.lucademaio.pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        ForgotPasswordPage forgotPassword = new HomePage(driver).clickForgotPassword();
        EmailSentPage emailSentPage = forgotPassword.retrievePassword("tau@example");
        assertEquals(emailSentPage.getAlertText(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
