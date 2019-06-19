package com.training.pom;

import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPOM_UniformLogin_EditAccount {
	private WebDriver driver; 
	
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
	public LoginPOM_UniformLogin_EditAccount(WebDriver driver) {
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
	
	
	
	/* @FindBy(css="a.list-group-item:nth-child(6)")
	private WebElement OrderHistoryLink;
	
	@FindBy(css="a.btn")
	private WebElement ContinueButtonOnOrderHistoryPage; */
	
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
	
	
	
	// Second Test cases - PRIORITY LEVEL - MEDIUM
	
	@FindBy(css="ul.content:nth-child(4) > li:nth-child(1) > a:nth-child(1)")
	private WebElement EditYourAccountInfoLink;
	
	public void ClickEditAccountInfoLink() {
		this.EditYourAccountInfoLink.click();
	}
	
	@FindBy(css="#input-firstname")
	private WebElement editfirstName;
	
	public void sendCorrectFirstName(String editfirstName) {
		this.editfirstName.clear();
		this.editfirstName.sendKeys(editfirstName);
	}
	
	@FindBy(css="#input-lastname")
	private WebElement editlastName;
	
	public void sendCorrectLastName(String editlastName) {
		this.editlastName.clear();
		this.editlastName.sendKeys(editlastName);
	}
	
	@FindBy(css="#input-email")
	private WebElement EditEmail;
	
	public void sendCorrectEmail(String EditEmail) {
		this.EditEmail.clear();
		this.EditEmail.sendKeys(EditEmail);
	}
	
	@FindBy(css="#input-telephone")
	private WebElement EditPhone;
	
	public void sendCorrectPhone(String EditPhone) {
		this.EditPhone.clear();
		this.EditPhone.sendKeys(EditPhone);
	}
	
	@FindBy(css="input.btn")
	private WebElement ContinueButtonOnEditInfoPage;
	
	public void ClickContinueButtonOnEditInfoPage() {
		this.ContinueButtonOnEditInfoPage.click();
	}
	
	//<-----------------------------ASSERT STATEMENT-------------------------------------------->//
	@FindBy(css=".alert")
	private WebElement afterEditSuccessAlert;
	
	public void orderHistoryPageCheck(){
		this.afterEditSuccessAlert.getText();
		//assertTrue(this.afterEditSuccessAlert.getText().contains("Success: Your account has been successfully updated."));
		
		
		Assert.assertEquals(this.afterEditSuccessAlert.getText(),"Success: Your account has been successfully updated.");
		System.out.println("The account modification has been successful.");
	}
	
	
}
