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


public class RegisterUser {

	
	/* Locators */
	final static String  SIGNUP_LOGIN = "Signup / Log";
	final static String  NAME = "[data-qa=\"signup-name\"]";
	final static String  EMAIL_ADRESS = "[data-qa=\"signup-email\"]";
    final static String  SUBMIT_BUTTON  = "[data-qa=\"signup-button\"]" ;
    final static String  ACCOUNT_INFORMATION = "b" ;
    final static String  TITLE = "id_gender1";
    final static String  NAME_INFORMATION = "name" ;
    final static String  EMAAIL_INFORMATION ="[data-qa=\"email\"]" ;
    final static String  PASSWORD_INFORMATION ="[data-qa=\"password\"]" ;
    final static String  DAY_BIRTH  ="[data-qa=\"days\"]" ;
    final static String  MONTH_BIRTH ="[data-qa=\"months\"]" ;
    final static String  YEAR_BIRTH ="[data-qa=\"password\"]";
    final static String  NEWS_LETTERS  ="newsletter";
    final static String  NEWS_LETTERS_MESSAGE ="div.container div.row div.col-sm-4.col-sm-offset-1 div.login-form form:nth-child(2) div.checkbox:nth-child(7) > label:nth-child(2)" ;
    final static String  SPECIAL_OFFER  ="optin";
    final static String  SPECIAL_OFFER_MESSAGE ="div.container div.row div.col-sm-4.col-sm-offset-1 div.login-form form:nth-child(2) div.checkbox:nth-child(8) > label:nth-child(2)";
    final static String  FIRST_NAME  ="[data-qa=\"first_name\"]";
    final static String  LAST_NAME = "[data-qa=\"last_name\"]";
    final static String CAMPANY_NAME ="[data-qa=\"company\"]";
    final static String CURRENT_ADRESS ="[data-qa=\"address\"]";
    final static String SECOND_ADRESS = "[data-qa=\"address2\"]";
    final static String COUNTRY ="[data-qa=\"country\"]";
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
	public static WebElement signupLoginClick ; 
	@FindBy (how= How.CSS, using = NAME)
	public static WebElement firstName ;
	@FindBy (how = How.CSS, using = EMAIL_ADRESS)
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
	@FindBy (how = How.CSS, using = PASSWORD_INFORMATION)
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
	public static WebElement currentAdress ;
	@FindBy (how= How.CSS, using = SECOND_ADRESS)
	public static WebElement secondAdress ;
	@FindBy (how= How.CSS, using = COUNTRY)
	public static WebElement countryInformation ;
	@FindBy (how = How.CSS, using = STATE)
	public static WebElement stateInformation ;
	@FindBy (how = How.CSS, using = CITY)
	public static WebElement cityInformation ;
	@FindBy (how= How.CSS, using = ZIP_CODE)
	public static WebElement zipCode ;
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
	signupLoginClick.click(); 
	}
	public void fillTheFirstName (String name) {
	firstName.sendKeys(name);
	}
	public void fillThAdressEmailInformation (String email) {
	adressEmail.sendKeys(email);
	}
	public void submitButtonClick () {
		boolean selectsubmitButton = submitButton.isDisplayed();
	    if (selectsubmitButton == true) { 
		submitButton.click();
	    }
	} 
	public String getEnterAccountInformationMsg( String info ) {
		return enterAccountInformation.getText();
	}
	public void clickOnTitle () { 
		boolean sel = chooseTile.isSelected();
	    if (sel == false) {
			chooseTile.click();
	}
	}
	public void fillFirstName (String firstname) {
		nameInformation.sendKeys(firstname);
	}
	public void fillAdressEmailInformation (String adressmail) {
		nameInformation.sendKeys(adressmail);
	}
	public void fillPassWordInformation (String password) {
		passWordInformation.sendKeys(password);
	}
	public void selectDayBirth (String optionTextday) {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();",chooseDayBirth);
	Select chooseDayBirth = new Select(driver.findElement(By.cssSelector(DAY_BIRTH)));
	chooseDayBirth.selectByVisibleText(optionTextday);
	}
    public void selectMonthBirth (String optionTextmonth) {
	   Select chooseMonthBirth = new Select(driver.findElement(By.cssSelector(MONTH_BIRTH)));
	   chooseMonthBirth.selectByVisibleText(optionTextmonth);	 	
    }
    //public void selectYearBirth (String 20) {
	   //Select chooseYearBirth = new Select(driver.findElement(By.cssSelector(YEAR_BIRTH)));
	   //chooseYearBirth.selectByVisibleText(20);
    
	public void clickOnNewsLetters () { 
		boolean selectNewsLetters = selectNexsLetters.isSelected();
	    if (selectNewsLetters == false) {
	    	selectNexsLetters.click();
	}
	}
	public void clickOnSPcialOffer () { 
		boolean selectSpecialOffers = selectSpecialOffer.isSelected();
	    if (selectSpecialOffers == true) {
	    	selectSpecialOffer.click();
	}
	}
	public String getNewsLettersMsg( String newlettersmsg ) {
		return newLetterMessage.getText();
	}
	public String getSpecialOfferMsg( String specialoffermsg ) {
			return specialOfferMessage.getText();
	}
	public void fillFirstNameInformation (String firstnameinfo) {
		firstNameInformation.sendKeys(firstnameinfo);
	}
	public void fillLastNameInformation (String lastnameinfo) {
		lastNameInformation.sendKeys(lastnameinfo);
	}	
	public void fillCompagnyNameInformation (String compagnyname) {
		campagnyName.sendKeys(compagnyname);
	}
	public void fillCurrentAdressInformation (String currentadress) {
		currentAdress.sendKeys(currentadress);
	}
	public void fillSecondAdressInformation (String secondadress) {
		secondAdress.sendKeys(secondadress);
	}
	public void selectCountry (String optionTextcountry) {
	Select countryInformation = new Select(driver.findElement(By.cssSelector(COUNTRY)));
	countryInformation.selectByVisibleText(optionTextcountry);
	}
	public void fillStateInformation (String state) {
		stateInformation.sendKeys(state);
	}
	public void fillCittyInformation (String city) {
		cityInformation.sendKeys(city);
	}
	public void fillZipCodeInformation (String zipcode) {
		zipCode.sendKeys(zipcode);
	}
	public void filltelephoneNumberInformation (String number) {
		telephoneNumber.sendKeys(number);
	}
	public void clickONAccountButton () {
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();",createAccountButton);
	createAccountButton.click();
	}
	public String getAccountCreatedMsg( String accountcreatedmessage ) {
		return accountCreatedMessage.getText();
	}
	public void clickOnContinueButton () {
		Boolean continueButtonIsEnabled = continueButton.isDisplayed();
		if (continueButtonIsEnabled == true ) {
			continueButton.click();	
		}
	}
	public String getLoginMessage( String loginmessage ) {
		return loginMessage.getText();
	}
	public void clickOnDeleteButton () {
		boolean selectdeleteButton = deleteButton.isDisplayed();
	    if (selectdeleteButton == true) { 
	    System.out.println("the delete login button is Displayed");
	    deleteButton.click();
	    }
	}
	public String getdeleteMessage( String deletemessage ) {
		return deleteMessage.getText();
	}
	public void clickOnContinueDeleteButton () {
		boolean selectcontinuedeleteButton = continuedeleteButton.isEnabled();
	    if (selectcontinuedeleteButton == true) { 
	    	System.out.println("the delete continue button is Enabled ");
	    	continuedeleteButton.click();
	    }
	    }
	
}

