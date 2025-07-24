package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;


public class CouponsPage {
    BasePage basePage = new BasePage();
    @FindBy(xpath = "(//li[@class='gf-li'])[2]")
    WebElement table;

    public void setUp() {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) basePage.getDriver();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //basePage.getDriver().findElement(By.xpath("(//li[@class='gf-li'])[2]")).click();
        table.click();
    }
}
