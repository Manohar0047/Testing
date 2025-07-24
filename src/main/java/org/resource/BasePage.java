package org.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    public static WebDriver driver;

    public void launchBrowser() {

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }

}
