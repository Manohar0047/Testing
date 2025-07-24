package org.resource;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.resource.BasePage.driver;

public class Utility {
    private static Properties prop;

    public static Properties getProperties() {
        if (prop == null) {
            try {
                FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\AutomationPractice\\src\\main\\data.properties");
                prop = new Properties();
                prop.load(fis);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;

    }

    public static String getProperty(String key) {
        return getProperties().getProperty(key);


    }

    @Test
    public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            new File("screenshots").mkdirs();
            File destination = new File("screenshots/" + fileName + ".png");
            FileUtils.copyFile(screenshot, destination);
            System.out.println("Screenshot saved: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }
}


