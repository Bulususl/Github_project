package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.loginPOM_User_ReturnOrderedProduct;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.LoginPOM_Admin_LoginFailureVerification_Medium;

public class LoginTests_Admin_LoginFailureVerification_Medium {

	private WebDriver driver;
	private String baseURLForAdmin;
	private LoginPOM_Admin_LoginFailureVerification_Medium LoginPOM_Admin_LoginFailureVerification_Medium;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		LoginPOM_Admin_LoginFailureVerification_Medium = new LoginPOM_Admin_LoginFailureVerification_Medium(driver);
		baseURLForAdmin = properties.getProperty("baseURLForAdmin");
		// open the URL in the browser
		driver.get("http://uniform.upskills.in/admin/");
		}
	
	@Test
	public void validLoginTest() {
		try {
			LoginPOM_Admin_LoginFailureVerification_Medium.sendUsername("admin");
			Thread.sleep(2000);
			LoginPOM_Admin_LoginFailureVerification_Medium.sendPassword("admin@1234");
			Thread.sleep(2000);
			LoginPOM_Admin_LoginFailureVerification_Medium.clickAdminLoginButton();
			//Thread.sleep(2000);
			//LoginPOM_Admin_LoginFailureVerification_Medium.clickAdminLoginFailed();
			
		}
		catch(InterruptedException ie) {
		}
	}
}
