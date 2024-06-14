package MultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class multiWindowDemo2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
        driver.manage().window().maximize();

        // Get the window handle of the parent window
        String parent = driver.getWindowHandle();
        System.out.println("Parent window id is ==> " + parent);

        // Click on the link that opens a new window
        driver.findElement(By.xpath("//a[@href='//www.google.com']")).click();
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//a[@href='http://www.facebook.com'][@name='link1']")).click();
        driver.switchTo().window(parent);
        driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
        driver.switchTo().window(parent);

        // Get a set of all window handles
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total window " + count);

        List<String> allTabList = new ArrayList<>(allWindows);

        driver.switchTo().window(allTabList.get(1));
        driver.switchTo().window(allTabList.get(2));
        driver.switchTo().window(allTabList.get(3));
        driver.switchTo().window(allTabList.get(0));

    }
}

