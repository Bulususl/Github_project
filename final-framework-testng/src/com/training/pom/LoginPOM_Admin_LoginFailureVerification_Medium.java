package com.training.pom;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM_Admin_LoginFailureVerification_Medium {
	
	private WebDriver driver;
	
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
			public LoginPOM_Admin_LoginFailureVerification_Medium(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
			
	// Enter Username - 
			
			@FindBy(css="#input-username")
			private WebElement adminUsername;
			
			public void sendUsername(String adminUsername) {
				this.adminUsername.clear();
				this.adminUsername.sendKeys(adminUsername);
			}
			
			
	// Enter Password - 
			
			@FindBy(css="#input-password")
			private WebElement adminPassword;
			
			public void sendPassword(String adminPassword) {
				this.adminPassword.clear();
				this.adminPassword.sendKeys(adminPassword);
			}
			
	// Click on Login button - 
			
			@FindBy(css=".btn")
			private WebElement adminLoginButton;
			
			@FindBy(css=".alert")
			private WebElement AdminLoginFailed;
			
			
			public void clickAdminLoginButton() {
				this.adminLoginButton.click();
				assertTrue(this.AdminLoginFailed.getText().contains("No match for Username and/or Password."));
			}
		
}
