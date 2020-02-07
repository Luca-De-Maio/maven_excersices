package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By exampleLink = By.cssSelector(".//*[text()[contains(.,'Example 1')]]");
    private By startButton = By.cssSelector(".//*[text()[contains(.,'Start')]]");
    private By finishField = By.id("finish");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFirstExample(){
        driver.findElement(exampleLink).click();
        driver.findElement(startButton).click();
    }

    public String getText(){
        return driver.findElement(finishField).getText();
    }


}
