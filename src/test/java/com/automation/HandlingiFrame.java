package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingiFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement iFrame=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrame);

        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));

        textBox.clear();
        textBox.sendKeys("Mustafa Korkmaz");

        driver.switchTo().defaultContent();

        WebElement text = driver.findElement(By.xpath("//div[@id='content']/div/h3"));
        String title= text.getText();

        driver.switchTo().frame(iFrame);

        WebElement textBox1 = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        textBox1.clear();
        textBox1.sendKeys(title);
        driver.manage().window().minimize();
    }
}
