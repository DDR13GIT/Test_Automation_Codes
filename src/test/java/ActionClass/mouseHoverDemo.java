package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class mouseHoverDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");

        driver.manage().window().maximize();

        WebElement hoverButton = driver.findElement(By.xpath("//button [text()='Automation Tools']"));

        Actions act = new Actions(driver);
        act.moveToElement(hoverButton).perform();

        List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));

        int total_count = links.size();

        for (int i = 0; i < total_count; i++) {

            WebElement element = links.get(i);
            String text = element.getAttribute("innerHTML");
            boolean status = element.isEnabled();
            System.out.println("Links name is " + text + " and the link status is " + status);

            if (text.equalsIgnoreCase("Appium")) {
                element.click();
                break;
            }
        }
    }
}
