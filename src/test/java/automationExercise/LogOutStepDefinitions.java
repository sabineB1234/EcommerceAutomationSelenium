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

public class LogOutStepDefinitions  extends CommonMethods{

	 
		public LogOutPage  logOutPage = new LogOutPage ();
		public WebDriver driver ;
	    public LogOutStepDefinitions () {
	    super ();
	    driver = Setup.driver;
	    PageFactory.initElements (driver, LogOutPage.class);
	    }
	    
	     @Given("I navigate to URL to log in")
	  	public void iNavigateToURLToLogIn() throws IOException {  
	 	super.openURLWithConfigFile("Url");
	     }
	     
	    @When("I click on the button sign up login")
	     public void iClickOnTheButtonSignUpLogin() throws InterruptedException {     
	    	 logOutPage.clickSignupLogin(); 
	 	}
		@Given("I enter the correct email address {string}")
		public void iEnterTheCorrectEmailAdress(String email) {
			logOutPage.fillEmail(email);
		}
		@Given("I enter the correct password {string}")
		public void iEnterTheCorrectPassword(String password) {
			logOutPage.fillPassWord(password);	
		}
		@Given("I click on the login button")
		public void iClickOnTheLoginButton() {
			logOutPage.loginButtonClick();
		} 
		@Given("I verify that the logged in as {string} is visible")
		public void iVerifyThatTheLoggedInAsIsVisible(String msg) {
		String userMessage = logOutPage.getLoginMsg();
		Assert.assertTrue(userMessage.contains(msg));
		}
		@Given("I click on the log out button")
		public void iClickOnTheLogOutButton() {
			logOutPage.clickLogOutButton();  
		} 
		@Then("I verify that the user is navigated to login page")
		public void iVerifyThatTheUserIsAsNavigatedToLoginPage() {
		
			String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("Automation Exercise - Signup / Login")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    driver.quit();
			    }
		}
		}
