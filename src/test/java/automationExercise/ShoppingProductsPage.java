package automationExercise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utiles.Setup;
import utiles.WaitMethods;

public class ShoppingProductsPage {

	
	/* Locators */
	final static String  PRODUCT_BUTTON = "Produc";
	final static String  SEARCH_PRODUCT = "search_product";
	final static String  SUBMIT_SEARCH = "submit_search";
	final static String  SEARCH_PRODUCTS = "div.container div.row div.col-sm-9.padding-right div.features_items > h2.title.text-center:nth-child(1)";
	
	final static String  DRESS_PRODUCT1 ="body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1)";
	final static String  DRESS_PRODUCT2 ="body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1)";
	final static String  DRESS_PRODUCT1_ADDBUTTON="//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]";
	final static String  DRESS_PRODUCT2_ADDBUTTON="//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]";
	final static String  DRESS_PRODUCT3 ="div.container div.row div.col-sm-9.padding-right div.features_items div.col-sm-4:nth-child(5) div.product-image-wrapper div.single-products div.product-overlay div.overlay-content > h2:nth-child(1)";
	final static String  DRESS_PRODUCT3_ADDBUTTON= "div.container div.row div.col-sm-9.padding-right div.features_items div.col-sm-4:nth-child(5) div.product-image-wrapper div.single-products div.product-overlay div.overlay-content > a.btn.btn-default.add-to-cart:nth-child(3)";
	final static String  CONTINUE_BUTTON = "//button[contains(text(),'Continue Shopping')]";
	final static String  CONTINUE_BUTTON1 ="div.container div.row div.col-sm-9.padding-right div.features_items div.modal.show:nth-child(2) div.modal-dialog.modal-confirm div.modal-content div.modal-footer > button.btn.btn-success.close-modal.btn-block";
	final static String  VIEW_CART_BUTTON = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a" ;
	
	final static String  STYLISH_DRESS = "Stylish Dre";
	final static String  QUANTITY_BUTTON = "quantity" ;
	final static String  ADD_PRODUCT_BUTTON = "quantity" ;
	final static String  CONTUNUE_BUTTON1 = "div.container div.row div.col-sm-9.padding-right div.modal.show div.modal-dialog.modal-confirm div.modal-content div.modal-footer > button.btn.btn-success.close-modal.btn-block" ;
	final static String  VIEW_CART_BUTTON2 = "div.container div.row div.col-sm-9.padding-right div.modal.show div.modal-dialog.modal-confirm div.modal-content div.modal-body p.text-center:nth-child(2) a:nth-child(1) > u:nth-child(1)" ;
	
	final static String  PORCEED_TO_CHECKOUT = "Proceed To Checko";
    final static String  LOGIN_BUTTON = "div.container div.modal.show div.modal-dialog.modal-confirm div.modal-content div.modal-body p.text-center:nth-child(2) a:nth-child(1) > u:nth-child(1)" ;
    
    /* @FindBy */
   	@FindBy (how=How.PARTIAL_LINK_TEXT, using = PRODUCT_BUTTON) 
   	public static WebElement productButton ; 
	@FindBy (how=How.ID, using = SEARCH_PRODUCT)
	public static WebElement searchProduct ; 
	@FindBy (how=How.ID, using = SUBMIT_SEARCH)
	public static WebElement submitSearch ; 
	@FindBy (how=How.CSS, using = SEARCH_PRODUCTS)
	public static WebElement searchProducts ; 
	@FindBy (how=How.CSS, using = DRESS_PRODUCT1)
	public static WebElement dressproduct1 ; 
	@FindBy (how=How.CSS, using = DRESS_PRODUCT2)
	public static WebElement dressProduct2 ; 
	@FindBy (how=How.CSS, using = DRESS_PRODUCT3)
	public static WebElement dressProduct3 ; 
	@FindBy (how=How.XPATH, using = DRESS_PRODUCT1_ADDBUTTON)
	public static WebElement dressproduct1AddButton ; 
	@FindBy (how=How.XPATH, using = DRESS_PRODUCT2_ADDBUTTON)
	public static WebElement dressProduct2AddButton ; 
	@FindBy (how=How.XPATH, using = DRESS_PRODUCT3)
	public static WebElement dressProduct3AddButton ; 
	
	@FindBy (how=How.XPATH, using = CONTINUE_BUTTON)
	public static WebElement continueButton ;
	@FindBy (how=How.CSS, using = CONTINUE_BUTTON1)
	public static WebElement cartButton ;
	@FindBy (how=How.XPATH, using = VIEW_CART_BUTTON)
	public static WebElement viewCartButton ;
	
	@FindBy (how=How.PARTIAL_LINK_TEXT, using = STYLISH_DRESS)
	public static WebElement stylishDress ;
   	@FindBy (how = How.CSS, using = QUANTITY_BUTTON)
   	public static WebElement quantityProductButton ; 
   	@FindBy (how = How.CLASS_NAME, using = ADD_PRODUCT_BUTTON)
   	public static WebElement addProductButton ;
   	@FindBy (how = How.CSS, using = CONTUNUE_BUTTON1)
   	public static WebElement continueButton2 ; 
   	@FindBy (how = How.CSS, using = VIEW_CART_BUTTON2)
   	public static WebElement viewCartButton2 ;
   	
   	@FindBy (how = How.PARTIAL_LINK_TEXT, using = PORCEED_TO_CHECKOUT)
   	public static WebElement porceedToCheckout ;
   	@FindBy (how = How.CSS, using = LOGIN_BUTTON)
   	public static WebElement loginInButton ;
   	
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
	    	System.out.println(" the submit button is displayed");
	    	submitSearch.click(); 
	    }
	    }  
	public String getSearchProductsMessage() {
		return searchProducts.getText();
	}
	public void moveToSleevelessDressProduct() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",dressproduct1);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, DRESS_PRODUCT1, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(dressproduct1).build().perform();
	}
	public void clickOnSleeveDressProduct() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, DRESS_PRODUCT1_ADDBUTTON, 10);
		boolean dressproduct1AddButtonIsDisplayed = dressproduct1AddButton.isDisplayed();
		if (dressproduct1AddButtonIsDisplayed == true) {
		System.out.println(" the continue button is Displayed");
		Actions act = new Actions(driver);
	    act.moveToElement(dressproduct1AddButton).doubleClick().build().perform();
		//dressproduct1AddButton.click();
	}
	}
	public void clickOnContinueButton() {
		String handle = driver.getWindowHandle();
		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, CONTINUE_BUTTON, 10);
		boolean porceedButtonIsDisplayed = continueButton.isDisplayed();
		if (porceedButtonIsDisplayed == true) {
			System.out.println(" the continue button is Displayed");
		    continueButton.click();
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
    } 	
	public void moveToStaylishProduct() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",dressProduct2);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, DRESS_PRODUCT2, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(dressProduct2).perform();
	}
	public void clickOnStylishProduct() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, DRESS_PRODUCT2_ADDBUTTON, 10);
		boolean dressProduct2AddButtonIsDisplayed = dressProduct2AddButton.isDisplayed();
		if (dressProduct2AddButtonIsDisplayed == true) {
		System.out.println(" the add product button is Displayed");
		Actions act = new Actions(driver);
	    act.moveToElement(dressProduct2AddButton).doubleClick().build().perform();
		//dressProduct2AddButton.click(); 		 
	}
	}
	public void clickOnCartButton() {
	  String handle9 = driver.getWindowHandle();
	  Boolean viewCartButtonIsDisplayed = viewCartButton.isDisplayed();
	  if (viewCartButtonIsDisplayed == true ) {
		  System.out.println("the cart button is Displayed");
		  viewCartButton.click(); 
    try {
     Set<String> handles9 = driver.getWindowHandles();
     System.out.println(handles9);
        for (String windowHandle : handles9) {
            if (!windowHandle.equals(handle9)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    } catch (NoSuchWindowException e) {
        e.printStackTrace();
    }
    } 	
	}
	public void clickOnStylishDressProduct() {
		String handle1 = driver.getWindowHandle();
		stylishDress.click();
	    try {
	     Set<String> handles1 = driver.getWindowHandles();
	     System.out.println(handles1);
	        for (String windowHandle : handles1) {
	            if (!windowHandle.equals(handle1)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    }
	    } 	
	public void clickOnQuantityProduct(String quantity) {
		 Select quantityProductButton = new Select(driver.findElement(By.cssSelector(QUANTITY_BUTTON)));
		 quantityProductButton.selectByValue(quantity);
	}
	public void ClickOnAddProductButton () {
		String handle5 = driver.getWindowHandle();
		Boolean addProductButtonIsDisplayed = addProductButton.isDisplayed();
		  if (addProductButtonIsDisplayed == true ) {
			  System.out.println("the add product button is Displayed");
			  
		addProductButton.click();
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
	public void clickOnCartButtonProduct() {
		String handle4 = driver.getWindowHandle();
		viewCartButton2.click();
	    try {
	     Set<String> handles4 = driver.getWindowHandles();
	     System.out.println(handles4);
	        for (String windowHandle : handles4) {
	            if (!windowHandle.equals(handle4)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    }
	    } 	
	public void clickOnPorceedToCheckOutButton() {
		
		boolean selectporceedToCheckout = porceedToCheckout.isDisplayed();
	    if (selectporceedToCheckout == true) {
	    	System.out.println("the proceed to chechout button is Displayed");
	    	porceedToCheckout.click();
	    }
	}
	public void clickOnLoginInButton() {
		boolean selectloginInButton = loginInButton.isDisplayed();
	    if (selectloginInButton == true) {
	    	System.out.println("the login button is Displayed");
	    	loginInButton.click(); 
	    }
	}
}
