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
import com.training.pom.loginPOM_adminVerfiy_addProductsWithRewards_medium;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_adminVerfiy_addProductsWithRewards_medium {

	private WebDriver driver;
	private String baseURLForAdmin;
	private loginPOM_adminVerfiy_addProductsWithRewards_medium loginPOM_adminVerfiy_addProductsWithRewards_medium;
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
		loginPOM_adminVerfiy_addProductsWithRewards_medium = new loginPOM_adminVerfiy_addProductsWithRewards_medium(driver);
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
		// Thread.Sleep method in Try and Catch block to make the driver wait.	
		try{
		// ---------------Login page-------------------------------//
			
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendUsername("admin");
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendPassword("admin@123");
		Thread.sleep(3000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickAdminLoginButton();
		
		// ---------------Test Cases-------------------------------//
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickIndent();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickCatelogParent();
		Thread.sleep(2000);
		//loginPOM_adminVerfiy_addProductsWithRewards_medium.clickCatalogIcon();
		//Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnProductsLink();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnAddNewIcon();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendProductNameGeneral("Blazer Girls(7-8)");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendMetaTagTitle("Blazer for Girls");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnDataTab();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendModel("BLG-112");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendPrice("3000");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendQuantity("100");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnLinksTab();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnCategory();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.ChooseByClickingOnCategoryOptions();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnDiscountTab();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnAddDiscountTab();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendQuantityFromDiscountTab("5");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.sendPriceFromDiscountTab("200");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnCalanderIconInDateStart();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.AddBlankClickAfterDateStart();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.selectEndDate();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.AddBlankClickAfterDateEnd();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnRewardPoints();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.SendPoints("20");
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnDesignTab();
		Thread.sleep(2000);
		loginPOM_adminVerfiy_addProductsWithRewards_medium.clickOnSaveIcon();
		}
		catch(InterruptedException ie){
		}
	}
	
}
