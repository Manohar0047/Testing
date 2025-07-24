package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;

public class SocialMediaPage {
    BasePage basePage = new BasePage();

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr/td[4]/ul/li[2]/a")
    WebElement table;

    public void setUp() {
        basePage.launchBrowser();

        JavascriptExecutor scroll = (JavascriptExecutor) BasePage.getDriver();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        table.click();

    }
}
