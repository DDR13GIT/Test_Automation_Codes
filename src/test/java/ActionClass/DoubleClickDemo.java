package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://api.jquery.com/dblclick/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        Actions actions = new Actions(driver);

        WebElement squareBox = driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"));
        actions.doubleClick(squareBox).perform();

        Thread.sleep(3000);

        System.out.println("Yeeee I double clicked the element !!! wowww !!!");
        driver.quit();
    }
}
