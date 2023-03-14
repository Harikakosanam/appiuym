package driverActions;

import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import appiumProject.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverActions extends BaseClass {
@Test
public void actions() {
	
//driver.terminateApp("io.appium.android.apis");
	//System.out.println(((AndroidDriver) driver).installApp("/Users/johndoe/path/to/app.apk"));
	
	//to start another app
	driver.activateApp("jp.rallwell.siriuth.touchscreentest");
	
	
	//System.out.println(driver.isAppInstalled("io.appium.android.apis"));
	
	//to run app in background
	
	driver.runAppInBackground(Duration.ofSeconds(10));
	
	//know the app status
	System.out.println(driver.queryAppState("jp.rallwell.siriuth.touchscreentest"));
	System.out.println(driver.queryAppState("io.appium.android.apis"));
	
	
	
	//to get orientation
	ScreenOrientation orientation = driver.getOrientation();
	System.out.println(orientation);
	
	//to lock your device
	driver.lockDevice();
	
	driver.unlockDevice();



}
}
