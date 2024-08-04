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

public class ResearchAndAddProductPage {

	/* Locators */
	final static String  PRODUCT_BUTTON = "Produc";
	final static String  SEARCH_PRODUCT = "search_product";
	final static String  SUBMIT_SEARCH = "submit_search";
	final static String  SEARCH_PRODUCTS = "div.container div.row div.col-sm-9.padding-right div.features_items > h2.title.text-center:nth-child(1)";
	
	final static String  BLUE_TOP_PRODUCT ="div.container div.row div.col-sm-9.padding-right div.features_items div.col-sm-4:nth-child(3) div.product-image-wrapper div.choose ul.nav.nav-pills.nav-justified li:nth-child(1) > a:nth-child(1)";
	final static String  INCREASE_BUTTON ="#quantity";
	final static String  ADD__TOCART_BUTTON ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information span:nth-child(5) > button.btn.btn-default.cart:nth-child(5)";
	final static String  PRICE__PRODUCT ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information span:nth-child(5) > span:nth-child(1)";
	final static String  CATEGORY__PRODUCT ="div.container div.row div.col-sm-9.padding-right div.product-details div.col-sm-7 div.product-information > p:nth-child(3)";
	final static String  VIEW__CART_BUTTON ="//u[normalize-space()='View Cart']";
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
	@FindBy (how=How.CSS, using = BLUE_TOP_PRODUCT)
	public static WebElement blueTopProduct ; 
	
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
	@FindBy (how=How.LINK_TEXT, using = PROCEED__CHECKOUT_BUTTON)
	public static WebElement proceedCheckOutButton ;
	@FindBy (how=How.XPATH, using = REGISTRER__LOGIN_BUTTON)
	public static WebElement registerLoginButton ;
	
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
   
	/* Methods */ 
	public void clickProductButton () throws InterruptedException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	productButton.click(); 
	}
	public void enterProductInSearchProduct(String productinput) {
		searchProduct.sendKeys(productinput);
	}
	public void clickonProductsSearchProduct() {
		boolean selectsubmitSearch = submitSearch.isDisplayed();
	    if (selectsubmitSearch == true) {
	    	System.out.println(" the products search button is displayed");
	    	submitSearch.click(); 
	    }
	    } 
	public void moveAndClickToBlueTopProduct() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",blueTopProduct);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, BLUE_TOP_PRODUCT, 10);
		//Actions act = new Actions(driver);
	    //act.moveToElement(blueTopProduct).click().build().perform();
		blueTopProduct.click();
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
	public String getPriceProductMessage() {
		return priceProduct.getText();
	}
	public String getCategoryProductMessage() {
		return categoryProduct.getText();
	}
	public void clickOnIncreaseButton(String input) {
		boolean increaseButtonSearch = increaseButton.isDisplayed();
	    if (increaseButtonSearch == true) {
	    	System.out.println(" the increase button is displayed");
	    	increaseButton.clear();
	    	increaseButton.sendKeys(input); 
	    }
	}
	public void ClickOnAddProductsButton () {
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
	public void ClickOnViewCartButton () {
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
	
	public void clickOnProceedCheckOutButton() {
		boolean proceedCheckOutButtonSearch = proceedCheckOutButton.isDisplayed();
	    if (proceedCheckOutButtonSearch == true) {
	    	System.out.println(" the proceed check out button is displayed");
	    	proceedCheckOutButton.click(); 
	    }
	    } 
	public void ClickOnRegisterLoginButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",registerLoginButton);
		wait.explicitWaitUntilButtonIsClickableXpath(driver, REGISTRER__LOGIN_BUTTON, 10);
		String handle0 = driver.getWindowHandle();
		Actions act = new Actions(driver);
	    act.moveToElement(registerLoginButton).doubleClick().build().perform(); 
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
