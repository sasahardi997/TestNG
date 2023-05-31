package org.example.excelParallel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataProvider {

    @Test
    @DataProvider(name = "data", parallel = true)
    public String[][] getDataFromExcel() throws IOException {
        File excelFile = new File("./src/test/resources/Users.xls");
        FileInputStream fis = new FileInputStream(excelFile);

        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(0);

        int numOfRows = sheet.getPhysicalNumberOfRows();
        int numOfColumns = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[numOfRows - 1][numOfColumns];
        for(int i = 1; i < numOfRows; i++) {
            for(int j = 0; j < numOfColumns; j++) {
                DataFormatter df = new DataFormatter();
                String value = df.formatCellValue(sheet.getRow(i).getCell(j));
                data[i - 1][j] =  value;
            }
        }
        workbook.close();
        fis.close();
        return data;
    }
}
