package DataFromExcel;

import ExcelUtility.ExcelFramework;

public class ReadFromExcel_UsingFramework {
    public static void main(String[] args) {

        ExcelFramework excel = new ExcelFramework();
        excel.loadExcel("/Users/debopriyadebroy/Documents/Developer/Nexxvali /Test_Automation_Codes/src/test/java/DataFromExcel/TestData.xlsx");
        System.out.println(excel.getData("Sheet1", 1, 0));
        System.out.println(excel.getData("Sheet1",1, 1));
        excel.closeExcel();
    }
}
