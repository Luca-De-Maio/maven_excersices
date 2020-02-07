package com.solvd.lucademaio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends AbstractBasePage{
    @FindBy(id = "dropdown")
    private WebElement dropdown;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public Select selectFromDropDown(String option){
       Select select = new Select(dropdown);
       select.selectByVisibleText(option);
       return select;
    }

    public List<String> getSelectedOptions(String option){
        List<WebElement> selectedElements = selectFromDropDown(option).getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }


}
