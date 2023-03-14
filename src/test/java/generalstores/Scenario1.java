package generalstores;

import org.testng.annotations.Test;

import appiumProject.BaseClass;
import io.appium.java_client.AppiumBy;

public class Scenario1 extends BaseClass {
	@Test
	public void buyshoe() throws InterruptedException
	{
		Thread.sleep(5000);

		driver.findElement(AppiumBy.id("spinnerCountry")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Antarctica']")).click();
		
//       String an="text";
//       String av="India";
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))")).click();
		
		driver.findElement(AppiumBy.id("nameField")).sendKeys("harika");
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(AppiumBy.id("btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::*/*[@text='ADD TO CART']")).click();
		driver.findElement(AppiumBy.id("appbar_btn_cart")).click();
	  driver.findElement(AppiumBy.id("btnProceed")).click();
	}

}
