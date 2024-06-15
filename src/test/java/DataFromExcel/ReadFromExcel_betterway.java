package DataFromExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel_betterway {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/debopriyadebroy/Documents/Developer/Nexxvali /Test_Automation_Codes/src/test/java/DataFromExcel/TestData.xlsx");
        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);

        //For files with extension .xls you need to use the HSSFWorkbook class
        //  HSSFWorkbook wb = new HSSFWorkbook(fis);
        //  HSSFSheet sheet1 = wb.getSheetAt(0);


        // Iterate over all rows
        for (Row row : sheet1) {
            for (Cell cell : row) {
                System.out.print(cell.getStringCellValue() + "\t");
            }
            System.out.println();
        }

        wb.close();
    }
}
