package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OdometerPage;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test(description = "Just login and verify title")
    public void loginTest(){
        //Just login
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        //verify title
        String actualDashboardTitle = Driver.getDriver().getTitle();
        String expectedDashboardTitle= "Dashboard";
        Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle, "Page title is wrong!");


    }




}
