package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VehicleFuelLogsPage extends BasePage {
    @FindBy(xpath = "//span[@class='title title-level-1']")
    private WebElement dropDownFleetManagement;

    @FindBy(xpath = "//span[.='Vehicles Fuel Logs']")
    private WebElement VehicleFuelLog;


    public void VehicleFuelLogPage() {
       Actions action = new Actions(Driver.getDriver());
        //wait.until(ExpectedConditions.titleIs("Dashboard"));
        //click on "fleet"
        action.moveToElement(dropDownFleetManagement).click().perform();
       // VehicleFuelLog.click();
        wait.until(ExpectedConditions.visibilityOf(dropDownFleetManagement));
        //click on "VehicleFuelLog"
        //action.moveToElement(VehicleFuelLog).click().perform();
        VehicleFuelLog.click();

        wait.until(ExpectedConditions.titleIs("Vehicle Fuel Logs - Entities - System - Car - Entities - System"));


    }
}
