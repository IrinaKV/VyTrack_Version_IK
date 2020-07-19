package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OdometerPage;
import com.weborders.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
//"4.As an authorized user I should be
//access to Vehicle odometer page."
//"1.Verify that Only truck driver and admin can access to vehicle odometer page
//2.Verify that non autorized user Not able to access Vehicle odometer page
//(Note: Non authorized users : Store manager, Sales manager )"

public class OdometerTest extends TestBase{

    @Test(description = "US#4_login and click on fleet, then on Vehicle Odometer and verify title")
    public void odometerPageTest(){
        //Just login
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        //verify title
        String actualDashboardTitle = Driver.getDriver().getTitle();
        String expectedDashboardTitle= "Dashboard";
        Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle, "Page title is wrong!");

        //click on fleet, then on Vehicle Odometer
        OdometerPage odometerPage = new OdometerPage();
        odometerPage.odometerPage();
        //verify title
        String actualOdometerTitle = Driver.getDriver().getTitle();
        String expectedOdometerTitle= "Vehicle Odometer - Entities - System - Car - Entities - System";
        Assert.assertEquals(actualOdometerTitle, expectedOdometerTitle,"Page title is wrong!" );
    }

}
