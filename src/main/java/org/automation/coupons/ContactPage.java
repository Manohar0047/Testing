package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactPage {
    public static void setUp() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,2000)");
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[3]/ul/li[2]/a")).click();

    }
}
