package org.example.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DataProviderTest {

    WebDriver driver;

    @BeforeMethod
    public void initialiseBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
    }

    @Test(dataProvider = "loginTestData")
    public void enterLoginDetails(String username, String password) throws InterruptedException {
        driver.findElement(By.name("username"))
                .sendKeys(username);
        driver.findElement(By.name("password"))
                .sendKeys(password);
        driver.findElement(By.className("orangehrm-login-button")).click();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.className("oxd-topbar-header-breadcrumb-module"));
        assertTrue(element.isDisplayed());
        assertEquals(element.getText(), "Dashboard");
    }

    @DataProvider(name = "loginTestData")
    public Object[][] loginData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "Admin";
        data[0][1] = "admin123";

        data[1][0] = "Admin";
        data[1][1] = "test123";

        data[2][0] = "Admin";
        data[2][1] = "admin123";

        return data;
    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }

}
