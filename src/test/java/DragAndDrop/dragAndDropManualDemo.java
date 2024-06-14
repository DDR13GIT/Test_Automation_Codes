package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDropManualDemo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

        Actions actions = new Actions(driver);

        WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
        WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

        actions.clickAndHold(src)
                .pause(Duration.ofSeconds(2))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(2))
                .release()
                .build()
                .perform();
    }
}
