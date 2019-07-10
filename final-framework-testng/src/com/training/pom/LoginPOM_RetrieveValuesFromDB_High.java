package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM_RetrieveValuesFromDB_High {
	
	private WebDriver driver;
	
// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
		public LoginPOM_RetrieveValuesFromDB_High(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		// After admin URL loaded - providing credentials to login for admin
		
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
		
		public void clickAdminLoginButton() {
			this.adminLoginButton.click();
		}
		
// Click on Indent icon - 
		
		@FindBy(css=".fa-indent")
		private WebElement Indent;
		
		public void clickIndent() {
			this.Indent.click();
		}
		
//1. click on CatalogParent - 
		
				//@FindBy(css="#catalog > a:nth-child(1)")
				@FindBy(css="#catalog > a:nth-child(1) > span:nth-child(2)")
				
				private WebElement CatelogParent;
				public void clickCatelogParent() {
					System.out.println("Success3");
					this.CatelogParent.click();
					System.out.println("Success4");
				}
		
//2.  Click on Categories - 
				
				@FindBy(css=".in > li:nth-child(1) > a:nth-child(1)")
				
				private WebElement CategoriesLink;
				
				public void clickCatalogLink() {
					this.CategoriesLink.click();
				}
				
//3. Click on Add icon
				
				@FindBy(css="div.pull-right > a:nth-child(1)")
				private WebElement AddIconButton;
				
				public void clickAddIconButton(){
					this.AddIconButton.click();
				}
				
//4. Send Category name
				
				@FindBy(css="#input-name1")
				private WebElement sendCategories;
				
				public void sendCategories(String sendCategories) {
					this.sendCategories.clear();
					this.sendCategories.sendKeys(sendCategories);
				}
				
//5. Send description - 
				
				@FindBy(css=".note-editable")
				private WebElement sendDescription;
				
				public void sendDescription(String sendDescription) {
					this.sendDescription.clear();
					this.sendDescription.sendKeys(sendDescription);
				}
				
//6. Send Meta Tag - 
				
				@FindBy(css="#input-meta-title1")
				private WebElement sendMetaTag;
				
				public void sendMetaTag(String sendMetaTag) {
					this.sendMetaTag.clear();
					this.sendMetaTag.sendKeys(sendMetaTag);
				}
				
//7. Send Meta Description - 
				
				@FindBy(css="#input-meta-description1")
				private WebElement sendMetaDescription;
				
				public void sendMetaDescription(String sendMetaDescription) {
					this.sendMetaDescription.clear();
					this.sendMetaDescription.sendKeys(sendMetaDescription);	
				}
				
//8. Click Save
				
				@FindBy(css="div.pull-right > button:nth-child(1)")
				private WebElement Save;
				
				public void clickSave(){
					this.Save.click();
				}

}
