package org.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class FirstTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        driver.findElement(By.name("q")).sendKeys("Filip stajic", Keys.ENTER);
        String expectedTitle = "Filip stajic - Google Search";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle, "expected title is correct");
        driver.quit();
    }

    @Test
    public void testFacebook() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sr-rs.facebook.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("email")).sendKeys("Aleksandar Hardi");
        driver.findElement(By.name("login")).click();

        String title = driver.getTitle();
        String expected = "Пријављивање на Фејсбук------------";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title, expected, "Title is missed matched"); //Exception
        driver.quit(); //With soft assert, program continuous execution, and exception is thrown at the end
        softAssert.assertAll(); //this throws an exception
    }
}
