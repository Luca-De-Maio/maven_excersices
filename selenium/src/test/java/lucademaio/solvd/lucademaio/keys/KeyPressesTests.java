package lucademaio.solvd.lucademaio.keys;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.HomePage;
import com.solvd.lucademaio.pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testBackspace() {
        KeyPressesPage keyPressesPage = new HomePage(driver).clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");

    }
}
