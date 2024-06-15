package DataFromExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/debopriyadebroy/Documents/Developer/Nexxvali /Test_Automation_Codes/src/test/java/DataFromExcel/TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);


        //For files with extension .xls you need to use the HSSFWorkbook class
        //  HSSFWorkbook wb = new HSSFWorkbook(fis);
        //  HSSFSheet sheet1 = wb.getSheetAt(0);

        String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is " + data0);

        String data1 = sheet1.getRow(2).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is " + data1);

        wb.close();
    }
}
