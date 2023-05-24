package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DemoClass3 {
    public static void main(String[] args) {
        WebDriver driver1= new FirefoxDriver();
        driver1.manage().window().maximize();//maximizing the window
        driver1.get("https://www.ebay.com");
        WebElement search= driver1.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchButton= driver1.findElement(By.xpath("//input[@id='gh-btn']"));
        search.sendKeys("laptop");
        searchButton.click();
        List<WebElement> listOfPrice= driver1.findElements(By.xpath("//span[@class='s-item__price']"));

        for(WebElement price:listOfPrice){
            System.out.println(price.getText());
        }


        driver1.manage().window().minimize();
    }

}
