package com.weborders.pages;

import com.weborders.tests.TestBase;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateVehicleFuelLogsPage extends BasePage {

    @FindBy(xpath = "//div[@class='pull-right title-buttons-container']/a")
    public WebElement CreateVehicleFuelLogst;

    @FindBy(css = "input[name='custom_entity_type[OdometerValue]']" )
    public WebElement odometerValueInput;

    @FindBy(css = "input[name='custom_entity_type[Liter]']")
    public WebElement literInput;

    @FindBy(css = "input[name='custom_entity_type[PricePerLiter]']")
    public WebElement pricePerLiterInput;

    @FindBy(css = "input[name='custom_entity_type[TotalPrice]']")
    public WebElement totalPriceInput;

   /*@FindBy(css = "input[name='date_selector_custom_entity_type_Date-uid-5f0e9db9429c0']")
    public WebElement dateInput;*/

  /* @FindBy(xpath = "//input[@id='date_selector_custom_entity_type_Date-uid-5f0ea3743d82f']")
    public WebElement dateInput;*/

    @FindBy(xpath = "//*[@placeholder='Choose a date']")
    public WebElement dateInput;


    @FindBy(css = "input[name='custom_entity_type[Purchaser]']")
    public WebElement purchaserInput;

    @FindBy(css = "input[name='custom_entity_type[InvoiceReference]']")
    public WebElement invoiceReferenceInput;


    @FindBy(css = "input[name='custom_entity_type[Vendor]']")
    public WebElement vendorInput;

    @FindBy(tagName = "textarea")
    public WebElement infoInput;

    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;



    public void CreateVehicleFuelLogs() throws InterruptedException {

         wait.until(ExpectedConditions.titleIs("Vehicle Fuel Logs - Entities - System - Car - Entities - System"));
         CreateVehicleFuelLogst.click();
         wait.until(ExpectedConditions.titleIs("Create Vehicle Fuel Logs - Entities - System - Car - Entities - System"));


         wait.until(ExpectedConditions.visibilityOf(odometerValueInput)).sendKeys(ConfigurationReader.getProperty("odometerValue"));
         wait.until(ExpectedConditions.visibilityOf(literInput)).sendKeys(ConfigurationReader.getProperty("literValue"));
         wait.until(ExpectedConditions.visibilityOf(pricePerLiterInput)).sendKeys(ConfigurationReader.getProperty("pricePerLiter"));
         wait.until(ExpectedConditions.visibilityOf(totalPriceInput)).sendKeys(ConfigurationReader.getProperty("totalPrice"));

          Actions action = new Actions(Driver.getDriver());
          action.moveToElement(dateInput).doubleClick().perform();

         wait.until(ExpectedConditions.visibilityOf(dateInput)).sendKeys(ConfigurationReader.getProperty("dateValue"));
         wait.until(ExpectedConditions.visibilityOf(purchaserInput)).sendKeys(ConfigurationReader.getProperty("purchaserValue"));
         wait.until(ExpectedConditions.visibilityOf(invoiceReferenceInput)).sendKeys(ConfigurationReader.getProperty("invoiceReferenceValue"));
         wait.until(ExpectedConditions.visibilityOf(vendorInput)).sendKeys(ConfigurationReader.getProperty("vendorValue"));
         wait.until(ExpectedConditions.visibilityOf(infoInput)).sendKeys(ConfigurationReader.getProperty("infoValue"));


         saveAndCloseButton.click();

         Thread.sleep(1000);
         wait.until(ExpectedConditions.visibilityOf(message));


      //WebElement message = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Entity saved')]"));

















}
}
