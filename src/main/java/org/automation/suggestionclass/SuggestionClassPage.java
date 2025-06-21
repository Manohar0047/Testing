package org.automation.suggestionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggestionClassPage {
    public static void setUp(String india) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("aus");

//        WebElement countrieslist = driver.findElement(By.id("autocomplete"));
//        List<WebElement> totalcountrieslist = countrieslist.findElements(By.tagName("type"));
//        System.out.println("The Total contries are :" +  totalcountrieslist.size());
//        //countrieslist.click();
    }
}
