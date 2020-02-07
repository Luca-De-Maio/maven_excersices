package com.solvd.lucademaio.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends AbstractBasePage{

    @FindBy(id = "range")
    private WebElement sliderValue;
    @FindBy(css = ".sliderContainer input")
    private WebElement slider;

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public String getSliderValue(){
        return sliderValue.getText();
    }

    public void setSliderValue(String value){
        while(!getSliderValue().equals(value)) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
