package org.automation.switchalertpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlertPage {
    public static void setUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.id("name")).sendKeys("Manohar");
        Thread.sleep(2000);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
