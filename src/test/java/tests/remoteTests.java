package tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class remoteTests {


    @Test
    public void remoteChrome() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("http://google.com/");
        System.out.println("Title is : "+driver.getTitle());
        driver.quit();
    }

    @Test
    public void remoteFF() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        //Capabilities {applicationName: , browserName: firefox,
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.LINUX);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

         driver.get("https://www.facebook.com/");
         System.out.println("Title is : " + driver.getTitle());
         driver.quit();
    }

}
