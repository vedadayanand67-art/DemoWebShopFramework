

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

    public void abs() {


    	String browser = System.getProperty("browser");

        String url = System.getProperty("url");


        WebDriver driver = null;


        if ("edge".equalsIgnoreCase(browser)) {

            driver = new EdgeDriver();


        } else if ("chrome".equalsIgnoreCase(browser)) {

            driver = new ChromeDriver();


        } else if ("firefox".equalsIgnoreCase(browser)) {

            driver = new FirefoxDriver();


        } else {

            throw new IllegalArgumentException(

                "Unsupported browser: " + browser

            );

        }


        driver.manage().window().maximize();

        driver.get(url);


        System.out.println("Title: " + driver.getTitle());

        System.out.println("Title: " + driver.getTitle());


        driver.quit();
}
}