package org.edgeautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgePractice {
    @Test
    public void edgePractice() {
        WebDriver driver = new EdgeDriver();
        System.setProperty("Webdriver.edge.driver", "drivers/Edge/msedgedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");



    }
    @Test
    public void browserLaunch(String browser){
        if(browser.equals("Edge")){
            WebDriver driver = new EdgeDriver();
            System.setProperty("Webdriver.edge.driver", "drivers/Edge/msedgedriver.exe");
            driver.manage().window().maximize();
            driver.get("https://www.linkedin.com/login");

        }
        else if (browser.equals("Chrome")){
            WebDriver driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/chrome.exe");
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        }
        else{
            System.out.println("Browser Not Found");
        }
    }

}
