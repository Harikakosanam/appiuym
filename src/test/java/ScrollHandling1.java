import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiumProject.MobileGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollHandling1 {
	@Test
	public void swipe() throws MalformedURLException, InterruptedException
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
		
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
       WebElement element= driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
MobileGestures gest=new MobileGestures();
gest.scrollElement(driver, element);
//gest.swipe(driver, element);
//Thread.sleep(3000);
//gest.swiperight(driver);
//WebElement element1= driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index='2']"));
//gest.swipe(driver, element1);
//gest.swipe(driver,element1);

	}

}
