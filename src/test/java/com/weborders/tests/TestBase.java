package com.weborders.tests;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestBase {
//testbase class has the common steps for all my tests
    @BeforeMethod
    public void setup(){
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();

    }
}
