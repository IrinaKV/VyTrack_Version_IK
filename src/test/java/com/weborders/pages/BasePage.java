package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    // a design which makes it easy to access the page object class
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
