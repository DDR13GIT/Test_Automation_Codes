package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class bootStrapDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@id='menu1']")).click();

        List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

        for (WebElement element : dd_menu) {
            String innerHtml = element.getAttribute("innerHTML");
            System.out.println("Dropdown elements: " + innerHtml );
        }

        for (WebElement element : dd_menu) {
            String innerHtml = element.getAttribute("innerHTML");

            if (innerHtml.contentEquals("JavaScript")) {
                element.click();
                break;
            }
        }

        driver.quit();
    }
}
