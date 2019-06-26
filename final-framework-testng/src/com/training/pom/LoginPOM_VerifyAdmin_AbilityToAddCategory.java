package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM_VerifyAdmin_AbilityToAddCategory{
private WebDriver driver;

public LoginPOM_VerifyAdmin_AbilityToAddCategory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

//Enter Username - 

		@FindBy(css="#input-username")
		private WebElement adminUsername;
		
		public void sendUsername(String adminUsername) {
			this.adminUsername.clear();
			this.adminUsername.sendKeys(adminUsername);
		}
		
		
//Enter Password - 
		
		@FindBy(css="#input-password")
		private WebElement adminPassword;
		
		public void sendPassword(String adminPassword) {
			this.adminPassword.clear();
			this.adminPassword.sendKeys(adminPassword);
		}
		
//Click on Login button - 
		
		@FindBy(css=".btn")
		private WebElement adminLoginButton;
		
		public void clickAdminLoginButton() {
			this.adminLoginButton.click();
		}

// 1. Click on Indent icon - 
		
	@FindBy(css=".fa-indent")
	private WebElement Indent;
	
	public void clickIndent() {
		this.Indent.click();
	}
	
//2. click on CatalogParent - 
	
	@FindBy(css="#catalog > a:nth-child(1)")
	private WebElement CatelogParent;
	
	public void clickCatelogParent() {
		System.out.println("Success3");
		this.CatelogParent.click();
		System.out.println("Success4");
	}
	
//3.  Click on Categories - 
	
	@FindBy(css=".in > li:nth-child(1) > a:nth-child(1)")
	
	private WebElement CategoriesLink;
	
	public void clickCatalogLink() {
		this.CategoriesLink.click();
	}
	
//4. Click on Add icon
	
			@FindBy(css="div.pull-right > a:nth-child(1)")
			private WebElement AddIconButton;
			
			public void clickAddIconButton(){
				this.AddIconButton.click();
			}
			
//5. Send Category name
			
			@FindBy(css="#input-name1")
			private WebElement sendCategories;
			
			public void sendCategories(String sendCategories) {
				this.sendCategories.clear();
				this.sendCategories.sendKeys(sendCategories);
			}
			
//6. Send description - 
			
			@FindBy(css=".note-editable")
			private WebElement sendDescription;
			
			public void sendDescription(String sendDescription) {
				this.sendDescription.clear();
				this.sendDescription.sendKeys(sendDescription);
			}
			
//7. Send Meta Tag - 
			
			@FindBy(css="#input-meta-title1")
			private WebElement sendMetaTag;
			
			public void sendMetaTag(String sendMetaTag) {
				this.sendMetaTag.clear();
				this.sendMetaTag.sendKeys(sendMetaTag);
			}
			
//8. Send Meta Description - 
			
			@FindBy(css="#input-meta-description1")
			private WebElement sendMetaDescription;
			
			public void sendMetaDescription(String sendMetaDescription) {
				this.sendMetaDescription.clear();
				this.sendMetaDescription.sendKeys(sendMetaDescription);	
			}
			
//9. Click Save
			
			@FindBy(css="div.pull-right > button:nth-child(1)")
			private WebElement Save;
			
			public void clickSave(){
				this.Save.click();
			}
	
	
}