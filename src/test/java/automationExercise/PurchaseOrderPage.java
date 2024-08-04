package automationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utiles.Setup;
import utiles.WaitMethods;

public class PurchaseOrderPage {

	/* Locators */
	
	final static String  SIGNUP_LOGIN = "Signup / Log";
	final static String  EMAIL_ADRESS = "[data-qa=\"login-email\"]";
	final static String  PASS_WORD = "[data-qa=\"login-password\"]" ;
	final static String  LOGGED_BUTTON = "[data-qa=\"login-button\"]";
	final static String  LOGIN_MSG= "Logged in";
	final static String  CART_BUTTON = "Cart" ;
	final static String  PORCEED_TO_CHECKOUT = "Proceed To Checko";
	
    final static String ADRESS_MESSAGE= "address_delivery";
    final static String REVIEW_ORDER= "heading";
    final static String MESSAGE_AREA= "textarea";
    final static String PLACE_ORDER= "Place Order";
	
    final static String NAME__ON_CARD = "[data-qa=\"name-on-card\"]";
    final static String NUMBER_CARD = "[data-qa=\"card-number\"]";
    final static String NUMBER_CVC = "[data-qa=\"cvc\"]";
    final static String EXPIRATION_MONTH = "[data-qa=\"expiry-month\"]";
    final static String EXPIRATION_YEAR = "[data-qa=\"expiry-year\"]";
    final static String PAY_BUTTON = "submit";
    final static String CONFIRMED_ORDER_MESSAGE = "section:nth-child(2) div.container div.row div.col-sm-9.col-sm-offset-1 > p:nth-child(2)";
    final static String DOWNLOUED__INVOICE = "Download Invoice";
    final static String CONTINUE_PAY__BUTTON = "[data-qa=\"continue-button\"]";
    
	final static String  SIGNUP_LOGIN_LOGIN = "Signup / Log";
	final static String  NAME = "[data-qa=\"signup-name\"]";
	final static String  EMAIL_ADRESS_ADRESS = "[data-qa=\"signup-email\"]";
    final static String  SUBMIT_BUTTON  = "[data-qa=\"signup-button\"]" ;
    final static String  ACCOUNT_INFORMATION = "b" ;
    final static String  TITLE = "id_gender1";
    final static String  NAME_INFORMATION = "name" ;
    final static String  EMAAIL_INFORMATION ="[data-qa=\"email\"]" ;
    final static String  PASSWORD_INFORMATION ="password" ;
    final static String  DAY_BIRTH  ="#days" ;
    final static String  MONTH_BIRTH ="#months" ;
    final static String  YEAR_BIRTH ="#years";
    final static String  NEWS_LETTERS  ="newsletter";
    final static String  NEWS_LETTERS_MESSAGE ="div.container div.row div.col-sm-4.col-sm-offset-1 div.login-form form:nth-child(2) div.checkbox:nth-child(7) > label:nth-child(2)" ;
    final static String  SPECIAL_OFFER  ="optin";
    final static String  SPECIAL_OFFER_MESSAGE ="div.container div.row div.col-sm-4.col-sm-offset-1 div.login-form form:nth-child(2) div.checkbox:nth-child(8) > label:nth-child(2)";
    final static String  FIRST_NAME  ="[data-qa=\"first_name\"]";
    final static String  LAST_NAME = "[data-qa=\"last_name\"]";
    final static String CAMPANY_NAME ="[data-qa=\"company\"]";
    final static String CURRENT_ADRESS ="[data-qa=\"address\"]";
    final static String SECOND_ADRESS = "[data-qa=\"address2\"]";
    final static String COUNTRY ="#country";
    final static String STATE ="[data-qa=\"state\"]";
    final static String CITY = "[data-qa=\"city\"]";
    final static String ZIP_CODE ="[data-qa=\"zipcode\"]";
    final static String NUMBER ="[data-qa=\"mobile_number\"]";
    final static String CREATE_ACCOUNT ="[data-qa=\"create-account\"]";
    final static String ACCOUNT_CREATED_MESSAGE ="[data-qa=\"account-created\"]";
    final static String CONTINUE_BUTTON ="[data-qa=\"continue-button\"]";
    final static String LOGIN_MESSAGE= "Logged in";
    
    final static String DELETE_BUTTON= "Delete Accou";
    final static String DELETE_MESSAGE= "[data-qa=\"account-deleted\"]";
    final static String CONTINUE__DELETE_BUTTON= "Contin";
    
    /* @FindBy */
    @FindBy (how=How.PARTIAL_LINK_TEXT, using = SIGNUP_LOGIN) 
	public static WebElement signupTheLoginClick ; 
	@FindBy (how= How.CSS, using = EMAIL_ADRESS) 
	public static WebElement emailAdress ;
	@FindBy (how= How.CSS, using = PASS_WORD)
	public static WebElement passWord ;
	@FindBy (how = How.CSS , using = LOGGED_BUTTON)
	public static WebElement loginButton ;
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = LOGIN_MSG)
	public static WebElement loginMsg ;
	@FindBy (how=How.PARTIAL_LINK_TEXT, using = CART_BUTTON)
	public static WebElement cartButton ;
	@FindBy (how = How.PARTIAL_LINK_TEXT, using = PORCEED_TO_CHECKOUT)
   	public static WebElement porceedToCheckout ;
	
	@FindBy (how = How.ID , using = ADRESS_MESSAGE)
	public static WebElement adressMessage ;
	@FindBy (how = How.CLASS_NAME, using = REVIEW_ORDER)
	public static WebElement reviewYourOrder ;
	@FindBy (how = How.TAG_NAME, using = MESSAGE_AREA)
	public static WebElement messageAREA ;
	@FindBy (how = How.LINK_TEXT, using = PLACE_ORDER)
	public static WebElement placeOrder ;
	
	@FindBy (how= How.CSS, using = NAME__ON_CARD)
	public static WebElement nameOnCard ;
	@FindBy (how= How.CSS, using = NUMBER_CARD)
	public static WebElement numberCard ;
	@FindBy (how= How.CSS, using = NUMBER_CVC)
	public static WebElement numberCVC ;
	@FindBy (how= How.CSS, using = EXPIRATION_MONTH)
	public static WebElement expirationMonth ;
	@FindBy (how= How.CSS, using = EXPIRATION_YEAR)
	public static WebElement expirationYear ;
	@FindBy (how= How.ID, using = PAY_BUTTON)
	public static WebElement payButton ;
	@FindBy (how= How.CSS, using = CONFIRMED_ORDER_MESSAGE)
	public static WebElement confirmedOrderMessage ;
	@FindBy (how= How.LINK_TEXT, using = DOWNLOUED__INVOICE)
	public static WebElement downlouedInvoce ;
	@FindBy (how= How.CSS, using = CONTINUE_PAY__BUTTON)
	public static WebElement continuePayButton ;
	
	@FindBy (how=How.PARTIAL_LINK_TEXT, using = SIGNUP_LOGIN_LOGIN) 
	public static WebElement signupLoginClick ; 
	@FindBy (how= How.CSS, using = NAME)
	public static WebElement firstName ;
	@FindBy (how = How.CSS, using = EMAIL_ADRESS_ADRESS)
	public static WebElement adressEmail ;
	@FindBy (how= How.CSS, using =  SUBMIT_BUTTON)
	public static WebElement submitButton ;
	@FindBy (how = How.TAG_NAME, using = ACCOUNT_INFORMATION)
	public static WebElement enterAccountInformation ;
	@FindBy (how = How.ID, using = TITLE)
	public static WebElement chooseTile ;
	@FindBy (how = How.ID, using = NAME_INFORMATION)
	public static WebElement nameInformation ;
	@FindBy (how = How.CSS, using = EMAAIL_INFORMATION)
	public static WebElement emailInformation ;
	@FindBy (how = How.ID, using = PASSWORD_INFORMATION)
	public static WebElement passWordInformation ;
	@FindBy (how = How.CSS, using = DAY_BIRTH)
	public static WebElement chooseDayBirth ;
	@FindBy (how = How.CSS, using = MONTH_BIRTH)
	public static WebElement chooseMonthBirth ;
	@FindBy (how = How.CSS, using = YEAR_BIRTH)
	public static WebElement chooseyearBirth ;
	@FindBy (how = How.ID, using = NEWS_LETTERS)
	public static WebElement selectNexsLetters ;
	@FindBy (how = How.CSS, using = NEWS_LETTERS_MESSAGE)
	public static WebElement newLetterMessage ;
	@FindBy (how = How.CSS, using = SPECIAL_OFFER_MESSAGE)
	public static WebElement specialOfferMessage ;
	@FindBy (how = How.ID, using = SPECIAL_OFFER)
	public static WebElement selectSpecialOffer ;
	@FindBy (how= How.CSS, using = FIRST_NAME)
	public static WebElement firstNameInformation ;
	@FindBy (how = How.CSS, using = LAST_NAME)
	public static WebElement lastNameInformation ;
	@FindBy (how= How.CSS, using =  CAMPANY_NAME)
	public static WebElement campagnyName ;
	@FindBy (how= How.CSS, using = CURRENT_ADRESS)
	public static WebElement currentAdresses ;
	@FindBy (how= How.CSS, using = SECOND_ADRESS)
	public static WebElement secondAdress ;
	@FindBy (how= How.CSS, using = COUNTRY)
	public static WebElement countryInformation ;
	@FindBy (how = How.CSS, using = STATE)
	public static WebElement stateInformation ;
	@FindBy (how = How.CSS, using = CITY)
	public static WebElement cityInformation ;
	@FindBy (how= How.CSS, using = ZIP_CODE)
	public static WebElement zipCodeS ;
	@FindBy (how= How.CSS, using = NUMBER)
	public static WebElement telephoneNumber ;
	@FindBy (how= How.CSS, using = CREATE_ACCOUNT)
	public static WebElement createAccountButton ;
	@FindBy (how= How.CSS, using = ACCOUNT_CREATED_MESSAGE)
	public static WebElement accountCreatedMessage ;
	@FindBy (how= How.CSS, using = CONTINUE_BUTTON)
	public static WebElement continueButton ;
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = LOGIN_MESSAGE)
	public static WebElement loginMessage ;
	
	
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = DELETE_BUTTON)
	public static WebElement deleteButton ;
	@FindBy (how= How.CSS, using = DELETE_MESSAGE)
	public static WebElement deleteMessage ;
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = CONTINUE__DELETE_BUTTON)
	public static WebElement continuedeleteButton ;

	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
    
    public void clickSignupLogin () throws InterruptedException {
    Thread.sleep(5000);  
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
    signupTheLoginClick.click(); 
    	} 
    public void fillTheEmail (String email) {
    emailAdress.sendKeys(email); 
    } 
    public void fillThePassWord (String password) {
    passWord.sendKeys(password); 
    } 
    public void ClickOnTheloginButtonClick () {
    loginButton.click();  
    } 
    public String getLoginMsg( String msg ) {
    return loginMsg.getText();
    }
	public void clickOnTheCartButton() {
	cartButton.click();
	}
	public void clickOnTheProceedToCheckOut() {
		porceedToCheckout.click();
	}
	
	    public void clickOnTheSignupLogin () throws InterruptedException {
		Thread.sleep(5000); 
	    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
		signupLoginClick.click(); 
		
		}
	    public void fillTheName (String named) {
		firstName.sendKeys(named);
		} 
		
		public void fillTheAdressMail(String emailed) {
			adressEmail.sendKeys(emailed);
		}
		public void submitTheButtonClick () {
			submitButton.click();	
		}
		public String getTheEnterAccountInformationMsg( String infos ) {
			return enterAccountInformation.getText();
		}
		public void clickOnTheTitle () { 
			boolean sel = chooseTile.isSelected();
		    if (sel == false) {
				chooseTile.click();
		}
		}
		public void fillTheFirstName (String Name) {
			nameInformation.sendKeys(Name);
		}
		//public void fillTheAdressEmailInformation (String Email) {
			//nameInformation.sendKeys(Email);
		
		public void fillThePassWordInformation (String Password) {
			passWordInformation.sendKeys(Password);
		}
		public void selectDayOfBirth (String DayofBirth) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",chooseDayBirth);
		Select chooseDayBirth = new Select(driver.findElement(By.cssSelector(DAY_BIRTH)));
		chooseDayBirth.selectByVisibleText(DayofBirth);
		}
	    public void selectTheMonthOfBirth (String MonthofBirth) {
		   Select chooseMonthBirth = new Select(driver.findElement(By.cssSelector(MONTH_BIRTH)));
		   chooseMonthBirth.selectByVisibleText(MonthofBirth);	 	
	    }
	    public void selectTheYearOfBirth (String YearofBirth) {
		    Select chooseyearBirth = new Select(driver.findElement(By.cssSelector(YEAR_BIRTH)));
		    chooseyearBirth.selectByVisibleText(YearofBirth);
	    }
	    public void clickOnTheNewsLetters () {
			boolean selectNewsLetters = selectNexsLetters.isSelected();
		    if (selectNewsLetters == false) {
		    	selectNexsLetters.click();
		}
		}
		public void clickOnTheSPcialOffer () { 
			boolean selectSpecialOffers = selectSpecialOffer.isSelected();
		    if (selectSpecialOffers == false) {
		    	selectSpecialOffer.click();
		}
		}
		public String getTheNewsLettersMsg( String newlettersmsg ) {
			return newLetterMessage.getText();
		}
		public String getSpecialOfferMsg( String specialoffermsg ) {
				return specialOfferMessage.getText();
		}
		public void fillTheFirstNameInformation (String firstNameInfo) {
			firstNameInformation.sendKeys(firstNameInfo);
		}
		public void fillTheLastNameInformation (String lastNameinfo) {
			lastNameInformation.sendKeys(lastNameinfo);
		}
		public void fillTheCompanyNameInformation (String companyName) {
			campagnyName.sendKeys(companyName);
		}
		public void fillTheCurrentAddressInformation(String currentAdress) {
			currentAdresses.sendKeys(currentAdress);
		}
		public void fillTheSecondAddressInformation (String secondAddress) {
			secondAdress.sendKeys(secondAddress);
		}
		public void selectTheCountry (String Coutry) {
		Select countryInformation = new Select(driver.findElement(By.cssSelector(COUNTRY)));
		countryInformation.selectByVisibleText(Coutry);
		}
		public void fillTheStateInformation (String state) {
			stateInformation.sendKeys(state);
		}
		public void fillTheCityInformation (String city) {
			cityInformation.sendKeys(city);
		}
		public void fillTheZipCodeInformation (String zipCode) {
			zipCodeS.sendKeys(zipCode);
		}
		public void fillTheTelephoneNumberInformation (String phoneNumber) {
			telephoneNumber.sendKeys(phoneNumber);
		}
		public void clickTheONAccountButton () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",createAccountButton);
		createAccountButton.click();
		}
		public String getTheAccountCreatedMsg( String accountcreatedmessage ) {
			return accountCreatedMessage.getText();
		}
		public void clickOnTheContinueButton () {
			continueButton.click();	
		}
		public String getTheLoginMessage( String loginmessage ) {
			return loginMessage.getText();
		}
		public String getTheAdressMessage( String adressmessage ) {
			return adressMessage.getText(); 
		}
		public String getReviewYourOrderMessage(String reviewordermessage) {
			return reviewYourOrder.getText();
		}
		public void sendAreaMessage (String areamessage) {
			messageAREA.sendKeys(areamessage);
		}
		public void clickOnThePlaceOderButton () {
			placeOrder.click();
		}
		public void fillNameOnCard (String nameoncard) {
			nameOnCard.sendKeys(nameoncard);
		}
		public void fillNumberOnCard (String numberoncard) {
			numberCard.sendKeys(numberoncard);
		}
		public void fillNumberCVCOnCard (String numbercvc) {
			numberCVC.sendKeys(numbercvc);
		}
		public void fillExpirationMonthOnCard (String expirationmonth) {
			expirationMonth.sendKeys(expirationmonth);
		}
		public void fillExpirationYearOnCard (String expirationyear) {
			expirationYear.sendKeys(expirationyear);
			}
		public void clickOnPayAndConfirmButton () {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView();",payButton);
			payButton.click();
			}
		public String getTheConfirmedOrderMessage( String confirmedordermessage ) {
			return confirmedOrderMessage.getText();
		}
		public void clickOnDownlouedButton () {
			downlouedInvoce.click();
			}
		public void clickOnContinuePayButton () {
			continuePayButton.click();
		}
		public void clickOnTheDeleteButton () {
			deleteButton.click();
		}
		public String getThedeleteMessage( String deletemessage ) {
			return deleteMessage.getText();
		}
		public void clickOnTheContinueDeleteButton () {
			continuedeleteButton.click();
		}
}
