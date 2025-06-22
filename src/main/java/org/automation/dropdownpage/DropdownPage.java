package org.automation.dropdownpage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.resource.BasePage;

import java.util.List;

public class DropdownPage {
    BasePage basePage = new BasePage();

    public void setUp() throws InterruptedException {
        basePage.launchBrowser();
        WebElement dropdown = basePage.getDriver().findElement(By.id("dropdown-class-example"));
        List<WebElement> dropdownvalue = dropdown.findElements(By.tagName("option"));
        System.out.println("The Elements stored in the dropdown page are:" + dropdownvalue.size());
        for (WebElement webElement : dropdownvalue) {
            System.out.println(webElement.getText());
            Select option = new Select(dropdown);
            Thread.sleep(2000);
            option.selectByIndex(1);


        }


    }
}
