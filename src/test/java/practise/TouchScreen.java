package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TouchScreen {
	public void touchswipe() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"realme C20");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dc.setCapability(MobileCapabilityType.UDID, "MV8DAIRW6DHIQCRG");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability("appPackage","jp.rallwell.sriruth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
	

		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		
}
}
