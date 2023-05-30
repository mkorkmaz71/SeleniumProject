package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JavaScriptExample1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//maximizing the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");


        JavascriptExecutor js = (JavascriptExecutor)driver;
       for(int i=0;i<10;i++) {
           js.executeScript("window.scrollBy(0,-1000)");
           Thread.sleep(500);
       }
       
    }
}
