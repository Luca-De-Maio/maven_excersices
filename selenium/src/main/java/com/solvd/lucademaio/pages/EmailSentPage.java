package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailSentPage extends AbstractBasePage{

    @FindBy(id = "content")
    private WebElement contentArea;

    public EmailSentPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        return contentArea.getText();
    }
}
