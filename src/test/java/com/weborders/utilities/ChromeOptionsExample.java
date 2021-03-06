package com.weborders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("test-type");
        options.addArguments("allow-running-insecure-content");
        options.addArguments("disable-extensions");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("test-type=browser");
        options.addArguments("disable-infobars");
        ChromeDriver driver= new ChromeDriver(options);
        driver.get("http://youtube.com");
    }
}
