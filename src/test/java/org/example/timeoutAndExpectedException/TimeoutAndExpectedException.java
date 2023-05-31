package org.example.timeoutAndExpectedException;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeoutAndExpectedException {

    @Test(timeOut = 10_000, expectedExceptions = {ThreadTimeoutException.class})
    public void testMethod1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.quit();
    }
}
