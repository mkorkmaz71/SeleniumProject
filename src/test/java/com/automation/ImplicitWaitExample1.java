package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImplicitWaitExample1 {
    public static void main(String[] args) {
        WebDriver driver1= new ChromeDriver();
        driver1.manage().window().maximize();//maximizing the window
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver1.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement start = driver1.findElement(By.xpath("//div [@id = 'start']/button"));
        start.click();
        WebElement text = driver1.findElement(By.xpath("//div[@id = 'finish'] /h4"));
        System.out.println(text.getText());
    }
}
