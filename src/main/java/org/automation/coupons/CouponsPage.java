package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.resource.BasePage;


public class CouponsPage {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        basePage.getDriver().findElement(By.xpath("(//li[@class='gf-li'])[2]")).click();
    }
}
