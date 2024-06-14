package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggableDemo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));

        Actions actions = new Actions(driver);
        WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));

        actions.dragAndDropBy(src,394, 16).perform();
    }
}
