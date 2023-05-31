package org.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class OrangeHRM {

    WebDriver driver;

    @Parameters("browserName")
    @BeforeTest
    public void initialiseBrowser(@Optional("Chrome") String browserName) {
        switch (browserName) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Browser name is invalid");
                break;
        }
    }

    @Parameters("url")
    @Test
    public void launchApp(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(5000);
    }

    @Parameters({"username", "password"})
    @Test
    public void enterLoginDetails(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username"))
                .sendKeys(username);
        driver.findElement(By.name("password"))
                .sendKeys(password);
        driver.findElement(By.className("orangehrm-login-button")).click();
        Thread.sleep(5000);
    }

    @Parameters("sleepTime")
    @Test
    public void navigateToMyInfo(@Optional("3000") Integer sleepTime) throws InterruptedException {
        driver.findElement(By.linkText("My Info")).click();
        Thread.sleep(sleepTime);
    }

    @Test
    public void verifyMyInfo() {
        boolean actualValue = driver.findElement(By.className("orangehrm-edit-employee-name")).isDisplayed();
        assertTrue(actualValue);
    }

    @Test
    public void verifyLogin() {
        WebElement element = driver.findElement(By.className("oxd-topbar-header-breadcrumb-module"));
        assertTrue(element.isDisplayed());
        assertEquals(element.getText(), "Dashboard");
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}