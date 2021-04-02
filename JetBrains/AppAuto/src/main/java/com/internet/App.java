package com.internet;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Honor 10");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        capabilities.setCapability("udid", "VBJ0218A19002856");
        capabilities.setCapability("noReset", "true");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
        driver.findElement(By.id("com.android.calculator2:id/del")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(2000);

        String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
        System.out.println(result);

        driver.quit();

        System.out.println( "Hello World!" );
    }
}
