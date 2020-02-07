package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private WebDriver driver;
    private By textAreaField = By.id("tinymce");
    String editorIframeId = "mce_0_ifr";

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textAreaField).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textAreaField).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea(){
        switchToEditArea();
        String str = driver.findElement(textAreaField).getText();
        switchToMainArea();
        return str;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
