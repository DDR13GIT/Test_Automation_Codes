package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // 1-> id
        WebElement uname = driver.findElement(By.id("user-name"));
        uname.sendKeys("standard_user");

//      2-> name
//      By pass = By.name("txtPassword");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

//      3-> className can be used many times, so it won't be unique
        driver.findElement(By.className("submit-button")).click();

        // 4-> Xpath
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();

        //5-> CSS
        driver.findElement(By.cssSelector("#checkout")).click();


    }
}
