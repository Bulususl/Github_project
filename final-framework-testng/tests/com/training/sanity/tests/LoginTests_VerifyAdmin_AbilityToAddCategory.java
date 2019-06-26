package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.LoginPOM_VerifyAdmin_AbilityToAddCategory;

public class LoginTests_VerifyAdmin_AbilityToAddCategory {

	private WebDriver driver;
	private String baseURLForAdmin;
	private LoginPOM_VerifyAdmin_AbilityToAddCategory LoginPOM_VerifyAdmin_AbilityToAddCategory;
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
		LoginPOM_VerifyAdmin_AbilityToAddCategory = new LoginPOM_VerifyAdmin_AbilityToAddCategory(driver);
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
		try {
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendUsername("admin");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendPassword("admin@123");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickAdminLoginButton();
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickIndent();
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickCatelogParent();
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickCatalogLink();
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickAddIconButton();
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendCategories("Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendDescription("Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendMetaTag("Meta-Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.sendMetaDescription("Meta-Description-Sports Jacket");
			Thread.sleep(2000);
			LoginPOM_VerifyAdmin_AbilityToAddCategory.clickSave();	
		}
		catch(InterruptedException ie) {
		}
	}
}