package automationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class LoginPage {

	/* Locators */
	final static String  SIGNUP_LOGIN = "Signup / Log";
	final static String  EMAIL_ADRESS = "[data-qa=\"login-email\"]";
	final static String PASS_WORD = "[data-qa=\"login-password\"]" ;
	final static String LOGGED_BUTTON = "[data-qa=\"login-button\"]";
	final static String LOGIN_MSG= "Logged in";
	
	/* @FindBy */
	@FindBy (how=How.PARTIAL_LINK_TEXT, using = SIGNUP_LOGIN) 
	public static WebElement signupLoginClick ; 
	@FindBy (how= How.CSS, using = EMAIL_ADRESS) 
	public static WebElement emailAdress ;
	@FindBy (how= How.CSS, using = PASS_WORD)
	public static WebElement passWord ;
	@FindBy (how = How.CSS , using = LOGGED_BUTTON)
	public static WebElement loginButton ;
	@FindBy (how = How.PARTIAL_LINK_TEXT , using = LOGIN_MSG)
	public static WebElement loginMsg ;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
	public void clickSignupLogin () throws InterruptedException {
	Thread.sleep(5000);  
    //wait.explicitWaitUntilVisibilityOfButtonCss(driver, SIGNUP_LOGIN, 10);
	signupLoginClick.click(); 
	} 
	
	public void fillEmail (String email) {
	emailAdress.sendKeys(email);  
	} 
	public void fillPassWord (String password) {
	passWord.sendKeys(password); 
	} 
	public void loginButtonClick () {
	loginButton.click();
	} 
	public String getLoginMsg() {
	return loginMsg.getText();

		
	}
    
}
