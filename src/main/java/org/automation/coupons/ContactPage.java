package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;

public class ContactPage {
    BasePage basePage = new BasePage();

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr/td[3]/ul/li[2]/a")
    WebElement base;

    public void setUp() {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollBy(0,2000)");
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //basePage.getDriver().findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[3]/ul/li[2]/a")).click();
        basePage.tearDown();
        base.click();
    }
}
