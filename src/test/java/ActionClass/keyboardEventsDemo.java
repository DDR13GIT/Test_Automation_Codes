package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardEventsDemo {

    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();

        driver.get("http://www.google.com");

        driver.manage().window().maximize();

        Actions actions =new Actions(driver);

        actions.click(driver.findElement(By.xpath("//textarea[@name='q']")))
                .sendKeys("Nexxvali")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ARROW_DOWN)
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

    }

}