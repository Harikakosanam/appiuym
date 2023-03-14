package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchDemo {
@Test
public void launch() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"realme C20");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	dc.setCapability(MobileCapabilityType.UDID, "MV8DAIRW6DHIQCRG");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	//dc.setCapability("app","C:\\Users\\u\\Downloads\\ApiDemos-debug.apk");
	
	
	URL url =new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
	WebElement element=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	(driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
	    "elementId", ((RemoteWebElement) element).getId(),"duration",2000
	));
	
	
	
	
}
}
