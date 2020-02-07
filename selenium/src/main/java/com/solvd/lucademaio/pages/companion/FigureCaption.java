package com.solvd.lucademaio.pages.companion;

import com.solvd.lucademaio.pages.AbstractBasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FigureCaption extends AbstractBasePage {
    private WebElement caption;
    @FindBy(tagName = "h5")
    private WebElement header;
    @FindBy(tagName = "a")
    private WebElement link;

    public FigureCaption(WebDriver driver, WebElement caption) {
        super(driver);
        this.caption = caption;
    }

    public boolean isCaptionDisplayed(){
        return caption.isDisplayed();
    }

    public String getTitle(){
        return header.getText();
    }

    public String getLink(){
        return link.getAttribute("href");
    }

    public String getLinkText(){
        System.out.println(link.getText());
        return link.getText();
    }
}
