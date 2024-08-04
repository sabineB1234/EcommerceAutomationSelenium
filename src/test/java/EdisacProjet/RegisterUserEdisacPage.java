package EdisacProjet;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class RegisterUserEdisacPage {

	
	final static String  SIGNUP_LOGIN = "account-mini";
	final static String  CREATE_AN_ACCOUNT = "titre-separation";
	final static String  EMAIL_ADRESS = "#emailreg";
	final static String  CREATE_ACCOUNT_BUTTON  = "#registerbtn" ;
	
	final static String  YOUR_PERSONAL_INFORMATION  = "form:nth-child(1) div:nth-child(1) div.registercolumn div.title0:nth-child(3) > span:nth-child(1)";
	final static String  PASSWORD_INFORMATION ="#password";
	final static String  PASSWORD_CONFIRMATION ="#confirmpassword";
	
	final static String  CATEGORY = "//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='ordercontent']/form[1]/div[1]/div[1]/div[2]/div[6]/input[1]";
	final static String  TITLE = "div:nth-child(1) div.registercolumn div.registercolumn-content.center:nth-child(4) div.radio-line.line:nth-child(8) > input:nth-child(3)";
    final static String  NAME_INFORMATION = "#firstname";
    final static String  LAST_INFORMATION = "#lastname";
    
    
    final static String  DAY_BIRTH  ="#birthday" ;
    final static String  MONTH_BIRTH ="birthmonth" ;
    final static String  YEAR_BIRTH ="birthyear";
    final static String COUNTRY ="#countrycode";
    final static String ZIP_CODE ="#zipcode";
    final static String CITY = "#city";
    final static String CURRENT_ADRESS ="#address";
    final static String SECOND_ADRESS = "#address2";
    
    final static String HOME_PHONE ="#mobile";
    final static String MOBILE_PHONE="#phone";
    
    final static String  NEWS_LETTERS  ="#newsletterEdi";
    final static String  NEWS_LETTERS_MESSAGE ="div:nth-child(1) div.registercolumn div.registercolumn-content.center:nth-child(4) div.line:nth-child(21) > label.wauto.inbl.valignSub.prs" ;
    final static String REGISTER_BUTTON = "identificationbtn";
    final static String MON_COMPTE_BUTTON ="#account-mini";
    final static String STATUT_INFORMATION="div:nth-child(4) div.line div.right.w70 div.title0.line > span:nth-child(2)";
    final static String SIGN_OUT ="//a[contains(text(),'déconnexion')]";
    final static String ERROR_MESSAGE ="#registerresponse";
    
    /* @FindBy */
    
   	@FindBy (how=How.ID, using = SIGNUP_LOGIN) 
   	public static WebElement signupLoginButtonClick ; 
   	@FindBy (how= How.CLASS_NAME, using = CREATE_AN_ACCOUNT)
   	public static WebElement createAnAccount ;
   	@FindBy (how = How.CSS, using = EMAIL_ADRESS)
   	public static WebElement adressEmail ;
   	@FindBy (how= How.CSS, using =  CREATE_ACCOUNT_BUTTON)
   	public static WebElement createAnAccountButton ;
   	
   	@FindBy (how= How.CSS, using =  YOUR_PERSONAL_INFORMATION)
   	public static WebElement yourPersonalInformation ;
   	@FindBy (how = How.CSS, using = PASSWORD_INFORMATION)
   	public static WebElement passWordInformation ;
   	@FindBy (how = How.CSS, using = PASSWORD_CONFIRMATION)
   	public static WebElement passWordConfirmation ;
   	
   	@FindBy (how = How.XPATH, using = CATEGORY)
   	public static WebElement chooseCategory ;
   	@FindBy (how = How.CSS, using = TITLE)
   	public static WebElement chooseTile ;
   	@FindBy (how = How.CSS, using = NAME_INFORMATION)
   	public static WebElement firstNameInformation ;
   	@FindBy (how = How.CSS, using = LAST_INFORMATION)
   	public static WebElement lastNameInformation ;
   	
   	@FindBy (how = How.CSS, using = DAY_BIRTH)
   	public static WebElement chooseDayBirth ;
   	@FindBy (how = How.NAME, using = MONTH_BIRTH)
   	public static WebElement chooseMonthBirth ;
   	@FindBy (how = How.NAME, using = YEAR_BIRTH)
   	public static WebElement chooseYearBirth ;
   	@FindBy (how= How.CSS, using = COUNTRY)
   	public static WebElement countryInformation ;
   	@FindBy (how= How.CSS, using = ZIP_CODE)
   	public static WebElement zipCodeS ;
   	@FindBy (how = How.CSS, using = CITY)
   	public static WebElement cityInformation ;
   	@FindBy (how= How.CSS, using = CURRENT_ADRESS)
   	public static WebElement currentAdresses ;
   	@FindBy (how= How.CSS, using = SECOND_ADRESS)
   	public static WebElement secondAdress ;
   	@FindBy (how= How.CSS, using = HOME_PHONE )
   	public static WebElement homePhone ;
   	@FindBy (how= How.CSS, using = MOBILE_PHONE )
   	public static WebElement mobilePhone ;
   	
   	@FindBy (how = How.CSS, using = NEWS_LETTERS)
   	public static WebElement selectNexsLetters ;
   	@FindBy (how = How.CSS, using = NEWS_LETTERS_MESSAGE)
   	public static WebElement newLetterMessage ;
   	
   	@FindBy (how= How.ID, using = REGISTER_BUTTON)
   	public static WebElement registerButton ;
   	@FindBy (how= How.CSS, using = MON_COMPTE_BUTTON)
   	public static WebElement monCompteButton ;
   	@FindBy (how= How.CSS, using = STATUT_INFORMATION )
   	public static WebElement statutInformation ;
   	@FindBy (how= How.XPATH, using = SIGN_OUT)
   	public static WebElement signOut ;
   	
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
	    signupLoginButtonClick.click();
	}
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
			createAnAccountButton.click();
		}	
	}
	public String getICreateMyCounteMsg() {
		return yourPersonalInformation.getText();
	}
	public void fillThePassWordInformation (String password) {
		passWordInformation.sendKeys(password);
	}
	public void fillTheConfirmationPassWordInformation (String confirmationpassword) {
		passWordConfirmation.sendKeys(confirmationpassword);
	}
	public void clickOnTheCategory ()  { 
		boolean sel = chooseCategory.isSelected();
	   if (sel == false) {
		   chooseCategory.click();
	   }
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
    public void selectCountry (String country) {
     //wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, YEAR_BIRTH, 10);
    //Select chooseYearBirth = new Select(driver.findElement(By.cssSelector(YEAR_BIRTH)));
    //chooseYearBirth.selectByValue(yearofbirth);
    	countryInformation.sendKeys(country);
    }
	
	public void fillFirstNameInformation (String firstNameInfo) {
		firstNameInformation.sendKeys(firstNameInfo);
	}
	public void fillLastNameInformation (String lastNameinfo) {
		lastNameInformation.sendKeys(lastNameinfo);
	}
	public void selectTheCountry (String country) {
	//Select countryInformation = new Select(driver.findElement(By.cssSelector(COUNTRY)));
	//countryInformation.selectByValue(country);
		countryInformation.sendKeys(country);
	}
	public void fillTheZipCodeInformation (String zipCode) {
		zipCodeS.sendKeys(zipCode);
	}
	public void fillTheCityInformation (String city) {
		cityInformation.sendKeys(city);
	}
	public void fillTheCurrentAddressInformation(String currentAdress) {
		currentAdresses.sendKeys(currentAdress);
	}
	public void fillTheSecondAddressInformation (String secondAddress) {
		secondAdress.sendKeys(secondAddress);
	}
	public void fillTheHomePhoneInformation (String homephone) {
		homePhone.sendKeys(homephone);
	}
	public void fillTheMobilePhoneInformation (String mobilephone) {
		 mobilePhone.sendKeys(mobilephone);
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
			registerButton.click();	
		}
		}
	public void clickTheOnSaveButton () { 
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView();",monCompteButton);
	boolean saveButtonIsEnable = monCompteButton.isEnabled();
	if (saveButtonIsEnable == true) {
		System.out.println(" the login button is Enabled");
		monCompteButton.click();
	}
	}
	public String getStatutMsg() {
		return statutInformation.getText();
	}
	public void clickOnSignOutButton () {
		boolean signOutIsEnable = signOut.isEnabled();
		if (signOutIsEnable == true) {
			System.out.println(" the login button is Enabled"); 
		    signOut.click();
		}
	}
	public void fillIncorrestAdressMailInformations (String emails) {
		adressEmail.sendKeys(emails);
	}
	
	public void clickOnSingnInUpButtonWithIncorrectEmail () {
		boolean signInUpButtonIsDesplayed = createAnAccountButton.isDisplayed();
		if (signInUpButtonIsDesplayed == true) {
			System.out.println(" the login button is Displayed");
		    createAnAccountButton.click();	
		}
	}
	public String getTheIncorrectEmailErrorMsg() {
		return errorMessage.getText();
	}
	public void fillUsedEmailAdressMailInformations (String emails) {
		adressEmail.sendKeys(emails);
	}
	public void clickOnSingnInUpButtonWithUsedEmail () {
		boolean signInUpButtonIsDesplayed = createAnAccountButton.isDisplayed();
		if (signInUpButtonIsDesplayed == true) {
			System.out.println(" the login button is Displayed");
		    createAnAccountButton.click();	
		}
	}
	public String getTheUsedEmailErrorMsg() {
		return errorMessage.getText();
	}

	
}
