package org.automation.mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.resource.BasePage;


public class MouseHover {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollBy(0,1000)");
        Actions action = new Actions(basePage.getDriver());
        action.click(basePage.getDriver().findElement(By.id("mousehover"))).perform();
        basePage.getDriver().findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]")).click();

    }
}
