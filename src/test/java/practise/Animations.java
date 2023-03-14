package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Animations {
	@Test
	public void animate() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"realme C20");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dc.setCapability(MobileCapabilityType.UDID, "MV8DAIRW6DHIQCRG");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
	

		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		driver.findElement(AppiumBy.accessibilityId("View Flip")).click();
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/button")).click();
	}

}
