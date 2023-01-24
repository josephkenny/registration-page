package com.webstaurantstore.registrationpage.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class WebstaurantStoreTestBase {
    public WebDriver driver;
    private static final String BASE_URL = "https://www.webstaurantstore.com";
    private static final String CHROME_DRIVER_LOCATION = "C:\\Users\\Joe\\Documents\\chromedriver.exe";

    // The @BeforeSuite method in TestNG runs before the execution of all other test methods
    @BeforeSuite
    public void initializeWebDriver() {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();

        // Maximize web browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open website
        driver.get(BASE_URL);
    }

    // The @AfterSuite method in TestNG runs after the execution of all other test methods.
    @AfterSuite
    public void quitDriver() throws InterruptedException {
        Thread.sleep(20000);
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
