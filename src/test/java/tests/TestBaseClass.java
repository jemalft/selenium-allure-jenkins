package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Log;


import static utils.BrowsersManager.browser.initializeBrowser;

public class TestBaseClass {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass(description = "Class Level Setup!")
    public void setup ()  {
        //Write a Log when tests is starting
        Log.startLog("Test is starting!");

        driver = initializeBrowser("chrome");

       // driver = new ChromeDriver();

        //Create a wait. All test classes use this.
        wait = new WebDriverWait(driver,15);

        //Maximize Window
        // driver.manage().window().maximize();
    }

    @AfterClass(description = "Class Level Teardown!")
    public void teardown () {
        //Write a Log when tests are ending
        Log.endLog("Test is ending!");
        driver.quit();
    }

}
