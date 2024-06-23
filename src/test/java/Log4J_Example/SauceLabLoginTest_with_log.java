package Log4J_Example;

import ExcelUtility.ExcelFramework;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class SauceLabLoginTest_with_log {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(SauceLabLoginTest_with_log.class);

    @BeforeMethod
    public void setup() {
        log.info("*************** Application starting ***************");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        log.info("*************** Application started ***************");
    }

    @Test(dataProvider ="sauceLabData")
    public void login(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        log.info("Username entered");

        driver.findElement(By.name("password")).sendKeys(password);
        log.info("Password entered");

        driver.findElement(By.className("submit-button")).click();
        log.info("Clicked on login button");
        Thread.sleep(3000);

        String actual = null;
        try {
            actual = driver.findElement(By.xpath("//*[text()='Products']")).getAttribute("innerHTML");
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        Assert.assertEquals(actual, "Products", "Login not Successful. Maybe credentials are wrong.");

    }

    @AfterMethod
    public void tearDown() {
        log.info("*************** Application closing ***************");
        driver.quit();
        log.info("*************** Application closed ***************");
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
