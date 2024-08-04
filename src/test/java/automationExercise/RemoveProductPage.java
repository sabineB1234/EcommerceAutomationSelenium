package automationExercise;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class RemoveProductPage {

	/* Locators */
	final static String  PRODUCT_BUTTON = "Produc";
	final static String  SEARCH_PRODUCT = "search_product";
	final static String  SUBMIT_SEARCH = "submit_search";
	final static String  SEARCH_PRODUCTS = "div.container div.row div.col-sm-9.padding-right div.features_items > h2.title.text-center:nth-child(1)";
	
	final static String  SAREE_SILK_PRODUCT ="div.container div.row div.col-sm-9.padding-right div.features_items div.col-sm-4:nth-child(3) div.product-image-wrapper div.choose ul.nav.nav-pills.nav-justified li:nth-child(1) > a:nth-child(1)";
	final static String  INCREASE_BUTTON ="#quantity";
	final static String  ADD__TOCART_BUTTON ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information span:nth-child(5) > button.btn.btn-default.cart:nth-child(5)";
	final static String  PRICE__PRODUCT ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information span:nth-child(5) > span:nth-child(1)";
	final static String  CATEGORY__PRODUCT ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information > p:nth-child(3)";
	final static String  VIEW__CART_BUTTON ="//u[normalize-space()='View Cart']";
	final static String  MOVE__PRODUCT_BUTTON ="//tbody/tr[@id='product-39']/td[6]/a[1]/i[1]";
	final static String  SAREE__SILK_MESSAGE ="//a[contains(text(),'Cotton Silk Hand Block Print Saree')]";
	final static String  HOME_BUTTON ="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]";
	
	final static String  PROCEED__CHECKOUT_BUTTON ="Proceed To Checkout";
	final static String  REGISTRER__LOGIN_BUTTON ="//u[normalize-space()='Register / Login']";
	
	
	 /* @FindBy */
   	@FindBy (how=How.PARTIAL_LINK_TEXT, using = PRODUCT_BUTTON) 
   	public static WebElement productButton ; 
	@FindBy (how=How.ID, using = SEARCH_PRODUCT)
	public static WebElement searchProduct ; 
	@FindBy (how=How.ID, using = SUBMIT_SEARCH)
	public static WebElement submitSearch ; 
	@FindBy (how=How.CSS, using = SEARCH_PRODUCTS)
	public static WebElement searchProducts ; 
	@FindBy (how=How.CSS, using = SAREE_SILK_PRODUCT)
	public static WebElement sareeSilkProduct ; 
	
	@FindBy (how=How.CSS, using = INCREASE_BUTTON)
	public static WebElement increaseButton ;
	@FindBy (how=How.CSS, using = ADD__TOCART_BUTTON)
	public static WebElement addToCartButton ;
	@FindBy (how=How.CSS, using = PRICE__PRODUCT)
	public static WebElement priceProduct ;
	@FindBy (how=How.CSS, using = CATEGORY__PRODUCT)
	public static WebElement categoryProduct ;
	@FindBy (how=How.XPATH, using = VIEW__CART_BUTTON)
	public static WebElement viewCartButton ;
	@FindBy (how=How.XPATH, using = MOVE__PRODUCT_BUTTON)
	public static WebElement moveProductButton ;
	@FindBy (how=How.XPATH, using = SAREE__SILK_MESSAGE)
	public static WebElement sareeSilkMessage ;
	@FindBy (how=How.XPATH, using = HOME_BUTTON)
	public static WebElement homeButton ;
	
	
	@FindBy (how=How.LINK_TEXT, using = PROCEED__CHECKOUT_BUTTON)
	public static WebElement proceedCheckOutButton ;
	@FindBy (how=How.XPATH, using = REGISTRER__LOGIN_BUTTON)
	public static WebElement registerLoginButton ;
	
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
   
	/* Methods */ 
	public void clickOnProductsButton () throws InterruptedException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	productButton.click(); 
	}
	public void enterSareeProductInSearchProduct(String productinput) {
		searchProduct.sendKeys(productinput);
	}
	public void clickonProductsSearchProductButton() {
		boolean selectsubmitSearch = submitSearch.isDisplayed();
	    if (selectsubmitSearch == true) {
	    	System.out.println(" the products search button is displayed");
	    	submitSearch.click(); 
	    }
	    } 
	public void moveAndClickToBlueTopProduct() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",sareeSilkProduct);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver,SAREE_SILK_PRODUCT, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(sareeSilkProduct).click().build().perform();
		//sareeSilkProduct.click();
	    String handle = driver.getWindowHandle();
	    try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!windowHandle.equals(handle)) {
	                driver.switchTo().window(windowHandle);
	                break; 
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
		}
	public void clickOnIncreasedButton(String input) {
		boolean increaseButtonSearch = increaseButton.isDisplayed();
	    if (increaseButtonSearch == true) {
	    	System.out.println(" the increase button is displayed");
	    	increaseButton.clear();
	    	increaseButton.sendKeys(input); 
	    }
	}
	public void clickOnAddProductsButtons () {
		String handle5 = driver.getWindowHandle();
		Boolean addToCartButtonIsDisplayed = addToCartButton.isDisplayed();
		  if (addToCartButtonIsDisplayed == true ) {
			  System.out.println("the add product button is Displayed");
			  Actions act = new Actions(driver);
			  act.moveToElement(addToCartButton).doubleClick().build().perform();
		//addToCartButton.click();
	    try {
	     Set<String> handles5 = driver.getWindowHandles();
	     System.out.println(handles5);
	        for (String windowHandle : handles5) {
	            if (!windowHandle.equals(handle5)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    }
	}
	}
	public void ClickOnViewCartToProceedButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",viewCartButton);
		wait.explicitWaitUntilButtonIsClickableXpath(driver, VIEW__CART_BUTTON, 10);
		String handle6 = driver.getWindowHandle();
	    Actions act = new Actions(driver);
	    act.moveToElement(viewCartButton).doubleClick().build().perform();
	    try {
	     Set<String> handles6 = driver.getWindowHandles();
	     System.out.println(handles6);
	        for (String windowHandle : handles6) {
	            if (!windowHandle.equals(handle6)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    }
	}
	public String getSareeSilkProductMessage() {
		return sareeSilkMessage.getText();
	}
	public void clickOnRemoveProductButton() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",moveProductButton);
		boolean proceedCheckOutButtonSearch = moveProductButton.isDisplayed();
	    if (proceedCheckOutButtonSearch == true) {
	    	System.out.println(" the proceed check out button is displayed");
	    	moveProductButton.click(); 
	    }
	    } 
	public void ClickOnHomeButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",homeButton);
		wait.explicitWaitUntilButtonIsClickableXpath(driver, HOME_BUTTON, 10);
		String handle0 = driver.getWindowHandle();
		Actions act = new Actions(driver);
	    act.moveToElement(homeButton).click().build().perform(); 
	    try {
	     Set<String> handles0 = driver.getWindowHandles();
	     System.out.println(handles0);
	        for (String windowHandle : handles0) {
	            if (!windowHandle.equals(handle0)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    }
	}
	}
