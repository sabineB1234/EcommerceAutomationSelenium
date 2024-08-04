package automationExercise;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class AddReviewOnProductPage {
	
	
	/* Locators */
	final static String  PRODUCT_BUTTON = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(2) > a:nth-child(1)";
	final static String  PRODUCT_DRESS = "div.container div.row div.col-sm-9.padding-right div.features_items div.col-sm-4:nth-child(3) div.product-image-wrapper div.choose ul.nav.nav-pills.nav-justified li:nth-child(1) > a:nth-child(1)";
	final static String  WRITE_REVIEW = "div.container div.row div.col-sm-9.padding-right div.category-tab.shop-details-tab div.col-sm-12 ul.nav.nav-tabs li.active > a:nth-child(1)" ;
	final static String  YOUR_NAME = "#name";
	final static String  ADRESS_MAIL= "#email";
	final static String  REVIEW_MESSAGE= "#review";
	final static String  SUBMIT_BUTTON= "#button-review";
	
	
	/* @FindBy */
	@FindBy (how=How.CSS, using = PRODUCT_BUTTON) 
	public static WebElement productButton ; 
	@FindBy (how= How.CSS, using = PRODUCT_DRESS) 
	public static WebElement productDress ;
	@FindBy (how= How.CSS, using = WRITE_REVIEW)
	public static WebElement writeReview ;
	@FindBy (how = How.CSS , using = YOUR_NAME)
	public static WebElement yourName ;
	@FindBy (how = How.CSS , using = ADRESS_MAIL)
	public static WebElement adressMail ;
	@FindBy (how = How.CSS , using = REVIEW_MESSAGE)
	public static WebElement reviwMessage ;
	@FindBy (how = How.CSS , using = SUBMIT_BUTTON)
	public static WebElement submitButton ;
	

	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
    public void clickOnProductButton () {
    productButton.click();  
    }
    public void clickONproductDress() {
    JavascriptExecutor js =((JavascriptExecutor)driver);
    js.executeScript("arguments[0].scrollIntoView()",productDress );
    String handle = driver.getWindowHandle();
    System.out.println(handle);
	productDress.click();
	try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!handle.equals(windowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
    }
    public String getWriteProductMessage() {
	return writeReview.getText();
    }
    public void sendYourName(String yourname) {
    yourName.sendKeys(yourname);
    }
    public void sendAdressMail(String mail) {
    adressMail.sendKeys(mail);
    }
    public void sendReviewMessage(String reviewmessage) {
    reviwMessage.sendKeys(reviewmessage);
    }
    public void clickOnSubmitButton() {
    	boolean displayedSubmitbutton = submitButton.isEnabled();
	    if (displayedSubmitbutton == true) {
	    	 System.out.println(" the button is enabled ");
	    }
         submitButton.click();
	    }
    }
    //public String Msg( String printeddressinfo ) {
		//return printedDress.getText();

