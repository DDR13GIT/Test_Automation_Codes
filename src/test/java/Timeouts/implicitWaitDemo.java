package Timeouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class implicitWaitDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deb.nexxvali@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("deb.nexxvali@gmail.com");
        driver.findElement(By.xpath("//button[text()='']")).click();


        driver.quit();
    }
}
