package org.example.dataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DataProviderReturnTypes {

    @Test(dataProvider = "dataMultidimensionalArray")
    public void dataMultidimensionalArray(String username, String password) throws InterruptedException {
        System.out.println(username + " " + password);
    }

    @DataProvider(name = "dataMultidimensionalArray")
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

    @Test(dataProvider = "dataArrayOfString")
    public void dataArrayOfString(String data) {
        System.out.println(data);
    }

    @DataProvider(name = "dataArrayOfString")
    public String[] dataForArrayOfString() {
        return new String[]{
                "Aleks",
                "Saki",
                "Hardi"
        };
    }

    @Test(dataProvider = "dataForIteratorString")
    public void dataListOfString(String data) {
        System.out.println(data);
    }

    @DataProvider(name = "dataForIteratorString")
    public Iterator<String> dataForListOfString() {
        return Arrays.asList("Sanja", "Banja", "Vranja").iterator();
    }

    @Test(dataProvider = "dataForIteratorArrayOfObjects")
    public void dataListOfArrayObjects(Object[] data) {
        System.out.println(data[0] + " " + data[1]);
    }

    @DataProvider(name = "dataForIteratorArrayOfObjects")
    public Iterator<Object[]> dataForListOfArrayObjects() {
        Set<Object[]> data = new HashSet<>();
        data.add(new Object[] {"Saki", "taki"});
        data.add(new Object[] {"Fiki", "viki"});
        return data.iterator();
    }
}
