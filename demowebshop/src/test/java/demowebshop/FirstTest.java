package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser launched successfully");
    }

    @Test
    public void openDemoWebShop() {
        driver.get("https://demowebshop.tricentis.com/");
        System.out.println("Demo Web Shop opened successfully");
        System.out.println("Page Title: " + driver.getTitle());
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed successfully");
    }
}

