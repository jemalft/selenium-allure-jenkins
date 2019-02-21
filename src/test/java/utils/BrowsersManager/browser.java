package utils.BrowsersManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class browser {
    public static WebDriver initializeBrowser(String type)  {
        WebDriver driver = null;

        switch (type) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_3");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");

                driver = new ChromeDriver(chromeOptions);

                break;

            case "ff":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "ie":
                driver = new EdgeDriver();
                break;
        }

        return driver;
    }
}