package ecommerceProject;

import java.io.IOException;
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

public class SearchAndAddProductPage {

	/* Locators */
	final static String  WOMEN_BUTTON = "body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.sf-contener.clearfix.col-lg-12:nth-child(6) ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-child(1) > a.sf-with-ul";
	final static String  DRESSES_EVENING = "body.index.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.sf-contener.clearfix.col-lg-12:nth-child(6) ul.sf-menu.clearfix.menu-content.sf-js-enabled.sf-arrows li:nth-child(1) ul.submenu-container.clearfix.first-in-line-xs li:nth-child(2) ul:nth-child(2) > li:nth-child(2)";
	final static String  PRINTED_DRESS ="body.category.category-10.category-evening-dresses.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-9 ul.product_list.grid.row:nth-child(4) li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line div.product-container div.right-block h5:nth-child(1) > a.product-name";
	
	final static String  SEARCH_BARRE ="#search_query_top";
	final static String  SEARCH_BUTTON ="submit_search";
	
	final static String  SUMMER_DRESS_PRODUCT ="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]";
	final static String  MORE_BUTTON ="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]";
	final static String  SUMMER_DRESS_BUTTON ="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/h5[1]/a[1]";
	
	
	final static String  INCREASE_BUTTON ="icon-plus";
	final static String  SIZE_BUTTON ="#group_1";
	final static String  COLOR_BUTTON ="#color_16";
	final static String  PRICE_DRESS ="#our_price_display";
	final static String  ADD_TO_CART ="#add_to_cart";
	final static String  PORCEED_BUTTON ="buttons_bottom_block no-print";
	
	final static String  DECREASE_BUTTON ="icon-minus";
	final static String  TOTAL_PRICE_DRESS ="total_price";
	
	final static String  PROCEED_TO_CHECKOUT ="button-exclusive btn btn-default";
	final static String  PROCEED_TO_CHECKOUTS ="button-exclusive btn btn-default";
	
	final static String  Email_INFORMATION ="email";
	final static String  PASSWORD_INFORMATION ="passwd";
	final static String  SIGNIN_BUTTON ="SubmitLogin";
	
	final static String  PROCEED_CHECKOUT ="processAddress";
	final static String  PRICE_DELIVERY ="delivery_option_price";
	final static String  AGREE_DELIVERY ="#cgv";
	final static String  PROCEED_CHECKOUTED ="processCarrier";
	
	final static String  PAY_BY_BANK ="Pay by bank wi";
	final static String  ICONFIRM_MYORDER_BUTTON ="button btn btn-default button-medium";
	final static String  CONFIRM_ORDER_MESSAGE ="alert alert-success";
	
    /* @FindBy */
	@FindBy (how=How.CSS, using = WOMEN_BUTTON) 
	public static WebElement womenClick ; 
	@FindBy (how= How.CSS, using = DRESSES_EVENING)
	public static WebElement dressesEvening ;
	@FindBy (how= How.CSS, using = PRINTED_DRESS)
	public static WebElement printedDress ;
	@FindBy (how= How.CSS, using = SEARCH_BARRE)
	public static WebElement searchBarre ;
	@FindBy (how= How.NAME, using = SEARCH_BUTTON)
	public static WebElement searchButton ;
	
	
	@FindBy (how= How.XPATH, using = SUMMER_DRESS_PRODUCT)
	public static WebElement SummerDressProduct ;
	@FindBy (how= How.XPATH, using = MORE_BUTTON)
	public static WebElement moreButton ;
	@FindBy (how= How.XPATH, using = SUMMER_DRESS_BUTTON)
	public static WebElement printedSummerDress ;
	
	@FindBy (how= How.CLASS_NAME, using = INCREASE_BUTTON)
	public static WebElement increaseButton ;
	@FindBy (how= How.CSS, using = SIZE_BUTTON)
	public static WebElement sizeButton ;
	@FindBy (how= How.CSS, using = COLOR_BUTTON)
	public static WebElement colorButton ;
	@FindBy (how= How.CSS, using = PRICE_DRESS)
	public static WebElement priceDress ;
	@FindBy (how= How.CSS, using = ADD_TO_CART)
	public static WebElement addToCart ;
	@FindBy (how= How.CLASS_NAME, using = PORCEED_BUTTON)
	public static WebElement porceedButton ;
	
	@FindBy (how= How.CLASS_NAME, using = DECREASE_BUTTON)
	public static WebElement decreaseButton ;
	@FindBy (how= How.ID, using = TOTAL_PRICE_DRESS)
	public static WebElement priceTotalDress ;
	@FindBy (how= How.CLASS_NAME, using = PROCEED_TO_CHECKOUT)
	public static WebElement proceedToCheckoutButton ;
	
	@FindBy (how= How.CLASS_NAME, using = PROCEED_TO_CHECKOUTS)
	public static WebElement proceedToCheckoutsButton ;
	@FindBy (how= How.ID, using = Email_INFORMATION)
	public static WebElement EmailInformation ;
	@FindBy (how= How.ID, using = PASSWORD_INFORMATION)
	public static WebElement passWordInformation ;
	@FindBy (how= How.ID, using = SIGNIN_BUTTON)
	public static WebElement signInButton ;
	
	@FindBy (how= How.NAME, using = PROCEED_CHECKOUT)
	public static WebElement proceedCheckout ;
	@FindBy (how= How.CLASS_NAME, using = PRICE_DELIVERY)
	public static WebElement priceDelivery ;
	@FindBy (how= How.CSS, using = AGREE_DELIVERY)
	public static WebElement agreeDelivery ;
	@FindBy (how= How.NAME, using = PROCEED_CHECKOUTED)
	public static WebElement proceedCheckouted ;
	@FindBy (how= How.PARTIAL_LINK_TEXT, using = PAY_BY_BANK)
	public static WebElement  payByBank;
	@FindBy (how= How.CLASS_NAME, using = ICONFIRM_MYORDER_BUTTON)
	public static WebElement iConfirmMyOrderButton ;
	@FindBy (how= How.CLASS_NAME, using = CONFIRM_ORDER_MESSAGE)
	public static WebElement ConfirmOrderMessage ;
	
	/* Initialization */
	
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
    String handle1;
    
	public void moveToWomenButton () throws InterruptedException , IOException {
	Thread.sleep(5000); 
    wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, WOMEN_BUTTON, 10);
	Actions act = new Actions(driver);
	act.moveToElement(womenClick).perform();
	} 
	public void moveToDressEveningButton () {
	    handle1 = driver.getWindowHandle();
	    System.out.println(handle1);
	    Actions act = new Actions(driver);
	    act.moveToElement(dressesEvening).perform();
	}
	public void clickOnDressEveningButton () {
		boolean dressesEveningIsDisplayed = dressesEvening.isDisplayed();
		if (dressesEveningIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		}
		dressesEvening.click();
	    try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!handle1.equals(windowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
	}
	public String getPrintedDressMsg( ) {
		return printedDress.getText();
	}
	public void fillDressEveningButton () {
		String printDressText = printedDress.getText();
		searchBarre.sendKeys(printDressText);
	}
	public void clickOnSearchButton () {
		boolean searchButtonIsEnabled = searchButton.isDisplayed();
		if (searchButtonIsEnabled == true) {
			System.out.println(" the login button is Enabled");
		}
		searchButton.click();
	}
	public void moveMouseOverDressProduct () {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",SummerDressProduct);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, SUMMER_DRESS_PRODUCT, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(SummerDressProduct).build().perform();
	    
	}
	public void clickOnMoreButton () throws InterruptedException {
		
	// Attente explicite pour permettre à l'élément "more" d'être cliquable
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement moretButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("moreButton")));
		
		// Cliquez sur le bouton "more"
		Actions act = new Actions(driver);
		act.moveToElement(moreButton).click().build().perform();;
		moreButton.click();
		Thread.sleep(5000); 
			
		}
	public void clickOnIncreaseButton () {
		boolean increaseButtonIsEnable = increaseButton.isDisplayed();
		if (increaseButtonIsEnable == true) {
			System.out.println(" the login button is Displayed");
		}
		increaseButton.click();	
	}
	public void selectSizeButton (String sizebutton) {
		Select chooseSizeButton = new Select(driver.findElement(By.cssSelector(SIZE_BUTTON)));
		chooseSizeButton.selectByVisibleText(sizebutton);
		}
	public void clickOnColorButton () {
		boolean colorButtonIsDisplayed = colorButton.isDisplayed();
		if (colorButtonIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		    colorButton.click();	
		}
	}
	public String getPriceDressMsg( ) {
		return priceDress.getText();
	}
	public void clickOnAddToCartButton () {
		boolean addToCartIsDisplayed = addToCart.isDisplayed();
		if (addToCartIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		}
		addToCart.click();	
	}
	public void clickOnPorceedButton () {
		 String handle2 = driver.getWindowHandle();
		 boolean porceedButtonIsDisplayed = porceedButton.isDisplayed();
			if (porceedButtonIsDisplayed == true) {
				System.out.println(" the login button is Displayed");
			}
		porceedButton.click();
	    try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!windowHandle.equals(handle2)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
	    String newWindowTitle = driver.getTitle();
        System.out.println("Titre de la nouvelle fenêtre : " + newWindowTitle);
	}
	public void clickOnDecreaseButton () {
		boolean decreaseButtonIsEnable = decreaseButton.isEnabled();
		if (decreaseButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		}
		decreaseButton.click();	
	}
	public String getTotalPriceDressMsg() {
		return priceTotalDress.getText();
	}
	public void clickOnProceedToCheckOutButton () {
		boolean proceedToCheckoutButtonIsEnable = proceedToCheckoutButton.isEnabled();
		if (proceedToCheckoutButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    proceedToCheckoutButton.click();
		}
	}
	public void clickOnProceedToCheckOutsButton () {
		 boolean proceedToCheckoutsButtonIsDisplayed = proceedToCheckoutsButton.isDisplayed();
			if (proceedToCheckoutsButtonIsDisplayed == true) {
				System.out.println(" the login button is Displayed");
		        proceedToCheckoutsButton.click();
			}
	}
	public void fillAdressMailInformation (String email) {
		passWordInformation.sendKeys(email);
	}
	public void fillPassWordInformation (String password) {
		passWordInformation.sendKeys(password);
	}
	public void clickOnSingnInButton () {
		boolean signInButtonIsEnable = signInButton.isEnabled();
		if (signInButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		}
		signInButton.click();	
	}
	public void clickOnproceedCheckoutButton () {
		boolean proceedCheckoutIsEnable = proceedCheckout.isEnabled();
		if (proceedCheckoutIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    proceedCheckout.click();	
		}
	}
	public String getPriceDeliveryMsg( ) {
		return priceDelivery.getText();
	}
	public void clickOnAgreeDelivrery () { 
		boolean selectagreeDelivery = agreeDelivery.isSelected();
	    if (selectagreeDelivery == false) {
	    	agreeDelivery.click();
	}
	}
	public void clickOnproceedCheckoutedButton () {
		boolean selectproceedCheckouted = proceedCheckouted.isEnabled();
	    if (selectproceedCheckouted == true) {
		proceedCheckouted.click();
	    }
	}
	public void clickOnPayByBankButton () {
		boolean selectpayByBank = payByBank.isEnabled();
	    if (selectpayByBank == true) {
		payByBank.click();	
	    }
	}
	public void clickOnIConfirMyOrderButton () {
		boolean selectiConfirmMyOrderButton = iConfirmMyOrderButton.isEnabled();
	    if (selectiConfirmMyOrderButton == true) {
		iConfirmMyOrderButton.click();	
	    }
	}
	public String getConfirmOrderMsg() {
		return ConfirmOrderMessage.getText();
	}
}