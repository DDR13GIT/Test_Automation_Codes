package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceLabLoginTest {
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
        Object[][] data = new Object[3][2];
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";
        data[1][0] = "problem_user";
        data[1][1] = "secret_sauce";
        data[2][0] = "admin2";
        data[2][1] = "demo1234";
        return data;
    }
}
