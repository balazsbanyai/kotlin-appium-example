package com.banyaibalazs.awesomeapplication;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicJavaTest {

    private static final String BALAZS_MOTO_NAME = "ZY223HRX2L";

    private String app =  System.getProperty("user.dir") + "/build/app-debug.apk";

    private URL host = new URL("http://127.0.0.1:4723/wd/hub");

    private AndroidDriver<MobileElement> driver;

    public BasicJavaTest() throws MalformedURLException {
    }

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, app);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, BALAZS_MOTO_NAME);

        driver = new AndroidDriver(host, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testWelcome() {
        driver
                .findElement(By.id("com.banyaibalazs.awesomeapplication:id/welcome"))
                .click();

        driver
                .findElement(By.id("android:id/button1"))
                .click();
    }
}
