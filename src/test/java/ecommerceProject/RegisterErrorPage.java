package ecommerceProject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class RegisterErrorPage {

	/* Locators */
	final static String  SIGNUP_LOGIN = "Sign";
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
    final static String ERRORS_MESSAGE = "//p[contains(text(),'There are 3 errors')]";
    
    /* @FindBy */
    
    @FindBy (how=How.PARTIAL_LINK_TEXT, using = SIGNUP_LOGIN) 
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
	@FindBy (how= How.XPATH, using = ERRORS_MESSAGE)
	public static WebElement errorsMessage ;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
    Actions actions = new Actions(driver);
	
	/* Methods */ 
	public void clickSignupLoginButton () throws InterruptedException , IOException {
	Thread.sleep(5000); 
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	boolean signupLoginButtonClickIsDelayed = signupLoginButtonClick.isEnabled();
	if (signupLoginButtonClickIsDelayed == true) {
		System.out.println(" the login button is Enabled");
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
	public String getPersonalInformationMsg() {
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
	    firstNameInformation.click();
	    actions.sendKeys(firstNameInformation, firstname).perform();
		
	}
	public void fillTheLastNameInformation (String lastname) {
		actions.moveToElement(lastNameInformation).build().perform();
		lastNameInformation.click();
		lastNameInformation.sendKeys(lastname);
	}
	public void fillThePassWordInformation (String password) {
		passWordInformation.click();
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
	public String getTheErrorsMessage( ) {
		return errorsMessage.getText();
}
}