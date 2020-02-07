package hover;

import base.BaseTests;
import com.solvd.lucademaio.pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "caption incorrect");
        assertEquals(caption.getLinkText(), "View profile", "caption incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "incorrect");
    }



}
