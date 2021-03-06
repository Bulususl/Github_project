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
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
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
		loginPOM = new LoginPOM(driver); 
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
		loginPOM.ClickMyAccountIcon();
		loginPOM.ClickLoginDropDown();	
		loginPOM.sendEmailId("snbulusu3@gmail.com");
		loginPOM.sendPassword("sneha1234567");
		loginPOM.ClickLoginActual();
		loginPOM.ClickOrderHistory();
		loginPOM.ClickContinueButtonOnOrderHistoryPage();
		
		// Second Test cases - Priority - MEDIUM 
		loginPOM.ClickEditAccountInfoLink();
		loginPOM.sendCorrectFirstName("SnehaLataNew4");
		loginPOM.sendCorrectLastName("BulusuNew4");
		loginPOM.sendCorrectEmail("snbulusu4@gmail.com");
		loginPOM.sendCorrectPhone("8971154491");
		loginPOM.ClickContinueButtonOnEditInfoPage();
		
		// Third Test cases - Priority - HIGH
		
		loginPOM.ClickChangeYourPasswordLink();
		loginPOM.sendNewPassword("sneha12345678");
		loginPOM.sendConfirmNewPassword("sneha12345678");
		loginPOM.clickContinueToConfirmNewPassword();
		
		
	}
}