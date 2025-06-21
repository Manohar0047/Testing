package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPage {
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
        driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
        driver.close();

    }
}
