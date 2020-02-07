package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends AbstractBasePage{

    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "form_submit")
    private WebElement retrievePasswordButton;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){
       emailField.sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){
        retrievePasswordButton.click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }

}
