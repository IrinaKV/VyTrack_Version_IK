package com.weborders.tests;

import com.weborders.pages.CreateVehicleFuelLogsPage;
import com.weborders.pages.LoginPage;
import com.weborders.pages.VehicleFuelLogsPage;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CreateVehicleFuelLogsTest extends TestBase {
    //10.As a truck driver I should be able to access Vehicle Fuel Logs
    /*
    "1.Verify that truck driver should be able to see all Vehicle Fuel information on the grid
2.Verify that truck driver should be able to create Vehicle Fuel logs or cancel it
3.Verify that truck driver should be able to Edit , delete Vehicle Fuel Logs or
add attachement , add event
4.Verfiy that truck driver should be able to reset the grid by clicking on Grid setting"
     */
    @Test(description = "US#10_TC2_Verify_ruck_driver_create Vehicle Fuel logs or cancel it")
    public void Vehicle_createFuelLogTest() throws InterruptedException {
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

        CreateVehicleFuelLogsPage createVehicleFuelLogsPage = new CreateVehicleFuelLogsPage();
        createVehicleFuelLogsPage.CreateVehicleFuelLogs();

        Assert.assertTrue(createVehicleFuelLogsPage.message.isDisplayed(),"message did not catch");






      /* WebElement entrySaved = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Entity saved')]"));
        Assert.assertTrue(entrySaved.isDisplayed());
*/

        /*Alert alert = Driver.getDriver().switchTo().alert();
        String expectedMessage = alert.getText();
        String actualMessage="Entity saved";
        Assert.assertTrue(expectedMessage.equals(actualMessage));

*/



    }

}
