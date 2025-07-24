package org.automation.switchalertpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.resource.BasePage;

public class SwitchAlertPage {
    BasePage basePage = new BasePage();
    public void setUp() throws InterruptedException {
         basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollBy(0,1000)");
        basePage.getDriver().findElement(By.id("name")).sendKeys("Manohar");
        basePage.getDriver().findElement(By.id("alertbtn")).click();
        basePage.getDriver().quit();


    }
}
