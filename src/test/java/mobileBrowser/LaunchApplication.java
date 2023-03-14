package mobileBrowser;

import java.time.Duration;

import org.testng.annotations.Test;

import appiumProject.BaseClass;

public class LaunchApplication extends BaseClass {
	@Test
	public void lauch() {
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
