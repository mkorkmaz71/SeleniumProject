package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();//maximizing the window
        driver.get("https://www.amazon.com");
        WebElement link= driver.findElement(By.xpath("//a [@data-csa-c-slot-id='nav_cs_12']"));
        link.click();
        WebElement newArrivals= driver.findElement(By.xpath("//img [@alt='New Arrivals']"));
        newArrivals.click();
        WebElement magnolia= driver.findElement(By.xpath("//li [@id='sobe_d_aw_2_1']/a [@class='sl-sobe-carousel-sub-card-link']"));
        magnolia.click();
        WebElement video= driver.findElement(By.xpath("//div [@class='vjs-poster']"));
        video.click();

    }
}
