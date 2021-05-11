package browserhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxTestNopcommerce {
    public static void main(String[] args) {
        String baseurl="https://www.nopcommerce.com/demo ";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        title.equals("Store Demo - nopCommerce");
        System.out.println(title);

        boolean verifyTitle = title.equals("Store Demo - nopCommerce");
        boolean verifyTitlecontain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitlecontain);
        System.out.println(title.length());

    }
}
