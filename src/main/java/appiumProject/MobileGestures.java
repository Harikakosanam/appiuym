package appiumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileGestures {
	public void longClick(AndroidDriver driver,WebElement element)
	{

		(driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()
				));
	}

	public void doubleClick(AndroidDriver driver,WebElement element)
	{
		(driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()
				));
	}
	public void clickGesture(AndroidDriver driver,WebElement element)
	{
		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()
				));
	}
	public void dragGesture(AndroidDriver driver,WebElement element)
	{
		
		(driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				"endX", 100,
				"endY", 100
				));
	}
	public void dragCoordinates(AndroidDriver driver,int startx,int starty)
	{
		// Java
		(driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				//"elementId", ((RemoteWebElement) element).getId(),
				"startX",startx,
				"startY",starty,
				"endX", 100,
				"endY", 100
				));
	}
	public void swipe(AndroidDriver driver,WebElement element)
	{
		( driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				"left", 200, "top", 200, "width", 400, "height", 250,
				"direction", "up",
				"percent", 1
				));

	}
	public void swiperight(AndroidDriver driver,int left,int top,int width,int height)
	{
		( driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				//"elementId", ((RemoteWebElement) element).getId(),
				"left", left, "top", top, "width", width, "height", height,
				"direction", "right",
				"percent", 1
				));

	}

	public void scroll(AndroidDriver driver,int left,int top,int width,int height)
	{
		boolean canScrollMore=true;
		while(canScrollMore)
		{
			canScrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
					"left",left, "top", top, "width", width, "height", height,
					"direction", "down",
					"percent", 1));
		}

	}
	public void scrollElement(AndroidDriver driver,WebElement element)
	{
		boolean canScrollMore=true;
		while(canScrollMore) {
		canScrollMore=(Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				// "left", 100, "top", 100, "width", 200, "height", 200,
				"direction", "right",
				"percent", 1.0
				));
	}
}
}
