package Library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {
    public static void captureSS(WebDriver driver, String screenshotName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("./Screenshots/"+ screenshotName+ ".png"));
        } catch (IOException e) {
            System.out.println("Exception coming from screenshot: " + e.getMessage());
        }
        System.out.println("Screenshot taken!!");

    }
}
