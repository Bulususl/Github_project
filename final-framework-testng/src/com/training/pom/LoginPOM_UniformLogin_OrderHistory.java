package com.training.pom;



import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM_UniformLogin_OrderHistory {
	private WebDriver driver; 
	
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
	public LoginPOM_UniformLogin_OrderHistory(WebDriver driver) {
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
	
	// First Test cases - PRIORITY LEVEL - LOW
	

	
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
	
	@FindBy(css="a.list-group-item:nth-child(6)")
	private WebElement OrderHistoryLink;
	
	@FindBy(css="a.btn")
	private WebElement ContinueButtonOnOrderHistoryPage;
	

	
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
	
	public void ClickOrderHistory() {
		this.OrderHistoryLink.click();
	}

	public void ClickContinueButtonOnOrderHistoryPage() {
		this.ContinueButtonOnOrderHistoryPage.click();
		
	}
	//<-----------------------------ASSERT STATEMENT-------------------------------------------->//
	
	@FindBy(css="#content > h1:nth-child(2)")
	private WebElement orderHistoryText;
	
	public void orderHistoryPageCheck(){
		this.orderHistoryText.getText();
		assertTrue(this.orderHistoryText.getText().contains("ORDER HISTORY"));
		System.out.println("This is Order History Page");
	}
}
	

	


	
