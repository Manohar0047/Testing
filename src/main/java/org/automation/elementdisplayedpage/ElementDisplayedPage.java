package org.automation.elementdisplayedpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;

public class ElementDisplayedPage {
    BasePage basePage = new BasePage();

    @FindBy(id = "displayed-text")
    WebElement table;

    public void setUp() throws InterruptedException {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollBy(0,500)");
        // basePage.getDriver().findElement(By.id("displayed-text")).sendKeys(displayed-text");
        basePage.getDriver().findElement(By.id("hide-textbox")).click();
        basePage.getDriver().findElement(By.id("show-textbox")).sendKeys("Hide The Element keys");
        basePage.getDriver().quit();

    }
}
