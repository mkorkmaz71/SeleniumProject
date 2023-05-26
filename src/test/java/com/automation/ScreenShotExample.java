package com.automation;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShotExample {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.com/");

        //Get Screenshot
        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot,new File("target//screenshot.png"));

        driver.manage().window().minimize();
    }
}
