package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static JavaScriptExecutor.javascriptUtility.highLightElement;

public class hightlightElementDemo {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        WebElement username= driver.findElement(By.id("email"));
        try {
            highLightElement(driver,username);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}

