package EdisacProjet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class LoginEdisacPage {

	/* Locators */
	final static String  SIGNUP_LOGIN = "account-mini";
	final static String  EMAIL_ADRESS = "email";
	final static String PASS_WORD = "password" ;
	final static String LOGGED_BUTTON = "//span[contains(text(),'Je me connecte')]";
	final static String MONCOMPTE_BUTTON= "#account-mini";
	final static String LOGIN_MSG= "div:nth-child(4) div.line div.right.w70 div.title0.line > span:nth-child(2)";
	final static String LOGOUT_BUTTON= "//a[contains(text(),'déconnexion')]"; 
	final static String ERRORS_MSG= "#createresponse"; 
	
	/* @FindBy */
	@FindBy (how=How.ID, using = SIGNUP_LOGIN) 
	public static WebElement signupLoginClick ; 
	@FindBy (how= How.ID, using = EMAIL_ADRESS) 
	public static WebElement emailAdress ;
	@FindBy (how= How.ID, using = PASS_WORD)
	public static WebElement passWord ;
	@FindBy (how = How.XPATH , using = LOGGED_BUTTON)
	public static WebElement loginButton ;
	@FindBy (how = How.CSS , using = MONCOMPTE_BUTTON)
	public static WebElement monCompteButton ;
	@FindBy (how = How.CSS , using = LOGIN_MSG)
	public static WebElement loginMsg ;
	@FindBy (how = How.XPATH , using = LOGOUT_BUTTON)
	public static WebElement logOutButton ;
	@FindBy (how = How.CSS , using = ERRORS_MSG)
	public static WebElement errorsMsg ;
	
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
	monCompteButton.click();
	return loginMsg.getText();	
	}
	public void logOutButtonClick() {
	logOutButton.click();
	} 
	public void fillIncorrectEmail (String incorrectemail) {
	emailAdress.sendKeys(incorrectemail);  
	} 
	public void fillIncorrectPassWord (String incorrectpassword) {
	passWord.sendKeys(incorrectpassword); 
	} 
	public void loginButtonClickToInterIncorrect () {
	loginButton.click();
	} 
	public String getLoginErrorsMsg() {
	return errorsMsg.getText(); 
}
}
