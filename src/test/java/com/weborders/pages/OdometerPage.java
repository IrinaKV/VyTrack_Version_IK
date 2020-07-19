package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OdometerPage extends BasePage{
    @FindBy(xpath = "//span[@class='title title-level-1']")
    private WebElement dropDownFleetManagement;

    @FindBy(xpath ="//span[.='Vehicle Odometer']")
    private WebElement dropDownFleet;


    public void odometerPage() {

        //wait.until(ExpectedConditions.titleIs("Dashboard"));
        //click on "fleet"
        dropDownFleetManagement.click();
        wait.until(ExpectedConditions.visibilityOf(dropDownFleetManagement));
        dropDownFleet.click();
        //click on "Vehicle Odometer"
        wait.until(ExpectedConditions.titleIs("Vehicle Odometer - Entities - System - Car - Entities - System"));


    }


}
