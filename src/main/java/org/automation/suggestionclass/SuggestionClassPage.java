package org.automation.suggestionclass;

import org.openqa.selenium.By;
import org.resource.BasePage;

public class SuggestionClassPage {

    BasePage basePage = new BasePage();

    public void setUp(String india) {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.id("autocomplete")).sendKeys("aus");

    }
}
