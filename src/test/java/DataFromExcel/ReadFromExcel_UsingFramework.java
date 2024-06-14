package DataFromExcel;

import ExcelUtility.ExcelFramework;

public class ReadFromExcel_UsingFramework {
    public static void main(String[] args) {

        ExcelFramework excel = new ExcelFramework();
        excel.loadExcel("C:\\Users\\ddroy\\IdeaProjects\\Nexxvali_QA_Codes\\src\\test\\java\\DataFromExcel\\TestData.xlsx");
        System.out.println(excel.getData("Sheet1", 1, 0));
        System.out.println(excel.getData("Sheet1",1, 1));
    }
}
