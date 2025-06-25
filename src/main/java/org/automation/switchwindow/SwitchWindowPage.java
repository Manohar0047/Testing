package org.automation.switchwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resource.BasePage;
import org.testng.Assert;

public class SwitchWindowPage {
    BasePage basePage = new BasePage();
    public void setUp() {
        basePage.launchBrowser();
//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
//        driver.manage().window().maximize();
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        basePage.getDriver().findElement(By.id("openwindow")).click();
        //driver.close();

    }
}
