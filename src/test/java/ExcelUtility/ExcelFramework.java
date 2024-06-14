package ExcelUtility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelFramework {
    XSSFWorkbook wb = null;
    XSSFSheet sheet = null;
    File src;
    FileInputStream fis;

    public void loadExcel(String path) {
        try {
            src = new File(path);
            fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getData(String sheetName, int row, int column) {
        sheet = wb.getSheet(sheetName);
        return sheet.getRow(row).getCell(column).getStringCellValue();

    }

    public void writeData(String sheetName, int row, int column, String data) {
        sheet = wb.getSheet(sheetName);
        sheet.getRow(row).createCell(column).setCellValue(data);
        try {
            FileOutputStream fos = new FileOutputStream(src);
            wb.write(fos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getRowCount(String sheetName) {
        int row = wb.getSheet(sheetName).getLastRowNum();
        row += 1; // Adding 1 to get the total number of rows because row index starts from 0
        return row;
    }

    public void closeExcel() {
        try {
            wb.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
