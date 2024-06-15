package DataDrivenFramework;

import ExcelUtility.ExcelFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceLabLoginTest_FromExcel {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider ="sauceLabData")
    public void login(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(3000);

        String actual = null;
        try {
            actual = driver.findElement(By.xpath("//*[text()='Products']")).getAttribute("innerHTML");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actual, "Products", "Login not Successful. Maybe credentials are wrong.");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "sauceLabData")
    public Object[][] passData() {

        ExcelFramework excel = new ExcelFramework();
        excel.loadExcel("/Users/debopriyadebroy/Documents/Developer/Nexxvali /Test_Automation_Codes/src/test/java/DataDrivenFramework/SauceLabCredentials.xlsx");
        int rows = excel.getRowCount("Sheet1");
        Object[][] data = new Object[rows][2];
        for (int i = 0; i < rows; i++) {
            data[i][0] = excel.getData("Sheet1", i, 0);
            data[i][1] = excel.getData("Sheet1", i, 1);
        }
        return data;
    }
}
