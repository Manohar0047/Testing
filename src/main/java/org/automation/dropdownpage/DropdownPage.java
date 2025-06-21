package org.automation.dropdownpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage {
    public static void setUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        List<WebElement> dropdownvalue = dropdown.findElements(By.tagName("option"));
        System.out.println("The Elements stored in the dropdown page are:" + dropdownvalue.size());
        for (int i = 0; i < dropdownvalue.size(); i++) {
            System.out.println(dropdownvalue.get(i).getText());
            Select option = new Select(dropdown);
            Thread.sleep(2000);
            option.selectByIndex(1);


        }


    }
}
