package org.automation.coupons;

import org.openqa.selenium.By;
import org.resource.BasePage;

public class RadioButtonPage {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[1]")).click();
        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
        basePage.getDriver().findElement(By.xpath("(//input[@name='radioButton'])[3]")).click();
        basePage.getDriver().close();

    }
}
