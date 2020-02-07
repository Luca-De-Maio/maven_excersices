package forgot;

import base.BaseTests;
import com.solvd.lucademaio.pages.EmailSentPage;
import com.solvd.lucademaio.pages.ForgotPasswordPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        EmailSentPage emailSentPage = forgotPassword.retrievePassword("tau@example");
        assertEquals(emailSentPage.getAlertText(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
