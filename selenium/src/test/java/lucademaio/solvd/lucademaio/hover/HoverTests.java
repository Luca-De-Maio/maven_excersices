package lucademaio.solvd.lucademaio.hover;

import lucademaio.solvd.lucademaio.base.BaseTests;
import com.solvd.lucademaio.pages.HomePage;
import com.solvd.lucademaio.pages.HoversPage;
import com.solvd.lucademaio.pages.companion.FigureCaption;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = new HomePage(driver).clickHovers();
        FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "incorrect");
        assertEquals(caption.getLinkText(), "View profile", "caption incorrect");
    }



}
