package pom.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sabab on 9/16/2020.
 */
public class TestBase {
    public static String baseUrl = "https://lp-portal.konapay.net:13000/portal/pp";
    public static WebDriver driver = null;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\Software\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quit() {
        TestBase.driver.quit();
    }
}
