package Timeouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class explicitWaitDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();


        // By default, it  accepts in Seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Here we will wait until element is not visible, if element is visible then it will return web element
        // or else it will throw exception
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        boolean status = element.isDisplayed();


        if (status) {
            System.out.println("===== WebDriver is visible======");
        } else {
            System.out.println("===== WebDriver is not visible======");
        }
    }
}
