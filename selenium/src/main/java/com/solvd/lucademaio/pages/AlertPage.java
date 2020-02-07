package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By alertButtonField = By.xpath(".//button[text():'Click for JS Alert']");
    private By acceptButtonField = By.id("resul");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlertButton(){
        driver.findElement(alertButtonField).click();
    }

    public void acceptAlertButton(){
        driver.switchTo().alert().accept();
    }

    public String getAcceptButtonField() {
        return driver.findElement(acceptButtonField).getText();
    }
}
