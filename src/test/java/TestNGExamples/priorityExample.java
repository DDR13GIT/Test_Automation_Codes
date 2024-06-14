package TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class priorityExample {

    WebDriver driver;

    @BeforeMethod
    public void setupClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void testCheckBox() {
        driver.findElement(By.xpath("//a[@href=\"check_boxes.html\"]")).click();
        List<WebElement> check = driver.findElements(By.xpath("//input[@class=\"form-check-input\"]"));

        for (WebElement local_check : check) {
            String name = local_check.getAttribute("name");
            System.out.println("Test Case 1:");
            System.out.println("Values from check boxes are  ==>" + name);
            if (name.equalsIgnoreCase("blue")) {
                local_check.click();
            }
        }
    }

    @Test(priority = 3)
    public void testCheckBox2() {
        driver.findElement(By.xpath("//a[@href=\"check_boxes.html\"]")).click();
        List<WebElement> check = driver.findElements(By.xpath("//input[@class=\"form-check-input\"]"));

        for (WebElement local_check : check) {
            String name = local_check.getAttribute("name");
            System.out.println("Test Case 2:");
            System.out.println("Values from check boxes are  ==>" + name);
            if (name.equalsIgnoreCase("blue")) {
                local_check.click();
            }
        }
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 2)
    public void test4() {
        System.out.println("Test 4");
    }

    @AfterMethod
    public void teardownClass() {
        driver.quit();
    }
}