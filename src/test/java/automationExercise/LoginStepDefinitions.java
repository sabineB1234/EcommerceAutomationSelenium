package automationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utiles.CommonMethods;
import utiles.Setup;

public class LoginStepDefinitions extends CommonMethods {
 
    
	public LoginPage  loginPage = new LoginPage ();
	public WebDriver driver ;
     public LoginStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, LoginPage.class);
    }
     
     @Given("I navigate to automation URL to connect")
  	public void iNavigateToAutomationURLToConnect() throws IOException {  
 	super.openURLWithConfigFile("Url");
     }
     
  	@When("I click on sign up\\/login button")
 	public void iClickOnSignUpLoginButton() throws InterruptedException {     
      loginPage.clickSignupLogin();  
  	}
  
 	@When("I enter a correct email {string}")
 	public void iEnterACorrectalidEmail(String email) {
 	loginPage.fillEmail(email);
 	}

 	@When("I enter a correct password {string}")
 	public void iEnterACorrectPassword(String password) {
 	loginPage.fillPassWord(password);	
 	}
 	
 	@When("I click on login Button")
 	public void iClickOnLoginButton()  {
 	loginPage.loginButtonClick();
 	} 
 	
 	@Then("I verify that I m {string}")
 	public void iVerifyThatIM(String msg) {
 	String userMessage = loginPage.getLoginMsg();
 	Assert.assertTrue(userMessage.contains(msg));
 	} 
}




  







