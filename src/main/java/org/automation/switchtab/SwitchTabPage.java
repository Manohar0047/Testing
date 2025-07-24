package org.automation.switchtab;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.resource.BasePage;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class SwitchTabPage {
    BasePage basePage = new BasePage();

    @Test
    public void setUp() {
        basePage.launchBrowser();
        basePage.getDriver().findElement(By.id("opentab")).click();
//      String currentWindow =  basePage.getDriver().getWindowHandle();
//
//        System.out.println("Current Window: " + currentWindow);
//        basePage.getDriver().switchTo().window(currentWindow);
        Set<String> handles=basePage.getDriver().getWindowHandles();
        System.out.println("handles"+handles);
        for(String handle:handles){
            if(!handle.equalsIgnoreCase(handles.toString())){
                basePage.getDriver().switchTo().window(handle);
                WebDriverWait wait=new WebDriverWait(basePage.getDriver(), Duration.ofMinutes(3));
                basePage.getDriver().findElement(By.xpath("//a[contains(text(), 'Courses')]")).getText();
                basePage.getDriver().findElement(By.xpath("//a[contains(text(), 'Courses')]")).click();

            }
        }
//        basePage.getDriver().findElement(By.xpath("//a[contains(text(), 'Courses')]")).getText();



    }
}
