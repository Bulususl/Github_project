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




public class loginTests_User_ReturnOrderedProduct{ 
	
	private WebDriver driver;
	private String baseURL;
	private loginPOM_User_ReturnOrderedProduct loginPOM_User_ReturnOrderedProduct;
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
		loginPOM_User_ReturnOrderedProduct = new loginPOM_User_ReturnOrderedProduct(driver);
		baseURL = properties.getProperty("baseURL");
		// open the URL in the browser
		driver.get("http://uniform.upskills.in/");
		}
	
	@Test
	public void validLoginTest() {
		try {
		// ---------------Login page-------------------------------//
			loginPOM_User_ReturnOrderedProduct.ClickMyAccountIcon();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickLoginDropDown();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.sendEmailId("snehab@gmail.com");
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.sendPassword("sneha1234567");
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickLoginActual();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickOrderHistory();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickViewIcon();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickReturnIcon();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickReturnReceivedWrongItem();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickProductOpenedYes();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.sendFaultyOtherComments("Not applicable");
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickAcceptTermsAndConditions();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickSubmit();
			Thread.sleep(2000);
			loginPOM_User_ReturnOrderedProduct.ClickContinue();
			
		}
		catch(InterruptedException ie) {
						}
			}
}