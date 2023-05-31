package org.example.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderShare1 {

    //Data Provider is in DataProvideShare2 class
    @Test(dataProvider = "dataArrayOfString", dataProviderClass = DataProviderShare2.class)
    public void dataArrayOfString(String data) {
        System.out.println(data);
    }
}
