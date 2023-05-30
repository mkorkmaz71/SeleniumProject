package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SystemClassExample {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//maximizing the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUpload= driver.findElement(By.id("file-upload"));
        WebElement uploadBtn= driver.findElement(By.id("file-submit"));

        String directory=System.getProperty("user.dir");

        fileUpload.sendKeys(directory+"/target/screenshot.png");
        uploadBtn.click();

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileDownload= driver.findElement(By.xpath("//a[text()='cat-no.gif']"));
        System.out.println(fileDownload.isDisplayed());
        fileDownload.click();
    }
}
