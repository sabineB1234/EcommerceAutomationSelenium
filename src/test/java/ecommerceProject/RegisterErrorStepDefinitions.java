package ecommerceProject;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utiles.CommonMethods;
import utiles.Setup;

public class RegisterErrorStepDefinitions extends CommonMethods{

	public RegisterErrorPage  registerErrorPage = new RegisterErrorPage ();
	public WebDriver driver ;
    public  RegisterErrorStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, RegisterErrorPage.class);
    }
    
    @Given("I navigate to automation practice pages URL to sign up")
	public void iNavigateToAutomationPracticePageURLToSignUp() throws IOException {
    	super.openURLWithConfigFile("url1");
	}
	@When("I verify that home pages automation practice is visible")
	public void iVerifyThatHomePagesAutomationPracticeIsVisible() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
	}
	@When("I Click on the signs in button")
	public void iClickOnTheSignsInButton() throws InterruptedException, IOException {
		registerErrorPage.clickSignupLoginButton();
	}

	@When("I verifys thats the pages authentications is visible")
	public void iVerifysThatsThePagesAuthenticationsIsVisible() {
		String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	    if( currentTitle1.equals("Login - My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("I verifys thats {string} is visible on the pages authentications")
	public void iVerifysThatsIsVisibleOnThePagesAuthentications(String info) {
		
	String CreateAccountMessage = registerErrorPage.getCreateAccountInformationMsg();
	System.out.println("the account information is " + CreateAccountMessage);
	Assert.assertTrue(CreateAccountMessage.contains(info));
	}
	@When("I fill the emails address {string} on the create account section")
	public void iFillTheEmailsAddressOnTheCreateAccountSection(String email) {
		registerErrorPage.fillTheAdressMail(email);
	}
	@When("I click creates account button")
	public void iClickCreatesAccountButton() {
		registerErrorPage.clickOnCreateAccountButton();
	}
	@When("I verify thats I m on thes create an account page")
	public void iVerifyThatsIMOnThesCreateAnAccountPage() {
		String currentTitle2 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle2);
	    if( currentTitle2.equals("Login - My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }	
	}
	@When("I verify thats enter account information {string} is visible")
	public void iVerifyThatsEnterAccountInformationIsVisible(String personalinfo) {	
	String personalInformationMessage = registerErrorPage.getPersonalInformationMsg();
	System.out.println("the account information is " + personalInformationMessage);
	Assert.assertTrue(personalInformationMessage.contains(personalinfo));
	}
	@When("I select Users titles Mrs or Mr")
	public void iSelectUsersTitlesMrsOrMr() {
		registerErrorPage.clickOnTheTitleGender();
	}
	@When("I fill User informations in the followings details:")
	public void iFillUserInformationsInTheFollowingsDetails(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> registrationsDetails = dataTable.asMap(String.class, String.class);
		 
		String firstname = registrationsDetails.get("FirstName");
	    String lastname = registrationsDetails.get("LastName");
	    String password = registrationsDetails.get("Password");
	        
	    registerErrorPage.fillTheFirstNameInformation (firstname);
	    registerErrorPage.fillTheLastNameInformation (lastname);
	    registerErrorPage.fillThePassWordInformation (password);
	    
	  
        System.out.println("firstname.isEmpty(): " + firstname.isEmpty());  // Output: true
        System.out.println("firstname.isBlank(): " + firstname.isBlank());  // Output: true

        System.out.println("lastname.isEmpty(): " + lastname.isEmpty());  // Output: false
        System.out.println("lastname.isBlank(): " + lastname.isBlank());  // Output: true

        System.out.println("password.isEmpty(): " + password.isEmpty());  // Output: false
        System.out.println("password.isBlank(): " + password.isBlank());  // Output: false
	}
	@When("I select days of birth of the user {string}")
	public void iSelectDaysOfBirthOfTheUser(String dayofbirth) {
		registerErrorPage.selectDayOfBirth(dayofbirth);
	}
	@When("I select months of birth of the user {string}")
	public void iSelectMonthsOfBirthOfTheUser(String monthofbirth) {
		registerErrorPage.selectMonthOfBirth (monthofbirth);
	}
	@When("I select years of birth of the user {string}")
	public void iSelectYearsOfBirthOfTheUser(String yearofbirth) {
		registerErrorPage.selectYearOfBirth (yearofbirth);
	}
	@When("I Select checkboxs Sign up for our newsletter!")
	public void iSelectCheckboxsSignUpForOurNewsletter() {
		registerErrorPage.clickOnNewsLetters();
	}
	@When("I verify {string} informations")
	public void iVerifyInformations(String newlettersmsg) {
		String newsLettersMessage = registerErrorPage.getTheNewsLettersMsg();
		System.out.println("the account information is " + newsLettersMessage);
		Assert.assertTrue(newsLettersMessage.contains(newlettersmsg));
		}
	
	@When("I click on registers button")
	public void iClickOnRegistersButton() {
		registerErrorPage.clickOnRegisterButton();
	}
	@Then("I verify errors message {string}")
	public void iVerifyErrorsMessage(String errorsmessages) {
		registerErrorPage.getTheErrorsMessage();
		driver.quit();
	}
	
}
