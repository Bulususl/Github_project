package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM_RetrieveValuesFromDB_High;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginDBTests_RetrieveValuesFromDB_High {

	private WebDriver driver;
	private String baseURLForAdmin;
	private LoginPOM_RetrieveValuesFromDB_High LoginPOM_RetrieveValuesFromDB_High;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		LoginPOM_RetrieveValuesFromDB_High = new LoginPOM_RetrieveValuesFromDB_High(driver);
		baseURLForAdmin = properties.getProperty("baseURLForAdmin");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get("http://uniform.upskills.in/admin/");
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void validLoginTest() {
		try {
			LoginPOM_RetrieveValuesFromDB_High.sendUsername("admin");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.sendPassword("admin@123");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickAdminLoginButton();
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickIndent();
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickCatelogParent();
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickCatalogLink();
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickAddIconButton();
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.sendCategories("Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.sendDescription("Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.sendMetaTag("Meta-Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.sendMetaDescription("Meta-Description-Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_RetrieveValuesFromDB_High.clickSave();	
		}
		catch(InterruptedException ie) {
		}
	
	}
		
}
	
