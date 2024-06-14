import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingHiddenElementsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

        List<WebElement> radio = driver.findElements(By.id("male"));
        int count = radio.size();
        System.out.println("Total radio buttons " + count);

        for (int i = 0; i < count; i++) {
            int x = radio.get(i).getLocation().getX();
            int y = radio.get(i).getLocation().getY();
            System.out.println("X:" + x);
            System.out.println("Y:" + y);
            if (x != 0) {
                radio.get(i).click();
                break;
            }
        }
    }
}
