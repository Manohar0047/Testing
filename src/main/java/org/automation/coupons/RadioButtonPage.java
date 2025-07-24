package org.automation.coupons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;

public class RadioButtonPage {
    BasePage basePage = new BasePage();

    @FindBy(xpath = "(//input[@name='radioButton'])[1]")
    WebElement button;

    public void setUp() {
        basePage.launchBrowser();
//        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
//        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
//        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
        basePage.getDriver().close();

        button.click();

    }
}
