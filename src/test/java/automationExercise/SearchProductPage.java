package automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class SearchProductPage {

	
	/* Locators */
	final static String  PRODUCTS_BUTTON = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(2) > a:nth-child(1)";
	final static String  SEARCH_INPUT = "#search_product";
	final static String  SEARCH_BUTTON = "#submit_search";
	final static String  SEARCH_BRODUCTS = "div.container div.row div.col-sm-9.padding-right div.features_items > h2.title.text-center:nth-child(1)";
	
	
	
	 /* @FindBy */
	@FindBy (how=How.CSS, using = PRODUCTS_BUTTON) 
	public static WebElement productsButton ; 
	@FindBy (how=How.CSS, using = SEARCH_BUTTON)
	public static WebElement searchButton ; 
	@FindBy (how=How.CSS, using = SEARCH_INPUT)
	public static WebElement searchInput ; 
	@FindBy (how=How.CSS, using = SEARCH_BRODUCTS)
	public static WebElement searchProducts ; 
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
    
	/* Methods */ 
   // public void navigateToAutomationURL () throws InterruptedException {
    	//Thread.sleep(5000); 
    	//String url = "https://automationexercise.com/";
    	//} 
	public void clickOnProductsButton () throws InterruptedException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	productsButton.click(); 
	}
	public void fillProductInSearchInput(String productinput) {
		searchInput.clear();
		searchInput.sendKeys(productinput);
	}
	public void clickonProductSearchInput() {
		Boolean searchButtonIsDisplayed = searchButton.isDisplayed();
		if (searchButtonIsDisplayed == true) {
			System.out.println("the login button is Displayed");
		}
		searchButton.click();
	}
	public String getSearchProductsMsg( String searchproductsmsg ) {
		return searchProducts.getText();
	}
}

