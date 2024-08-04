package ecommerceProject;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class RegisterUserProjectpage {
 
	/* Locators */
	final static String  SIGNUP_LOGIN = "login";
	final static String  CREATE_AN_ACCOUNT = "page-subheading";
	final static String  EMAIL_ADRESS = "[data-validate=\"isEmail\"]";
	final static String  CREATE_ACCOUNT_BUTTON  = "SubmitCreate" ;
	final static String  YOUR_PERSONAL_INFORMATION  = "page-heading";
	
	final static String  TITLE = "#id_gender2";
    final static String  NAME_INFORMATION = "#customer_firstname";
    final static String  LAST_INFORMATION = "#customer_lastname";
    final static String  PASSWORD_INFORMATION ="#passwd";
    
    final static String  DAY_BIRTH  ="days" ;
    final static String  MONTH_BIRTH ="months" ;
    final static String  YEAR_BIRTH ="years";
    final static String  NEWS_LETTERS  ="newsletter";
    final static String  NEWS_LETTERS_MESSAGE ="body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div:nth-child(1) form.std.box div.account_creation div.checkbox:nth-child(8) > label:nth-child(2)" ;
    final static String REGISTER_BUTTON = "submitAccount";
    final static String SUCCES_MESSAGE = "body.my-account.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 > p.alert.alert-success";
    final static String ADD_MY_FIRST_ADDRESS = "icon-building";
    
    final static String  FIRST_NAME  ="firstname";
    final static String  LAST_NAME = "lastname";
    final static String CAMPANY_NAME ="company";
    final static String CURRENT_ADRESS ="address1";
    final static String SECOND_ADRESS = "address2";
    final static String COUNTRY ="id_country";
    final static String STATE ="id_state";
    final static String CITY = "[data-validate=\"isCityName\"]";
    final static String ZIP_CODE ="[data-validate=\"isPostCode\"]";
    final static String HOME_PHONE ="phone";
    final static String MOBILE_PHONE="phone_mobile";
    final static String ADDITIONAL_INFORMATION="other";
    final static String ADREES_TITLE="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[16]/label[1]";
    final static String MY_ADDRESS= "alias";
    final static String SAVE_BUTTON ="submitAddress";
    final static String NAME_ADDRESS ="address_name";
    final static String BACK_TOYOUR_ACCOUNT ="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/span[1]";
    
    final static String ACCOUNT_CREATED_MESSAGE ="[data-qa=\"account-created\"]";
    final static String CONTINUE_BUTTON ="[data-qa=\"continue-button\"]";
    final static String LOGIN_MESSAGE= "Logged in";
    final static String SIGN_OUT ="Sign out";
    
    final static String  Email_INFORMATIONS ="email";
	final static String  PASSWORD_INFORMATIONS ="passwd";
	final static String  SIGNINUP_BUTTON ="SubmitLogin";
	final static String  ERROR_MESSAGE ="body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.alert.alert-danger ol:nth-child(2) > li:nth-child(1)";
    
	 /* @FindBy */
    
	@FindBy (how=How.CLASS_NAME, using = SIGNUP_LOGIN) 
	public static WebElement signupLoginButtonClick ; 
	@FindBy (how= How.CLASS_NAME, using = CREATE_AN_ACCOUNT)
	public static WebElement createAnAccount ;
	@FindBy (how = How.CSS, using = EMAIL_ADRESS)
	public static WebElement adressEmail ;
	@FindBy (how= How.NAME, using =  CREATE_ACCOUNT_BUTTON)
	public static WebElement createAnAccountButton ;
	@FindBy (how= How.CLASS_NAME, using =  YOUR_PERSONAL_INFORMATION)
	public static WebElement yourPersonalInformation ;
	
	
	@FindBy (how = How.CSS, using = TITLE)
	public static WebElement chooseTile ;
	@FindBy (how = How.CSS, using = NAME_INFORMATION)
	public static WebElement firstNameInformation ;
	@FindBy (how = How.CSS, using = LAST_INFORMATION)
	public static WebElement lastNameInformation ;
	@FindBy (how = How.CSS, using = PASSWORD_INFORMATION)
	public static WebElement passWordInformation ;
	
	@FindBy (how = How.ID, using = DAY_BIRTH)
	public static WebElement chooseDayBirth ;
	@FindBy (how = How.ID, using = MONTH_BIRTH)
	public static WebElement chooseMonthBirth ;
	@FindBy (how = How.ID, using = YEAR_BIRTH)
	public static WebElement chooseYearBirth ;
	@FindBy (how = How.ID, using = NEWS_LETTERS)
	public static WebElement selectNexsLetters ;
	@FindBy (how = How.CSS, using = NEWS_LETTERS_MESSAGE)
	public static WebElement newLetterMessage ;
	@FindBy (how= How.ID, using = REGISTER_BUTTON)
	public static WebElement registerButton ;
	@FindBy (how= How.CSS, using = SUCCES_MESSAGE)
	public static WebElement messageSuccess ;
	
	@FindBy (how= How.CLASS_NAME, using = ADD_MY_FIRST_ADDRESS)
	public static WebElement addMyFirstAddressButton ;
	@FindBy (how= How.ID, using = FIRST_NAME)
	public static WebElement firstNameInformation2 ;
	@FindBy (how = How.ID, using = LAST_NAME)
	public static WebElement lastNameInformation2 ;
	@FindBy (how= How.ID, using =  CAMPANY_NAME)
	public static WebElement campagnyName ;
	@FindBy (how= How.ID, using = CURRENT_ADRESS)
	public static WebElement currentAdresses ;
	@FindBy (how= How.ID, using = SECOND_ADRESS)
	public static WebElement secondAdress ;
	@FindBy (how= How.ID, using = COUNTRY)
	public static WebElement countryInformation ;
	@FindBy (how = How.ID, using = STATE)
	public static WebElement stateInformation ;
	@FindBy (how = How.CSS, using = CITY)
	public static WebElement cityInformation ;
	@FindBy (how= How.CSS, using = ZIP_CODE)
	public static WebElement zipCodeS ;
	@FindBy (how= How.NAME, using = HOME_PHONE )
	public static WebElement homePhone ;
	@FindBy (how= How.NAME, using = MOBILE_PHONE )
	public static WebElement mobilePhone ;
	@FindBy (how= How.ID, using = ADDITIONAL_INFORMATION )
	public static WebElement additionalInformation ;
	@FindBy (how= How.ID, using = MY_ADDRESS )
	public static WebElement myAdress ;
	@FindBy (how= How.XPATH, using = ADREES_TITLE )
	public static WebElement addressTitle ;
	@FindBy (how= How.ID, using = SAVE_BUTTON)
	public static WebElement saveButton ;
	@FindBy (how= How.CLASS_NAME, using = NAME_ADDRESS)
	public static WebElement nameAddress ;
	@FindBy (how= How.XPATH, using = BACK_TOYOUR_ACCOUNT)
	public static WebElement backtoyourAccount ;
	@FindBy (how= How.LINK_TEXT, using = SIGN_OUT)
	public static WebElement signOut ;
	@FindBy (how= How.CSS, using = ACCOUNT_CREATED_MESSAGE)
	public static WebElement accountCreatedMessage ;
	
	@FindBy (how= How.ID, using = Email_INFORMATIONS)
	public static WebElement EmailInformations ;
	@FindBy (how= How.ID, using = PASSWORD_INFORMATIONS)
	public static WebElement passWords ;
	@FindBy (how= How.ID, using = SIGNINUP_BUTTON)
	public static WebElement signInUpButton ;
	@FindBy (how= How.CSS, using = ERROR_MESSAGE)
	public static WebElement errorMessage ;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */ 
	public void clickSignupLoginButton () throws InterruptedException , IOException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	boolean signupLoginButtonClickIsDelayed = signupLoginButtonClick.isDisplayed();
	if (signupLoginButtonClickIsDelayed == true) {
		System.out.println(" the login button is Displayed");
	}
	signupLoginButtonClick.click();
	}
	public String getCreateAccountInformationMsg() {
		return createAnAccount.getText();
	}
	public void fillTheAdressMail(String email) {
		adressEmail.sendKeys(email);
	}
	public void clickOnCreateAccountButton () {
		boolean createAnAccountButtonIsEnable = createAnAccountButton.isEnabled();
		if (createAnAccountButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		}
		createAnAccountButton.click();	
	}
	public String getPersonalInformationMsg(){
		return yourPersonalInformation.getText();
	
	}
	public void clickOnTheTitleGender ()  { 
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, TITLE, 10);
		boolean sel = chooseTile.isSelected();
	   if (sel == false) {
			chooseTile.click();
	}
	}
	public void fillTheFirstNameInformation (String firstname)  {
	    wait.explicitWaitUntilVisibilityOfButtonCss(driver, NAME_INFORMATION, 10);
		firstNameInformation.sendKeys(firstname);
	}
	public void fillTheLastNameInformation (String lastname) {
		lastNameInformation.sendKeys(lastname);
	}
	public void fillThePassWordInformation (String password) {
		passWordInformation.sendKeys(password);
	}
	public void selectDayOfBirth (String dayofbirth) {
	//wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, DAY_BIRTH, 10);	
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();",chooseDayBirth);
	//Select chooseDayBirth = new Select(driver.findElement(By.cssSelector(DAY_BIRTH)));
	//chooseDayBirth.selectByIndex(3);        //(dayofbirth);
	chooseDayBirth.sendKeys(dayofbirth);
	}
    public void selectMonthOfBirth (String monthofbirth) {
    //wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, MONTH_BIRTH, 10);
	  //Select chooseMonthBirth = new Select(driver.findElement(By.cssSelector(MONTH_BIRTH)));
	   //chooseMonthBirth.selectByValue(monthofbirth);
    	chooseMonthBirth.sendKeys(monthofbirth);
    }
    public void selectYearOfBirth (String yearofbirth) {
    //wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, YEAR_BIRTH, 10);
	 //Select chooseYearBirth = new Select(driver.findElement(By.cssSelector(YEAR_BIRTH)));
	 //chooseYearBirth.selectByValue(yearofbirth);
    	chooseYearBirth.sendKeys(yearofbirth);
	
    }
	public void clickOnNewsLetters () { 
		boolean selectNewsLetters = selectNexsLetters.isSelected();
	    if (selectNewsLetters == false) {
	    	selectNexsLetters.click();
	}      
	}
	public String getTheNewsLettersMsg() {
		return newLetterMessage.getText();
	}
	public void clickOnRegisterButton () {
		boolean registerButtonIsEnable = registerButton.isEnabled();
		if (registerButtonIsEnable == true) {
			System.out.println(" the login button is Enabled");
		}
		registerButton.click();	
	}
	public String getTheSuccessMsg() {
		return messageSuccess.getText();
	}
	public void clickOnMyFirstAddressButton () {
		addMyFirstAddressButton.click();	
	}
	public void fillFirstNameInformation (String firstNameInfo) {
		firstNameInformation.sendKeys(firstNameInfo);
	}
	public void fillLastNameInformation (String lastNameinfo) {
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
	public void selectTheCountry (String country) {
	//Select countryInformation = new Select(driver.findElement(By.cssSelector(COUNTRY)));
	//countryInformation.selectByValue(country);
		countryInformation.sendKeys(country);
	}
	public void fillTheStateInformation (String state) {
	//wait.explicitWaitUntilButtonIsClickableXpath(driver, STATE, 10);
	//Select StateInformation = new Select(driver.findElement(By.xpath(STATE)));
	//StateInformation.selectByValue(state);
		stateInformation.sendKeys(state);
	}
	public void fillTheCityInformation (String city) {
		cityInformation.sendKeys(city);
	}
	public void fillTheZipCodeInformation (String zipCode) {
		zipCodeS.sendKeys(zipCode);
	}
	public void fillTheHomePhoneInformation (String homephone) {
		homePhone.sendKeys(homephone);
	}
	public void fillTheMobilePhoneInformation (String mobilephone) {
		 mobilePhone.sendKeys(mobilephone);
	}
	public void fillAdditionalInformation (String additionalinfo) {
		additionalInformation.sendKeys(additionalinfo);
	}
	public void fillMyAddressInformation (String myaddress) {
		myAdress.sendKeys(myaddress);
	}
	public String getTheAdressTitleMsg() {
		return addressTitle.getText();
	}
	public void clickTheOnSaveButton () { 
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();",saveButton);
	boolean saveButtonIsEnable = saveButton.isEnabled();
	if (saveButtonIsEnable == true) {
		System.out.println(" the login button is Enabled");
	    saveButton.click();
	}
	}
	public String getTheNameAddressMsg( ) {
		return nameAddress.getText();
	}
	public void clickOnAddNewAddressButton () {
		backtoyourAccount.click();	
	}
	public void clickOnSignOutButton () {
		boolean signOutIsEnable = signOut.isEnabled();
		if (signOutIsEnable == true) {
			System.out.println(" the login button is Enabled");
		    signOut.click();
		}
	}
	public void fillAdressMailInformations (String emails) {
		EmailInformations.sendKeys(emails);
	}
	public void fillPassWordInformations (String passwords) {
		passWords.sendKeys(passwords);
	}
	public void clickOnSingnInUpButton () {
		boolean signInUpButtonIsDesplayed = signInUpButton.isDisplayed();
		if (signInUpButtonIsDesplayed == true) {
			System.out.println(" the login button is Displayed");
		    signInUpButton.click();
		}
	}
	public String getTheErrorMsg( ) {
		return errorMessage.getText();
	}
}
