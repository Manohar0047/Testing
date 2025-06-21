package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPage {
    public static void setUp() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption2")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        driver.close();

    }
}
