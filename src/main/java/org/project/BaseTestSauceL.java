package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class BaseTestSauceL {
   public static WebDriver driver;

   @Parameters({"browser"})
   @BeforeMethod
    public void setUp(String browserName) throws MalformedURLException {
       System.out.println("BrowserName is: "+browserName);
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-preetishkumarb-0515a");
        sauceOptions.put("accessKey", "#############S");
        sauceOptions.put("build", "selenium-build-S9JBS");
        sauceOptions.put("name", "test-sauce-labs");
        browserOptions.setCapability("sauce:options", sauceOptions);
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().browserVersion("Version 141.0.7390.123").setup();
            browserOptions.setCapability("browserName", "chrome");
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            browserOptions.setCapability("browserName", "firefox");

        }
        //https://oauth-preetishkumarb-0515a:b8882f79-07e6-4349-a816-79b64f7092f8@ondemand.eu-central-1.saucelabs.com:443/wd/hub
       driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"),browserOptions);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    @AfterMethod()
    public void tearDown(){
        driver.quit();
    }
}
