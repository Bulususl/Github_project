package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM_VerifyAddedProductsOnDisplayScreen_High {

	private WebDriver driver;
	
	public LoginPOM_VerifyAddedProductsOnDisplayScreen_High(WebDriver driver) {
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
	
	// 3. Click on Products link - 
			
			//@FindBy(css="#catalog > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
			@FindBy(css=".in > li:nth-child(2) > a:nth-child(1)")
			private WebElement ProductsLink;
			
			public void clickOnProductsLink() {
				this.ProductsLink.click();
			}
			
	// 4. Click on Add New Icon - 
			@FindBy(css="div.pull-right > a:nth-child(1)")
			private WebElement addNewIcon;
			
			public void clickOnAddNewIcon() {
				this.addNewIcon.click();
			}
			
	// 5. Enter Valid credentials in Product Name of General tab - 

			@FindBy(css="#input-name1")
			private WebElement ProductNameGeneral;
			
			public void sendProductNameGeneral(String ProductNameGeneral) {
				this.ProductNameGeneral.clear();
				this.ProductNameGeneral.sendKeys(ProductNameGeneral);
			}
			
	// 6. Enter Valid credentials in Meta Tag Title of General tab - 
			
			@FindBy(css="#input-meta-title1")
			private WebElement MetaTagTitle;
			
			public void sendMetaTagTitle(String MetaTagTitle) {
				this.MetaTagTitle.clear();
				this.MetaTagTitle.sendKeys(MetaTagTitle);
			}
			
	// 7. Click on Data tab - 

			@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
			private WebElement DataTab;
			
			public void clickOnDataTab() {
				this.DataTab.click();
			}
			
	// 8. Enter valid credentials in Model textbox - 

			@FindBy(css="#input-model")
			private WebElement Model;
			
			public void sendModel(String Model) {
				this.Model.clear();
				this.Model.sendKeys(Model);
			}
			
	// 9. Enter valid credentials in Price textbox - 

			@FindBy(css="#input-price")
			private WebElement Price;
			
			public void sendPrice(String Price) {
				this.Price.clear();
				this.Price.sendKeys(Price);
			}
			
	// 10. Enter valid credentials in Quantity textbox - 

			@FindBy(css="#input-quantity")
			private WebElement Quantity;
			
			public void sendQuantity(String Quantity) {
				this.Quantity.clear();
				this.Quantity.sendKeys(Quantity);
			}
			
	// 11. Click on Links tab - 

			@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
			private WebElement Linkstab;
			
			public void clickOnLinksTab() {
				this.Linkstab.click();
			}
			
	// 12. Click on Categories textbox - 
		   
			@FindBy(css="#input-category")
			private WebElement Category;
			
			
			public void clickOnCategory() {
				this.Category.click();
			}
	
	//13. Choose Weekend Wear - 
			
			@FindBy(css="#tab-links > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)")
			private WebElement WeekendWear;
			
			
			public void clickOnWeekendWear() {
				this.WeekendWear.click();
			}
	
	//14. Keep default values in Attribute, Option, Recurring,  Special, Image and Design tab
			
			@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(11) > a:nth-child(1)")
			private WebElement DesignTab;
			
			public void clickOnDesignTab() {
				this.DesignTab.click();
			}
	
	//15. Click on Save icon

			@FindBy(css=".fa-save")
			private WebElement SaveIcon;
			
			public void clickOnSaveIcon() {
				this.SaveIcon.click();
			}
	
	//16. Logout from Application
			
			@FindBy(css=".hidden-xs")
			private WebElement LogOut;
			
			public void clickOnLogOutIcon() {
				this.LogOut.click();
			}
			
}
