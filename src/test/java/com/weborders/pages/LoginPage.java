package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    private WebElement userNameElement;

    @FindBy(id = "prependedInput2")
    private WebElement passwordElement;

    public void login(String userName, String password){
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
    }

    public void login(){
        String userName = ConfigurationReader.getProperty("usernameTruckDrivers");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
    }

}
