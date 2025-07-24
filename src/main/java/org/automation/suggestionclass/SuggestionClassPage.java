package org.automation.suggestionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.resource.BasePage;
import org.resource.Utility;

public class SuggestionClassPage {
    BasePage basePage = new BasePage();

    @FindBy (id = "autocomplete")
    WebElement name;

    public void setUp(String india) {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.id("autocomplete")).sendKeys(Utility.getProperty("country"));

          name.click();
    }
}
