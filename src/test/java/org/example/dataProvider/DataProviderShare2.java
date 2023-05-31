package org.example.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderShare2 {

    @DataProvider(name = "dataArrayOfString", indices = {0,2})
    public String[] dataForArrayOfString() {
        return new String[]{
                "Aleks",
                "Saki",
                "Hardi"
        };
    }
}
