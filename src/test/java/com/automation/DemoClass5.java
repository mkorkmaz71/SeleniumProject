package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DemoClass5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Wait for each command to get success response till 60 sec maximum
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //  1. Open Website
        driver.get("https://www.ebay.com/");

        // 2. Create web element using select tag
        WebElement dropdown = driver.findElement(By.id("gh-cat"));

        // 3. Wrap that web element using select class methods
        Select catDropDown= new Select(dropdown);

        // 4. Select the option by using text
        catDropDown.selectByVisibleText("Baby");
        catDropDown.selectByIndex(15);
        catDropDown.selectByValue("58058");

        List<WebElement> listOfOptions= catDropDown.getOptions();
        for(WebElement options: listOfOptions){
            System.out.println(options.getText());
        }
    }
}
