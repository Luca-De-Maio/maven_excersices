package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends AbstractBasePage{
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
