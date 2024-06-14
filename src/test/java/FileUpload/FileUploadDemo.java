package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;


public class FileUploadDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\ddroy\\IdeaProjects\\Nexxvali_QA_Codes\\src\\test\\java\\FileUpload\\fileselector.html");
        driver.findElement(By.xpath("//input[@name='resumeupload']")).click();

        try {
            Runtime.getRuntime().exec("C:\\Users\\ddroy\\IdeaProjects\\Nexxvali_QA_Codes\\src\\test\\java\\FileUpload\\scriptFileSelector.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
