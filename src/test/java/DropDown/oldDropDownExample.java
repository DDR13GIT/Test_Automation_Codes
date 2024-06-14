package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class oldDropDownExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement oldDrodown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

        Select colors = new Select(oldDrodown);

        colors.selectByIndex(2);  //Green select
        Thread.sleep(3000);

        colors.selectByValue("red"); //Red select
        Thread.sleep(3000);

        //Most recommended option
        colors.selectByVisibleText("White"); //White select


        System.out.println("Selected option is: " + colors.getFirstSelectedOption().getText());

        // Get all options and print them
        List<WebElement> options = colors.getOptions();
        System.out.println("Options available in the dropdown:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}
