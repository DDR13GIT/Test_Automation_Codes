package ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");

        // Create object of ChromeOptions class
        ChromeOptions options = new ChromeOptions();

        options.addExtensions(new File("C:\\Users\\ddroy\\OneDrive\\Desktop\\mefhakmgclhhfbdadeojlkbllmecialg_29308.crx"));


//        // Add chrome switch to disable browser notification
        options.addArguments("--disable-notifications");

        // Add chrome switch to start browser in maximized mode
        options.addArguments("--start-maximized");

        // Add chrome switch to disable browser's info bar
        options.addArguments("disable-infobars");

        // Add chrome switch to set browser language (here setting as Bangla)
        options.addArguments("--lang=en");

        // Add chrome switch to ignore SSL errors
        options.addArguments("--ignore-certificate-errors");

        // Add chrome switch to disable tooltips
        options.addArguments("--disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
    }
}
