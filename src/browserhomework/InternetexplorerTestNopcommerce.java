package browserhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetexplorerTestNopcommerce {
    public static void main(String[] args) {
        String baseurl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        title.equals("Store Demo - nopCommerce");
        System.out.println(title);

        boolean verifyTitle = title.equals("Store Demo - nopCommerce");
        boolean verifyTitlrcontain = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitlrcontain);
        System.out.println(title.length());
    }

}
