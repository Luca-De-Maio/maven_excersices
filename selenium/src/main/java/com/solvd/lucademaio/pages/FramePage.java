package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends AbstractBasePage{
    @FindBy(id = "tinymce")
    private WebElement textAreaField;
    String editorIframeId = "mce_0_ifr";

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public void clearTextArea(){
        switchToEditArea();
        textAreaField.clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        textAreaField.sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea(){
        switchToEditArea();
        String str = textAreaField.getText();
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
