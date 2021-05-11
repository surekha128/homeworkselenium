package browserhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTestnopcommerce {
    public static void main(String[] args) {
        String baseurl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle= title.equals("Store Demo - nopCommerce");
        boolean verifyTitleContain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContain);
        System.out.println(title.length());



    }
}
