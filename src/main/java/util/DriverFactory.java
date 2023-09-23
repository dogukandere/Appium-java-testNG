package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    public static AppiumDriver driver;

    private DriverFactory() {
    }

    public static AppiumDriver getDriver() {
        if (driver == null) {
            setup();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    protected static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("autoAcceptAlerts", true);
            capabilities.setCapability("app", "/Users/dogukandere/Desktop/trendyol.apk");
            capabilities.setCapability("appPackage","trendyol.com");
            capabilities.setCapability("appActivity", "com.trendyol.common.splash.impl.ui.SplashActivity");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("deviceName", "Pixel 5");
            capabilities.setCapability("udid","emulator-5554");
            capabilities.setCapability("automationName","UIAutomator2");
            //capabilities.setCapability("noReset", true);
            driver = new AppiumDriver(new URL("http://0.0.0.0:4723"),capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        catch (Exception e) {
            System.out.println("Not able to create Android Driver " + e.getMessage());
        }
    }
}
