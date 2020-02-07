package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends AbstractBasePage{
    @FindBy(xpath = ".//button[text():'Click for JS Alert']")
    private WebElement alertButtonField;

    @FindBy(id = "resul")
    private WebElement acceptButtonField;


    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void clickAlertButton(){
        alertButtonField.click();
    }

    public void acceptAlertButton(){
        driver.switchTo().alert().accept();
    }

    public String getAcceptButtonField() {
        return acceptButtonField.getText();
    }
}
