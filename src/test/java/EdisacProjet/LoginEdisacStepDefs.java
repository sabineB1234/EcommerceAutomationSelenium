package EdisacProjet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utiles.CommonMethods;
import utiles.Setup;

public class LoginEdisacStepDefs extends CommonMethods{

	public LoginEdisacPage  LoginEdisac = new LoginEdisacPage ();
	public WebDriver driver ;
    public LoginEdisacStepDefs () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, LoginEdisacPage.class);
    }

@Given("I navigate to automation URL to connect Edisac website")
public void iNavigateToAutomationURLToConnectEdisacWebsite() throws IOException {
	super.openURLWithConfigFile("Url3");
}
@Given("I click on sign up\\/login button on the EDISAC page")
public void iClickOnSignUpLoginButtonOnTheEDISACPage() throws InterruptedException {
	LoginEdisac.clickSignupLogin ();
}
@When("I enter a correct email {string} on the EDISAC page")
public void iEnterACorrectEmailOnTheEDISACPage(String email) {
	LoginEdisac.fillEmail(email);
}
@When("I enter a correct password {string} on the EDISAC page")
public void iEnterACorrectPasswordOnTheEDISACPage(String password) {
	LoginEdisac.fillPassWord (password);
}
@When("I click on login Button on the EDISAC page")
public void iClickOnLoginButtonOnTheEDISACPage() {
	LoginEdisac.loginButtonClick();
}
@When("I verify that I m {string} on the EDISAC page")
public void iVerifyThatIMOnTheEDISACPage(String msg) {
	
	String satautAccountMessage = LoginEdisac.getLoginMsg();
	System.out.println("the account information is " + satautAccountMessage);
	Assert.assertTrue(satautAccountMessage.contains(msg));
}
@Then("I click on the login out button of Edisac page")
public void iClickOnTheLoginOutButtonOfEdisacPage() {
	LoginEdisac.logOutButtonClick();
	driver.quit();
}
@When("I enter incorrect email {string} on the EDISAC page")
public void iEnterIncorrectEmailOnTheEDISACPage(String incorrectemail) {
	LoginEdisac.fillIncorrectEmail (incorrectemail);
}
@When("I enter incorrect password {string} on the EDISAC page")
public void iEnterIncorrectPasswordOnTheEDISACPage(String incorrectpassword) {
	LoginEdisac.fillIncorrectPassWord (incorrectpassword);
}
@When("I click on login Button on the EDISAC page to authentication incorrect")
public void iClickOnLoginButtonOnTheEDISACPageToAuthenticationIncorrect() {
	LoginEdisac.loginButtonClickToInterIncorrect ();
}
@Then("I verify messages errors {string} on the EDISAC page")
public void iVerifyMessagesErrorsOnTheEDISACPage(String errorsmsg) {
	LoginEdisac.getLoginErrorsMsg();
	driver.quit();
}
}


