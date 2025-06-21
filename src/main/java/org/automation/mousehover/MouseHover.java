package org.automation.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void setUp() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.id("mousehover"))).perform();
        //driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]")).click();
       driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]")).click();

    }
}
