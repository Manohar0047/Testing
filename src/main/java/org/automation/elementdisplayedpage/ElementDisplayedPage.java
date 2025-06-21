package org.automation.elementdisplayedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedPage {
    public static void setUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("displayed-text")).sendKeys("Hide The Element keys");
        Thread.sleep(3000);
        driver.findElement(By.id("hide-textbox")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("show-textbox")).sendKeys("Hide The Element keys");
        Thread.sleep(2000);
        driver.quit();

    }
}
