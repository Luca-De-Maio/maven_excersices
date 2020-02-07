package com.solvd.lucademaio.pages;

import com.solvd.lucademaio.pages.companion.FigureCaption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HoversPage extends AbstractBasePage {
    @FindBy(className = "figure")
    private List<WebElement> figureBox;

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @param index starts at 1
     */
    public FigureCaption hoverOverFigure(int index) {
        WebElement figure = figureBox.get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).build().perform();

        return new FigureCaption(driver, driver.findElement(By.className("figcaption")));
    }

}
