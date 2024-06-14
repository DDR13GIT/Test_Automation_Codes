import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class verifyLinksDemo {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {

            WebElement ele = links.get(i);

            String url = ele.getAttribute("href");

            verifyLinkActive(url);

        }

    }

    public static void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();

            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            if (httpURLConnect.getResponseCode() == 404) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception coming from verifyLink method: " + e.getMessage());
        }
    }


}