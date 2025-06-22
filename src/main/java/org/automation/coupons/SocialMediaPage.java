package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.resource.BasePage;

public class SocialMediaPage {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();

        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        basePage.getDriver().findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[4]/ul/li[2]/a")).click();

    }
}
