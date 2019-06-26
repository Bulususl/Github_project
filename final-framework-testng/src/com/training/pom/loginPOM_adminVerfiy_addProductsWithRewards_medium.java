package com.training.pom;




import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginPOM_adminVerfiy_addProductsWithRewards_medium {
private WebDriver driver;



	
	// Initializing the driver for the Webdriver and Initializing the webdriver from the factory
	public loginPOM_adminVerfiy_addProductsWithRewards_medium(WebDriver driver) {
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
	
/*/ 1. Click on Catalog icon - 
	
	@FindBy(css=".fa-tags")
	private WebElement catalogIcon;
	
	public void clickCatalogIcon() {
		this.catalogIcon.click();
	}*/
	
// 2. Click on Products link - 
	
	//@FindBy(css="#catalog > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
	@FindBy(css=".in > li:nth-child(2) > a:nth-child(1)")
	private WebElement ProductsLink;
	
	public void clickOnProductsLink() {
		this.ProductsLink.click();
	}
	
// 3. Click on Add New Icon - 
	@FindBy(css="div.pull-right > a:nth-child(1)")
	private WebElement addNewIcon;
	
	public void clickOnAddNewIcon() {
		this.addNewIcon.click();
	}
	
// 4. Enter Valid credentials in Product Name of General tab - 

	@FindBy(css="#input-name1")
	private WebElement ProductNameGeneral;
	
	public void sendProductNameGeneral(String ProductNameGeneral) {
		this.ProductNameGeneral.clear();
		this.ProductNameGeneral.sendKeys(ProductNameGeneral);
	}
	
// 5. Enter Valid credentials in Meta Tag Title of General tab - 
	
	@FindBy(css="#input-meta-title1")
	private WebElement MetaTagTitle;
	
	public void sendMetaTagTitle(String MetaTagTitle) {
		this.MetaTagTitle.clear();
		this.MetaTagTitle.sendKeys(MetaTagTitle);
	}
	
// 6. Click on Data tab - 

	@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
	private WebElement DataTab;
	
	public void clickOnDataTab() {
		this.DataTab.click();
	}
	
// 7. Enter valid credentials in Model textbox - 

	@FindBy(css="#input-model")
	private WebElement Model;
	
	public void sendModel(String Model) {
		this.Model.clear();
		this.Model.sendKeys(Model);
	}
	
// 8. Enter valid credentials in Price textbox - 

	@FindBy(css="#input-price")
	private WebElement Price;
	
	public void sendPrice(String Price) {
		this.Price.clear();
		this.Price.sendKeys(Price);
	}
	
// 9. Enter valid credentials in Quantity textbox - 

	@FindBy(css="#input-quantity")
	private WebElement Quantity;
	
	public void sendQuantity(String Quantity) {
		this.Quantity.clear();
		this.Quantity.sendKeys(Quantity);
	}
	
// 10. Click on Links tab - 

	@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
	private WebElement Linkstab;
	
	public void clickOnLinksTab() {
		this.Linkstab.click();
	}
	
// 11. Click on Categories textbox - 
   
	@FindBy(css="#input-category")
	private WebElement Category;
	
	
	public void clickOnCategory() {
		this.Category.click();
	}

// 12. Select Category from displayed category list - 

	@FindBy(css="#tab-links > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(8) > a:nth-child(1)")
	private WebElement SportsUniform;

	
	public void ChooseByClickingOnCategoryOptions() {
		this.SportsUniform.click();
		
	}
	
// 13. Click on Discount tab - 

	@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)")
	private WebElement DiscountTab;
	
	public void clickOnDiscountTab() {
		this.DiscountTab.click();
	}

// 14. Click on Add discount icon - 

	@FindBy(css="#discount > tfoot:nth-child(3) > tr:nth-child(1) > td:nth-child(2) > button:nth-child(1) > i:nth-child(1)")
	private WebElement AddDiscountTab;
	
	public void clickOnAddDiscountTab() {
		this.AddDiscountTab.click();
	}
	
// 15. Enter valid credentials in Quantity(Discount) textbox - 

	@FindBy(css="#discount-row0 > td:nth-child(2) > input:nth-child(1)")
	private WebElement QuantityFromDiscountTab;
	
	public void sendQuantityFromDiscountTab(String QuantityFromDiscountTab) {
		this.QuantityFromDiscountTab.clear();
		this.QuantityFromDiscountTab.sendKeys(QuantityFromDiscountTab);
	}

// 16. Enter valid credentials in Price(Discount) textbox - 

	@FindBy(css="#discount-row0 > td:nth-child(4) > input:nth-child(1)")
	private WebElement PriceFromDiscountTab;
	
	public void sendPriceFromDiscountTab(String PriceFromDiscountTab) {
		this.PriceFromDiscountTab.clear();
		this.PriceFromDiscountTab.sendKeys(PriceFromDiscountTab);
	}

// 17. Select valid start date as current date

	@FindBy(css="#discount-row0 > td:nth-child(5) > div:nth-child(1) > span:nth-child(2) > button:nth-child(1) > i:nth-child(1)")
	private WebElement SelectValidStartDate;
	
	public void clickOnCalanderIconInDateStart() {
		this.SelectValidStartDate.click();
	}
	

// Introducing blank click on the page after date start
	
	@FindBy(css="#content")
	private WebElement BlankClick1;
	
	public void AddBlankClickAfterDateStart() {
		this.BlankClick1.click();
	}
	

/*18. Select valid end date as current date+one day - 
This code works assuming that in the table of Calendar for EndDate field in Discount tab
doesn't have dates for previous month. Currently the widget has the date of Previous Month (May)
and Next Month(July) visible which is why wrong dates might get picked up*/ 
	

	@FindBy(css="#discount-row0 > td:nth-child(6) > div:nth-child(1) > span:nth-child(2) > button:nth-child(1)")
	private WebElement SelectValidEndDate;
	
	@FindBy(css="div.bootstrap-datetimepicker-widget:nth-child(6) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2)")
	private WebElement datePickerTable;
	
	private String NextDate = getNextDay();
	
	
	public void selectEndDate() {
		
		System.out.println("*****"+NextDate);
			this.SelectValidEndDate.click();
				WebElement dateWidgetFrom = this.datePickerTable;
				List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
					for (WebElement cell: columns) {
						if (cell.getText().equals(NextDate)) {
							cell.click();
								break;
							}
					}			
	   		}
	
	private String getNextDay (){
		
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
        
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
		
        int NextDay = calendar.get(Calendar.DAY_OF_MONTH)+1;
		System.out.println("Next Day: " + NextDay +"\n");
		
		String NextDaystr = Integer.toString(NextDay);
		System.out.println("Next Day Str: " + NextDaystr +"\n");
		
        return NextDaystr;
    }
	
	
// Introducing blank click on the page after date end
	
		@FindBy(css="#content")
		private WebElement BlankClick2;
		
		public void AddBlankClickAfterDateEnd() {
			this.BlankClick2.click();
		}
		
// 19. Click on Rewards Point tab

	@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")
	private WebElement RewardPoints;
	
	public void clickOnRewardPoints() {
		this.RewardPoints.click();
	}

// 20. Enter valid credentials in points textbox

	@FindBy(css="#input-points")
	private WebElement Points;
	
	public void SendPoints(String Points) {
		this.Points.clear();
		this.Points.sendKeys(Points);
	}
	
// 21. Keep default values in Attribute, Option, Recurring,  Special, Image and Design tab
	
	@FindBy(css="#form-product > ul:nth-child(1) > li:nth-child(11) > a:nth-child(1)")
	private WebElement DesignTab;
	
	public void clickOnDesignTab() {
		this.DesignTab.click();
	}
	

// 22. Click on Save icon

	@FindBy(css=".fa-save")
	private WebElement SaveIcon;
	
	public void clickOnSaveIcon() {
		this.SaveIcon.click();
	}


}
