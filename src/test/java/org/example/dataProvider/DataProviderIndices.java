package org.example.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {

    @Test(dataProvider = "dataArrayOfString")
    public void dataArrayOfString(String data) {
        System.out.println(data);
    }

    //This still works, Idk how
    @DataProvider(name = "dataArrayOfString", indices = {0,2})
    public String[] dataForArrayOfString() {
        return new String[]{
                "Aleks",
                "Saki",
                "Hardi"
        };
    }
}
