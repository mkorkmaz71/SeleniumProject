package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass1 {
    public static void main(String[] args) {

        WebDriver driver1= new FirefoxDriver();
        driver1.manage().window().maximize();//maximizing the window
        driver1.get("https://www.saucedemo.com");
        System.out.println(driver1.getCurrentUrl());// get url
        System.out.println(driver1.getTitle()); // get title of the page

        WebElement username= driver1.findElement(By.id("user-name"));// username id identified
        WebElement password= driver1.findElement(By.id("password"));// password id identified
        WebElement loginButton= driver1.findElement(By.id("login-button"));// login button id identified

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");//valid credentials
        loginButton.click();

    }
}
