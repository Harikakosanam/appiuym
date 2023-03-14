package generalstores;

import java.time.Duration;

import org.testng.annotations.Test;

import appiumProject.BaseClass;
import io.appium.java_client.AppiumBy;

public class ToastMsgs extends BaseClass {
@Test
public void toats() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(AppiumBy.id("spinnerCountry")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Antarctica']")).click();
	driver.findElement(AppiumBy.id("btnLetsShop")).click();
	Thread.sleep(3000);
	String toast = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getText();
	System.out.println(toast);
}
}
