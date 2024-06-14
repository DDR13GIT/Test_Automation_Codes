package HandlingTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingTableDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
        List<WebElement> dates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

        int total_nodes = dates.size();
        System.out.println("Total nodes: " + total_nodes);
        for(int i=0; i<total_nodes; i++) {
            String date = dates.get(i).getText();
            if(date.equalsIgnoreCase("20")) {
                dates.get(i).click();
                break;
            }
        }
    }
}
