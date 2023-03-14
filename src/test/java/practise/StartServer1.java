package practise;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServer1 {
	
	AppiumDriverLocalService server;
	@BeforeMethod

	public void serverStart()
	{
		server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingPort(4723)
				.withLogFile(new File("../appiumProject/ServerLogs/New1.log"))
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				);
		server.start();
		server.clearOutPutStreams();

	
	}
	@Test
	public void startServ()
	{
		
	}
	@AfterMethod
	public void stopServer()
	{
		server.stop();
	}
}
