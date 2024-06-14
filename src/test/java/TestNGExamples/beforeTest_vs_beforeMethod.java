package TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

public class beforeTest_vs_beforeMethod {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckBox() {
        driver.findElement(By.xpath("//a[@href=\"check_boxes.html\"]")).click();

        List<WebElement> check = driver.findElements(By.xpath("//input[@class=\"form-check-input\"]"));
        System.out.println("************************** Test Case 1: ***************************");
        for (WebElement local_check : check) {
            String name = local_check.getAttribute("name");
            System.out.println("Values from check boxes are  ==>" + name);
            if (name.equalsIgnoreCase("blue")) {
                local_check.click();
                System.out.println("Clicked!!!");
            }
        }
    }

    @Test
    public void testCheckBox2() {
        driver.findElement(By.xpath("//a[@href=\"check_boxes.html\"]")).click();

        List<WebElement> check = driver.findElements(By.xpath("//input[@class=\"form-check-input\"]"));
        System.out.println("************************** Test Case 2: ***************************");
        for (WebElement local_check : check) {
            String name = local_check.getAttribute("name");
            System.out.println("Values from check boxes are  ==>" + name);
            if (name.equalsIgnoreCase("blue")) {
                local_check.click();
                System.out.println("Clicked!!!");
            }
        }
    }

    @AfterMethod
    public void tear_down() {
        driver.quit();
    }

}


