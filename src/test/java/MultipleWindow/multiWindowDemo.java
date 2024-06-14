package MultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class multiWindowDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
        driver.manage().window().maximize();

        // Get the window handle of the parent window
        String parent = driver.getWindowHandle();
        System.out.println("Parent window id is ==> " + parent);

        // Click on the link that opens a new window
        driver.findElement(By.xpath("//a[@href=\"//www.google.com\"]")).click();

        // Get a set of all window handles
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        System.out.println("Total window " + count);

        // Iterate over all windows
        for (String child : allWindows) {
            // If the window handle is not the parent window handle
            if (!parent.equalsIgnoreCase(child)) {
                // Switch to the child window
                driver.switchTo().window(child);

                driver.findElement(By.name("q")).sendKeys("Whats the weather today?");
                Thread.sleep(3000);
//                driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
//                Thread.sleep(5000);
                // Close the child window
                driver.close();
            }
        }

        // Switch back to the parent window
        driver.switchTo().window(parent);
        System.out.println("Parent window title is ==> " + driver.getTitle());
    }
}

