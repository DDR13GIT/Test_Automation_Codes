package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.manage().window().maximize();


        // 6- linkText
        driver.findElement(By.linkText("Forgot Password?")).click();
        // 7- partialLinkText
       // driver.findElement(By.partialLinkText("Forgot ")).click();
        // 8 - TagName
        driver.findElement(By.tagName("a"));
        System.out.println(driver.findElements(By.tagName("a")).size());

    }




}
