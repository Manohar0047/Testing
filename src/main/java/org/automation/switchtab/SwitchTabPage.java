package org.automation.switchtab;

import org.openqa.selenium.By;
import org.resource.BasePage;

public class SwitchTabPage {
    BasePage basePage = new BasePage();

    public void setUp() {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.id("opentab")).click();


    }
}
