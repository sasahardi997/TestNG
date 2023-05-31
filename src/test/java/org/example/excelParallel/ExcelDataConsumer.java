package org.example.excelParallel;

import org.testng.annotations.Test;

public class ExcelDataConsumer {

    //We must use thread count from xml to split threads into groups
    @Test(dataProvider = "data", dataProviderClass = ExcelDataProvider.class)
    public void previewExcelData(String[] s) {
        System.out.println("Username: " + s[0] + ", Password: " + s[1]);
    }
}
