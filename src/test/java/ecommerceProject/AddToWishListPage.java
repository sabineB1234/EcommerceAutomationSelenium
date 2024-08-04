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

public class AddToWishListPage { 

	/* Locators */
	final static String  DRESS_BUTTON = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)";
	final static String  SUMMER_DRESS = "li[class='sfHover'] ul[class='submenu-container clearfix first-in-line-xs'] li a[title='Summer Dresses']";
	final static String  PRINTED_SUMMER_DRESS =".right-block";
	final static String  MORE_BUTTON ="a[title='View'] span";
	
	final static String  INCREASE_BUTTON =".icon-plus";
	final static String  SIZE_BUTTON ="#group_1";
	final static String  COLOR_BUTTON ="#color_14";
	final static String  COLOR_YELLOW_BUTTON ="#color_16";

	final static String  PRICE_DRESS ="#our_price_display";
	final static String  ADD_TO_CART ="#add_to_cart";
	final static String  PORCEED_BUTTON ="body.product.product-5.product-printed-summer-dress.category-11.category-summer-dresses.hide-left-column.hide-right-column.lang_en:nth-child(2) div.header-container div.container div.row div.clearfix div.layer_cart_cart.col-xs-12.col-md-6 div.button-container:nth-child(5) a.btn.btn-default.button.button-medium > span:nth-child(1)";
	
	final static String  DECREASE_BUTTON =".icon-minus";
	final static String  TOTAL_PRICE_DRESS ="#total_price";
	
	final static String  PROCEED_TO_CHECKOUT ="a[class='button btn btn-default standard-checkout button-medium'] span";
	final static String  PROCEED_TO_CHECKOUTS ="button-exclusive btn btn-default";
	
	final static String  Email_INFORMATION ="#email";
	final static String  PASSWORD_INFORMATION ="#passwd";
	final static String  SIGNIN_BUTTON ="SubmitLogin";
	
	final static String  PROCEED_CHECKOUT ="processAddress";
	final static String  PRICE_DELIVERY ="delivery_option_price";
	final static String  AGREE_DELIVERY ="#cgv";
	final static String  PROCEED_CHECKOUTED ="processCarrier";
	
	final static String  PAY_BY_BANK ="Pay by bank wi";
	final static String  ICONFIRM_MYORDER_BUTTON ="body.module-bankwire-payment.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form:nth-child(3) p.cart_navigation.clearfix button.button.btn.btn-default.button-medium > span:nth-child(1)";
	final static String  CONFIRM_ORDER_MESSAGE ="body.order-confirmation.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 > p.alert.alert-success";
	
	 /* @FindBy */
	@FindBy (how=How.CSS, using = DRESS_BUTTON) 
	public static WebElement dressButton ; 
	@FindBy (how= How.CSS, using = SUMMER_DRESS)
	public static WebElement summerDress ;
	@FindBy (how= How.CSS, using = PRINTED_SUMMER_DRESS)
	public static WebElement printedSummerDress ;
	@FindBy (how= How.CSS, using = MORE_BUTTON)
	public static WebElement moreButton ;
	
	@FindBy (how= How.CSS, using = INCREASE_BUTTON)
	public static WebElement increaseButton ;
	@FindBy (how= How.CSS, using = SIZE_BUTTON)
	public static WebElement sizeButton ;
	@FindBy (how= How.CSS, using = COLOR_BUTTON)
	public static WebElement colorButton ;
	@FindBy (how= How.CSS, using = COLOR_YELLOW_BUTTON)
	public static WebElement colorYellowButton ;
	
	@FindBy (how= How.CSS, using = PRICE_DRESS)
	public static WebElement priceDress ;
	@FindBy (how= How.CSS, using = ADD_TO_CART)
	public static WebElement addToCart ;
	@FindBy (how= How.CSS, using = PORCEED_BUTTON)
	public static WebElement porceedButton ;
	
	@FindBy (how= How.CSS, using = DECREASE_BUTTON)
	public static WebElement decreaseButton ;
	@FindBy (how= How.CSS, using = TOTAL_PRICE_DRESS)
	public static WebElement priceTotalDress ;
	@FindBy (how= How.CSS, using = PROCEED_TO_CHECKOUT)
	public static WebElement proceedToCheckoutButton ;
	
	@FindBy (how= How.CLASS_NAME, using = PROCEED_TO_CHECKOUTS)
	public static WebElement proceedToCheckoutsButton ;
	@FindBy (how= How.CSS, using = Email_INFORMATION)
	public static WebElement EmailInformation ;
	@FindBy (how= How.CSS, using = PASSWORD_INFORMATION)
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
	@FindBy (how= How.CSS, using = ICONFIRM_MYORDER_BUTTON)
	public static WebElement iConfirmMyOrderButton ;
	@FindBy (how= How.CSS, using = CONFIRM_ORDER_MESSAGE)
	public static WebElement ConfirmOrderMessage ;
	
/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
    String handle1;
	public void moveToWomenButton () throws InterruptedException , IOException {
	Thread.sleep(5000); 
    wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, DRESS_BUTTON, 10);
	Actions act = new Actions(driver);
	act.moveToElement(dressButton).perform();
	}
	public void moveToTShirtButton () {
		handle1 = driver.getWindowHandle();
	    System.out.println(handle1);
	    Actions act = new Actions(driver);
	    act.moveToElement(summerDress).perform();
	}
	public void clickOnTShirtButton () {
		boolean dressesEveningIsDisplayed = summerDress.isDisplayed();
		if (dressesEveningIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		    summerDress.click();
		}
	    try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!handle1.equals(windowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    }catch (NoSuchWindowException e) {
	        e.printStackTrace();
	        }
	    }
	public void moveToPrintedSummerDress( ) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",printedSummerDress);
		Actions act = new Actions(driver);
	    act.moveToElement(printedSummerDress).build().perform();
	    printedSummerDress.click();
	}
	
	public void clickOnMoreButtons( ) {
		//wait.explicitWaitUntilButtonIsClickableCss(driver, MORE_BUTTON, 10);
		Actions act = new Actions(driver);
		act.moveToElement(moreButton).click().build().perform();
	}
	
	public void selectSizeButton (String sizebutton) {
		Select chooseSizeButton = new Select(driver.findElement(By.cssSelector(SIZE_BUTTON)));
		chooseSizeButton.selectByVisibleText(sizebutton);
		}
	
	public void clickOnColorButton () {
		boolean colorButtonIsDisplayed = colorButton.isDisplayed();
		if (colorButtonIsDisplayed == true) {
		System.out.println(" the login button is Displayed");
		Actions actions = new Actions(driver);
	    actions.doubleClick(colorButton).perform();
		//colorButton.click();	
		}
	}
	public void clickOnYellowColorButton () {
		boolean colorButtonIsDisplayed = colorYellowButton.isDisplayed();
		if (colorButtonIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		Actions actions = new Actions(driver);
	    actions.doubleClick(colorYellowButton).perform();
		//colorYellowButton.click();
		}
	}
	public void clickOnIncreaseButton () {
		wait.explicitWaitUntilButtonIsClickableCss(driver, INCREASE_BUTTON, 10);
		boolean increaseButtonIsEnable = increaseButton.isDisplayed();
		if (increaseButtonIsEnable == true) {
			System.out.println(" the login button is Displayed");
		    increaseButton.click();
	}
	}
	public String getPriceDressMsg() {
		
		return priceDress.getText();
	}
	public void clickOnAddToCartButton () {
		wait.explicitWaitUntilButtonIsClickableCss(driver, ADD_TO_CART, 10);
		boolean addToCartIsDisplayed = addToCart.isDisplayed();
		if (addToCartIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
		    addToCart.click();	
	}
	}
	public void clickOnPorceedButton () {
		wait.explicitWaitUntilButtonIsClickableCss(driver, PORCEED_BUTTON, 10);
		 String handle2 = driver.getWindowHandle();
		 boolean porceedButtonIsDisplayed = porceedButton.isDisplayed();
			if (porceedButtonIsDisplayed == true) {
				System.out.println(" the login button is Displayed");
		        porceedButton.click();
			}
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
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, DECREASE_BUTTON, 10);
		boolean decreaseButtonIsEnable = decreaseButton.isEnabled();
		if (decreaseButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    decreaseButton.click();	
	}
	}
	public String getTotalPriceDressMsg(){
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, TOTAL_PRICE_DRESS, 10);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",priceTotalDress);
		return priceTotalDress.getText();
	}
	public void clickOnProceedToCheckOutButton () {
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, PROCEED_TO_CHECKOUT, 10);
		boolean proceedToCheckoutButtonIsEnable = proceedToCheckoutButton.isEnabled();
		if (proceedToCheckoutButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    proceedToCheckoutButton.click();	
	}
	}
	
	public void fillAdressMailInformation (String email) {
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, Email_INFORMATION, 10);
		EmailInformation.sendKeys(email);
	}
	public void fillPassWordInformation (String password) {
		passWordInformation.sendKeys(password);
	}
	public void clickOnSingnInButton () {
		boolean signInButtonIsEnable = signInButton.isEnabled();
		if (signInButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    signInButton.click();	
	}
	}
	public void clickOnproceedCheckoutButton () {
		boolean proceedCheckoutIsEnable = proceedCheckout.isEnabled();
		if (proceedCheckoutIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    proceedCheckout.click();	
	}
	}
	public String getPriceDeliveryMsg()  {
		return priceDelivery.getText();
	}
	public void clickOnAgreeDelivrery () { 
		boolean selectagreeDelivery = agreeDelivery.isSelected();
	    if (selectagreeDelivery == false) {
	    	agreeDelivery.click();
	}
	}
	public void clickOnproceedCheckoutedButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",proceedCheckouted);
		boolean selectproceedCheckouted = proceedCheckouted.isEnabled();
	    if (selectproceedCheckouted ==true) {
	    	System.out.println(" the login button is Enabled");
	    	proceedCheckouted.click();
	    }
	    }
	public void clickOnPayByBankButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",payByBank);
		boolean selectpayByBank = payByBank.isEnabled();
	    if (selectpayByBank == true) {
	    	System.out.println(" the login button is Enabled");
		    payByBank.click();	
	    }
	    }
	public void clickOnIConfirMyOrderButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",iConfirmMyOrderButton);
		boolean selectiConfirmMyOrderButton = iConfirmMyOrderButton.isEnabled();
	    if (selectiConfirmMyOrderButton == true) {
	    	System.out.println(" the login button is Enabled");
		    iConfirmMyOrderButton.click();	
	    }
	    }
	public String getConfirmOrderMsg() {
		return ConfirmOrderMessage.getText();
	}

}
