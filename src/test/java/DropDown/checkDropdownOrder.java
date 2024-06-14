package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class checkDropdownOrder {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

        Select tools = new Select(driver.findElement(By.id("tools")));
//        Select tools = new Select(driver.findElement(By.id("tools1")));

        List<WebElement> myTools = tools.getOptions();

        List<String> actualList = new ArrayList<>();

        for (WebElement element : myTools) {
            actualList.add(element.getText());
        }

        List<String> expectedList = new ArrayList<>(actualList);

        Collections.sort(expectedList);

        if (actualList.equals(expectedList)) {
            System.out.println("The list is sorted in ascending order");
        } else {
            System.out.println("No idea what order!!!");
        }


    }
}
