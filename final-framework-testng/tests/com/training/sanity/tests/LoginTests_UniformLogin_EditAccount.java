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
import com.training.pom.LoginPOM_UniformLogin_EditAccount;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class LoginTests_UniformLogin_EditAccount {

	private WebDriver driver;
	private String baseUrl;
	//private LoginPOM loginPOM;
	private LoginPOM_UniformLogin_EditAccount LoginPOM_UniformLogin_EditAccount;
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
		LoginPOM_UniformLogin_EditAccount = new LoginPOM_UniformLogin_EditAccount(driver);
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
		
	
		LoginPOM_UniformLogin_EditAccount.ClickMyAccountIcon();
		LoginPOM_UniformLogin_EditAccount.ClickLoginDropDown();	
		LoginPOM_UniformLogin_EditAccount.sendEmailId("snehalata3@gmail.com");
		LoginPOM_UniformLogin_EditAccount.sendPassword("sneha123");
		LoginPOM_UniformLogin_EditAccount.ClickLoginActual();
				
	    
		
		
		// Second Test cases - Priority - MEDIUM 
		LoginPOM_UniformLogin_EditAccount.ClickEditAccountInfoLink();
		LoginPOM_UniformLogin_EditAccount.sendCorrectFirstName("Sneha4");
		LoginPOM_UniformLogin_EditAccount.sendCorrectLastName("Lata4");
		LoginPOM_UniformLogin_EditAccount.sendCorrectEmail("snehalata4@gmail.com");
		LoginPOM_UniformLogin_EditAccount.sendCorrectPhone("9876543214");
		LoginPOM_UniformLogin_EditAccount.ClickContinueButtonOnEditInfoPage();
		LoginPOM_UniformLogin_EditAccount.orderHistoryPageCheck();
		
		
	
		
	}
}