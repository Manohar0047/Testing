package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.resource.BasePage;

public class CheckBoxPage {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.id("checkBoxOption1")).click();
        basePage.getDriver().findElement(By.id("checkBoxOption2")).click();
        basePage.getDriver().findElement(By.id("checkBoxOption3")).click();
        basePage.getDriver().close();

    }
}
