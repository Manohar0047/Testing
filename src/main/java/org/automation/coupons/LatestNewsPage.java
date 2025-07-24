package org.automation.coupons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resource.BasePage;
import org.resource.Utility;

import java.io.IOException;

public class LatestNewsPage {
    BasePage basePage = new BasePage();
    WebDriver driver;

    public LatestNewsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr/td[2]/ul/li[2]/a")
    WebElement table;

    public void setUp() throws IOException {
        basePage.launchBrowser();
        JavascriptExecutor scroll = (JavascriptExecutor) BasePage.getDriver();
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        table.click();


    }

}
