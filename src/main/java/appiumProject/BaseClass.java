package appiumProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public AndroidDriver driver;
	AppiumDriverLocalService server;
	@BeforeSuite
	public void StartServer()
	{
		server=AppiumDriverLocalService.buildDefaultService();
		server.start();
		server.clearOutPutStreams();
	}

	@BeforeClass
	public void launch() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 9");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		dc.setCapability(MobileCapabilityType.UDID, "058875050405");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability("unlockType","pattern");
		//		dc.setCapability("unlockKey","14789");
		//		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");

		//dc.setCapability("chromedriverExecutable","C:\\Users\\u\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		URL url =new URL("http://localhost:4723");

		//URL url =new URL("http://localhost:4723");
		driver=new AndroidDriver(url,dc);

	}
	@AfterSuite	
	public void stopServer()
	{
		server.stop();
	}

}
