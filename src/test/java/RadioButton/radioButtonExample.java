package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtonExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href=\"radio_buttons.html\"]")).click();

        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement local_radio : radio) {
            String value = local_radio.getAttribute("value");
            System.out.println("Values from radio buttons are  ==>" + value);
            if (value.equalsIgnoreCase("radiozet")) {
                local_radio.click();
            }
        }

    }
}