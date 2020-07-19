package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.VehicleFuelLogsPage;
import com.weborders.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
//10.As a truck driver I should be able to access Vehicle Fuel Logs
    /*
    "1.Verify that truck driver should be able to see all Vehicle Fuel information on the grid
2.Verify that truck driver should be able to create Vehicle Fuel logs or cancel it
3.Verify that truck driver should be able to Edit , delete Vehicle Fuel Logs or
add attachement , add event
4.Verfiy that truck driver should be able to reset the grid by clicking on Grid setting"
     */

public class VehicleFuelLogsTest extends TestBase{

    @Test(description = "US#10_TC1_Verify_ruck_driver_see_Vehicle_Fuel_information_and verify title")
    public void Vehicle_FuelTest(){
        //Just login
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        //verify title
        String actualDashboardTitle = Driver.getDriver().getTitle();
        String expectedDashboardTitle= "Dashboard";
        Assert.assertEquals(actualDashboardTitle, expectedDashboardTitle, "Page title is wrong!");

        //click on fleet, then on Vehicle_Fuel_Logs

        VehicleFuelLogsPage vehicleFuelLogsPage = new VehicleFuelLogsPage();
        vehicleFuelLogsPage.VehicleFuelLogPage();

        //verify title

        String actualFuelLogsTitle = Driver.getDriver().getTitle();
        String expectedFuelLogsTitle= "Vehicle Fuel Logs - Entities - System - Car - Entities - System";
        Assert.assertEquals(actualFuelLogsTitle, expectedFuelLogsTitle,"Page title is wrong!" );
    }



}
