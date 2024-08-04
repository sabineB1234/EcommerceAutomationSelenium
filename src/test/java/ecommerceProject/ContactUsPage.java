package ecommerceProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utiles.Setup;
import utiles.WaitMethods;

public class ContactUsPage {

	/* Locators */
	final static String  CONTUCTUS_BUTTON = "Contact us";
	final static String  CUSTOMER_SERVICE_MESSAGE = "//h1[contains(text(),'Customer service - Contact us')]";
	final static String  SEND_A_MESSAGE = "//h3[contains(text(),'send a message')]";
	final static String  SUBJECT_HEALDING_SELECT  = "#id_contact" ;
	final static String  ADRESS_EMAIL_TITLE  = "body.contact.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.contact-form-box fieldset:nth-child(1) div.clearfix div.col-xs-12.col-md-3:nth-child(1) p.form-group:nth-child(5) > label:nth-child(1)";
	
	final static String ADRESS_MAIL = "#email";
    final static String  ORDER_REFERANCE = "//label[contains(text(),'Order reference')]";
    final static String  ORDER_REFERANCE_MESSAGE  = "#id_order";
    final static String  CHOOSE_FILE ="#fileUpload";
    
    final static String  CUSTOMER_SERVICE_SEND  ="textarea" ;
    final static String  SEND_BUTTON ="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]" ;
    final static String  SUCCES_MESSAGE ="//p[contains(text(),'Your message has been successfully sent to our tea')]";
    final static String  HOME_BUTTON ="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]";
    
    
    
    
    final static String  NEWS_LETTERS_MESSAGE ="body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form.std.box div.account_creation div.checkbox:nth-child(8) > label:nth-child(2)" ;
    final static String REGISTER_BUTTON = "submitAccount";
    final static String ERRORS_MESSAGE = "//p[contains(text(),'There are 3 errors')]";
    
    /* @FindBy */
    
    @FindBy (how=How.LINK_TEXT, using = CONTUCTUS_BUTTON) 
	public static WebElement contuctUsbutton ; 
	@FindBy (how= How.XPATH, using = CUSTOMER_SERVICE_MESSAGE)
	public static WebElement customerServiceMessage ;
	@FindBy (how = How.XPATH, using = SEND_A_MESSAGE)
	public static WebElement sendAMessage ;
	@FindBy (how= How.CSS, using =  SUBJECT_HEALDING_SELECT)
	public static WebElement subjectHealdingSelect ;
	@FindBy (how= How.CSS, using =  ADRESS_EMAIL_TITLE)
	public static WebElement adressEmailTitle ;
	@FindBy (how = How.CSS, using = ADRESS_MAIL)
	public static WebElement adressEmail ;
	@FindBy (how = How.XPATH, using = ORDER_REFERANCE)
	public static WebElement orderReferanceTitle ;
	@FindBy (how = How.CSS, using = ORDER_REFERANCE_MESSAGE)
	public static WebElement orderReferanceMessage ;
	@FindBy (how = How.CSS, using = CHOOSE_FILE)
	public static WebElement chooseFile ;
	@FindBy (how = How.CSS, using = CUSTOMER_SERVICE_SEND)
	public static WebElement customerServiceSend ;
	@FindBy (how = How.XPATH, using = SEND_BUTTON)
	public static WebElement sendButton ;
	@FindBy (how = How.XPATH, using = SUCCES_MESSAGE)
	public static WebElement successMessage ;
	@FindBy (how = How.XPATH, using = HOME_BUTTON)
	public static WebElement homeButton ;
	
	
	
	@FindBy (how = How.CSS, using = NEWS_LETTERS_MESSAGE)
	public static WebElement newLetterMessage ;
	@FindBy (how= How.ID, using = REGISTER_BUTTON)
	public static WebElement registerButton ;
	@FindBy (how= How.XPATH, using = ERRORS_MESSAGE)
	public static WebElement errorsMessage ;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
    Actions actions = new Actions(driver);
	
	/* Methods */ 
	public void clickOnContactUsButton () throws InterruptedException , IOException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	boolean signupLoginButtonClickIsEnabled = contuctUsbutton.isEnabled();
	if (signupLoginButtonClickIsEnabled == true) {
		System.out.println(" the login button is Enabled");
		contuctUsbutton.click();
	}
	} 
	public String getCustomerServiceMessage( ) {
		return customerServiceMessage.getText();
	}
	
	public String getSendMessage( ) {
		return sendAMessage.getText();
	}
	public void selectSubjectHealding(String subjecthealding) {
	wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, SUBJECT_HEALDING_SELECT , 10);
	  Select subjectHealdingselect = new Select(driver.findElement(By.cssSelector(SUBJECT_HEALDING_SELECT)));
	  subjectHealdingselect.selectByVisibleText(subjecthealding);
	//subjectHealdingSelect.sendKeys(subjecthealding);
	}
	public String getAdressEmailTitle( ) {
		return adressEmailTitle.getText();
	}
	
	public void fillTheAdressMail(String email) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",adressEmail);
		adressEmail.sendKeys(email);
	}
	public String getOrderReferanceTitle() {
		return orderReferanceTitle.getText();
	}
	
	public void fillOrderRferanceMessage(String orderreferancemsg) {
		orderReferanceMessage.sendKeys(orderreferancemsg);
	}
	
	public void chooseFile(String choosefile) {
		chooseFile.sendKeys(choosefile);
	}
	
	public void fillCustomerServiceSend(String customerservicesend) {
		customerServiceSend.sendKeys(customerservicesend);
	}
	
	public void clickOnSendButton ()  {
		boolean signupLoginButtonClickIsEnabled = sendButton.isEnabled();
		if (signupLoginButtonClickIsEnabled == true) {
			System.out.println(" the login button is Enabled");
			sendButton.click();
		}
		} 
	public String getSuccesSendMessage() {
		return successMessage.getText();
	}
	public void clickOnHomeButton ()  {
	    wait.explicitWaitUntilButtonIsClickableXpath(driver, HOME_BUTTON, 10);
		boolean homeButtonClickIsEnabled = homeButton.isEnabled();
		if (homeButtonClickIsEnabled == true) {
			System.out.println(" the login button is Enabled");
			homeButton.click();
		}
		} 
	
}


