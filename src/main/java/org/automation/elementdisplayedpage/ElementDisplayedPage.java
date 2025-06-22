package org.automation.elementdisplayedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.resource.BasePage;

public class ElementDisplayedPage {
    BasePage basePage = new BasePage();

    public void setUp() throws InterruptedException {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollBy(0,500)");
        basePage.getDriver().findElement(By.id("displayed-text")).sendKeys("Hide The Element keys");
        Thread.sleep(3000);
        basePage.getDriver().findElement(By.id("hide-textbox")).click();
        Thread.sleep(2000);
        basePage.getDriver().findElement(By.id("show-textbox")).sendKeys("Hide The Element keys");
        Thread.sleep(2000);
        basePage.getDriver().quit();

    }
}
