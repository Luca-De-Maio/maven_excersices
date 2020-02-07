package com.solvd.lucademaio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends AbstractBasePage {
    @FindBy(css = ".//*[text()[contains(.,'Example 1')]]")
    private WebElement exampleLink;
    @FindBy(css = ".//*[text()[contains(.,'Start')]]")
    private WebElement startButton;
    @FindBy(id = "finish")
    private WebElement finishField;

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstExample(){
        exampleLink.click();
        startButton.click();
    }

    public String getText(){
        return finishField.getText();
    }
}
