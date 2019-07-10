package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.LoginPOM_VerifyAddedProductsOnDisplayScreen_High;
import com.training.pom.loginPOM_adminVerfiy_addProductsWithRewards_medium;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_VerifyAddedProductsOnDisplayScreen_High {

	
	private WebDriver driver;
	private String baseURLForAdmin;
	private LoginPOM_VerifyAddedProductsOnDisplayScreen_High LoginPOM_VerifyAddedProductsOnDisplayScreen_High;
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
		LoginPOM_VerifyAddedProductsOnDisplayScreen_High = new LoginPOM_VerifyAddedProductsOnDisplayScreen_High(driver);
		baseURLForAdmin = properties.getProperty("baseURLForAdmin");
		// open the URL in the browser
		driver.get("http://uniform.upskills.in/admin/");	
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() {
		//driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		//LoginPOM_VerifyAddedProductsOnDisplayScreen_High = new LoginPOM_VerifyAddedProductsOnDisplayScreen_High(driver);
	
		
		try{
			// Login to Admin link
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendUsername("admin");
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendPassword("admin@123");
			Thread.sleep(3000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickAdminLoginButton();
			
			
			// ---------------Test Cases-------------------------------//
			
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickIndent();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickCatelogParent();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnProductsLink();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnAddNewIcon();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendProductNameGeneral("Blazer Girls(7-8)");
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendMetaTagTitle("Blazer for Girls");
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnDataTab();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendModel("BLG-112");
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendPrice("3000");
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.sendQuantity("100");
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnLinksTab();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnCategory();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnWeekendWear();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnDesignTab();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnSaveIcon();
			Thread.sleep(2000);
			LoginPOM_VerifyAddedProductsOnDisplayScreen_High.clickOnLogOutIcon();
			Thread.sleep(2000);
			
		}
		catch(InterruptedException ie){
		}
	}
	
	
}
