package ScreenshotsDemo;

import Library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FacebookScreenshot  {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("deb.nexxvali@gmail.com");
        Utility.captureSS(driver,"AfterEmailFillup");

        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
        Utility.captureSS(driver,"AfterPassFillup");
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(source, new File("./Screenshots/fbLoginPage_SS.png"));
//
//        System.out.println("Screenshot taken!!");

        // More decoupled way
       // Utility.captureSS(driver,"taken_using_utilityFunction");


    }
}
