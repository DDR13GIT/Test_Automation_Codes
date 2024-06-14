package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href=\"check_boxes.html\"]")).click();

        List<WebElement> check = driver.findElements(By.xpath("//input[@class=\"form-check-input\"]"));

        for (WebElement local_check : check) {
            String name = local_check.getAttribute("name");
            System.out.println("Values from check boxes are  ==>" + name);
            if (name.equalsIgnoreCase("blue")) {
                local_check.click();
            }
        }

    }
}
