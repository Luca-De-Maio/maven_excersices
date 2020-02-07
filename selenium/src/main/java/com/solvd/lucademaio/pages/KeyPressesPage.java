package com.solvd.lucademaio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends AbstractBasePage{
    @FindBy(id = "target")
    private WebElement inputField;
    @FindBy(id = "result")
    private WebElement resultField;

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text){
        inputField.sendKeys(text);
    }

    public String getResult(){
        return resultField.getText();
    }
}
