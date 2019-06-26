package com.training.pom;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class loginPOM_User_ReturnOrderedProduct {
	private WebDriver driver;
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
		public loginPOM_User_ReturnOrderedProduct(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	// After User URL loaded - providing credentials to login for USER and LOGIN

		
		@FindBy(css=".fa-user")
		private WebElement MyAccountIcon;
		
		public void ClickMyAccountIcon() {
			this.MyAccountIcon.click();
		}
		
		@FindBy(css=".dropdown-menu-right > li:nth-child(2) > a:nth-child(1)")
		private WebElement LoginClick;
		
		public void ClickLoginDropDown() {
			this.LoginClick.click();
		}
		
		@FindBy(css="#input-email")
		private WebElement EmailEntry;
		
		public void sendEmailId(String EmailEntry) {
			this.EmailEntry.clear();
			this.EmailEntry.sendKeys(EmailEntry);
		}
		
		@FindBy(css="#input-password")
		private WebElement password;
		
		public void sendPassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password);
		}
		
		@FindBy(css="input.btn")
		private WebElement LoginActual;
		
		public void ClickLoginActual() {
			this.LoginActual.click();
		}

		@FindBy(css="a.list-group-item:nth-child(6)")
		private WebElement OrderHistoryLink;
		
		public void ClickOrderHistory() {
			this.OrderHistoryLink.click();
		}
		
	// View icon
		
		@FindBy(css=".fa-eye")
		private WebElement ViewIcon;
		
		public void ClickViewIcon() {
			this.ViewIcon.click();
		}
		
	// Return icon
		
		@FindBy(css="table.table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > a:nth-child(2) > i:nth-child(1)")
		private WebElement ReturnIcon;
		
		public void ClickReturnIcon() {
			this.ReturnIcon.click();
		}
		
	// Reason for return - 
		
		@FindBy(css="div.radio:nth-child(1) > label:nth-child(1) > input:nth-child(1)")
		private WebElement DeadOnArrival;
		@FindBy(css="div.radio:nth-child(2) > label:nth-child(1) > input:nth-child(1)")
		private WebElement Faulty;
		@FindBy(css="div.radio:nth-child(3) > label:nth-child(1) > input:nth-child(1)")
		private WebElement OrderError;
		@FindBy(css="div.radio:nth-child(4) > label:nth-child(1) > input:nth-child(1)")
		private WebElement Other;
		@FindBy(css="div.radio:nth-child(5) > label:nth-child(1) > input:nth-child(1)")
		private WebElement ReceivedWrongItem;

		public void ClickReturnDeadOnArrival() {
			this.DeadOnArrival.click();
		}
		
		public void ClickReturnFaulty() {
			this.Faulty.click();
		}
		
		public void ClickReturnOrderError() {
			this.OrderError.click();
		}
		
		public void ClickReturnOther() {
			this.Other.click();
		}
		
		public void ClickReturnReceivedWrongItem() {
			this.ReceivedWrongItem.click();
		}
		
		
	//  Is Product is opened ? - 
		
		@FindBy(css="label.radio-inline:nth-child(1) > input:nth-child(1)")
		private WebElement ProductOpenedYes;
		
		@FindBy(css="label.radio-inline:nth-child(2) > input:nth-child(1)")
		private WebElement ProductOpenedNo;
		
		public void ClickProductOpenedYes() {
			this.ProductOpenedYes.click();
		}
		
		public void ClickProductOpenedNo() {
			this.ProductOpenedNo.click();
		}
	
		
	// Faulty Or Other details - 
		
		@FindBy(css="#input-comment")
		private WebElement FaultyOtherComments;
	
		public void sendFaultyOtherComments(String FaultyOtherComments) {
			this.FaultyOtherComments.clear(); 
			this.FaultyOtherComments.sendKeys(FaultyOtherComments);
		}
	
		
	// Terms and conditions - 
		
		@FindBy(css="div.pull-right > input:nth-child(2)")
		private WebElement AcceptTermsAndConditions;
		
		public void ClickAcceptTermsAndConditions() {
			this.AcceptTermsAndConditions.click();
		}
	
	// Submit - 
		
		@FindBy(css="input.btn")
		private WebElement Submit;
		
		public void ClickSubmit() {
			this.Submit.click();
		}
		
	// Continue - 
		@FindBy(css="a.btn")
		private WebElement Continue;
		
		public void ClickContinue() {
			this.Continue.click();
		}
		
}
