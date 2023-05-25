package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver1= new ChromeDriver();
        driver1.manage().window().maximize();//maximizing the window
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver1.get("https://www.minted.com/");
        WebElement email= driver1.findElement(By.xpath("//div[@class='bx-inputwrap']/input"));
        email.sendKeys("mustafa.korkmaz@yahoo.com");


    }
}
