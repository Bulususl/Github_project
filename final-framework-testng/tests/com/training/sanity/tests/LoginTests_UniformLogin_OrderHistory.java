package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM_UniformLogin_OrderHistory;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_UniformLogin_OrderHistory {

	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private LoginPOM_UniformLogin_OrderHistory LoginPOM_UniformLogin_OrderHistory;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		//loginPOM = new LoginPOM(driver);
		LoginPOM_UniformLogin_OrderHistory = new LoginPOM_UniformLogin_OrderHistory(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the URL in the browser
		driver.get("http://uniform.upskills.in/");
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		
		/*loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
	    screenShot.captureScreenShot("First");*/
	    
		// First Test cases - Priority - LOW
		LoginPOM_UniformLogin_OrderHistory.ClickMyAccountIcon();
		LoginPOM_UniformLogin_OrderHistory.ClickLoginDropDown();	
		LoginPOM_UniformLogin_OrderHistory.sendEmailId("snbulusu3@gmail.com");
		LoginPOM_UniformLogin_OrderHistory.sendPassword("sneha123456");
		LoginPOM_UniformLogin_OrderHistory.ClickLoginActual();
		LoginPOM_UniformLogin_OrderHistory.ClickOrderHistory();
		LoginPOM_UniformLogin_OrderHistory.orderHistoryPageCheck();
		LoginPOM_UniformLogin_OrderHistory.ClickContinueButtonOnOrderHistoryPage();
		

	}
}