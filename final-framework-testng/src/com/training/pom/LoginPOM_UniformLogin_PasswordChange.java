package com.training.pom;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM_UniformLogin_PasswordChange {
	private WebDriver driver; 
	
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
	public LoginPOM_UniformLogin_PasswordChange(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(css=".btn")
	private WebElement loginBtn;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}*/
	
	@FindBy(css=".fa-user")
	private WebElement MyAccountIcon;
	
	@FindBy(css=".dropdown-menu-right > li:nth-child(2) > a:nth-child(1)")
	private WebElement LoginClick;
	
	@FindBy(css="#input-email")
	private WebElement EmailEntry;
	
	@FindBy(css="#input-password")
	private WebElement password;
	
	@FindBy(css="input.btn")
	private WebElement LoginActual;
	
	/*@FindBy(css="a.list-group-item:nth-child(6)")
	private WebElement OrderHistoryLink;
	
	@FindBy(css="a.btn")
	private WebElement ContinueButtonOnOrderHistoryPage;*/
	
	public void ClickMyAccountIcon() {
		this.MyAccountIcon.click();
	}
	
	public void ClickLoginDropDown() {
		this.LoginClick.click();
	}
	
	public void sendEmailId(String EmailEntry) {
		this.EmailEntry.clear();
		this.EmailEntry.sendKeys(EmailEntry);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	
	public void ClickLoginActual() {
		this.LoginActual.click();
	}
	
	
	
	
	// Third Test cases - PRIORITY LEVEL - HIGH
	
	@FindBy(css="ul.content:nth-child(4) > li:nth-child(2) > a:nth-child(1)")
	private WebElement ChangeYourPasswordLink;
	public void ClickChangeYourPasswordLink() {
		this.ChangeYourPasswordLink.click();
	}
	
	@FindBy(css="#input-password")
	private WebElement newPassword;
	public void sendNewPassword(String newPassword) {
		this.newPassword.clear();
		this.newPassword.sendKeys(newPassword);
	}
	
	@FindBy(css="#input-confirm")
	private WebElement confirmNewPassword;
	
	public void sendConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword.clear();
		this.confirmNewPassword.sendKeys(confirmNewPassword);
		
	}
	
	
	@FindBy(css="input.btn")
	private WebElement continueToConfirmNewPassword;
	
	public void clickContinueToConfirmNewPassword() {
		this.continueToConfirmNewPassword.click();
	}
	
	//<-----------------------------ASSERT STATEMENT-------------------------------------------->//
	@FindBy(css=".alert")
	private WebElement afterPasswordChangeAlert;
	
	public void passwordChangeStatusAlert(){
		this.afterPasswordChangeAlert.getText();
		//assertTrue(this.afterEditSuccessAlert.getText().contains("Success: Your password has been successfully updated."));
		
		
		Assert.assertEquals(this.afterPasswordChangeAlert.getText(),"Success: Your password has been successfully updated.");
		System.out.println("Your account password has been changed successfully.");
	}
	
}
