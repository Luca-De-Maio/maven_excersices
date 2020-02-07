package lucademaio.solvd.lucademaio.dropdown;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.DropdownPage;
import com.solvd.lucademaio.pages.HomePage;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        DropdownPage dropDownPage = new HomePage(driver).clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions(option);
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
