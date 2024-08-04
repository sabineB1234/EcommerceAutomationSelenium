package automationExercise;



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

public class RegisterUserStepDefinitions extends CommonMethods {

		public RegisterUser  registerUser = new RegisterUser ();
		public WebDriver driver ;
	    public  RegisterUserStepDefinitions () {
	    super ();
	    driver = Setup.driver;
	    PageFactory.initElements (driver, RegisterUser.class);
	    }
	    @Given("I Navigate to automation URL to sign up")
	    public void iNavigateToAutomationURLToSignUp() throws InterruptedException, IOException {
	    	super.openURLWithConfigFile("Url");
	     }
	    @When("I Verify that home page automation is visible successfully")
	    public void iVerifyThatHomePageAutomationIsVisibleSuccessfully() {
	   	String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	    }
	    @When("I Click on Sign up button")
	    public void iClickOnSignUpButton() throws InterruptedException {  
	    registerUser.clickSignupLogin();	
	    }
		@When("I fill the name and email address:")
	    public void iFillTheNameAndEmailAddress(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> registrationsDetail = dataTable.asMap(String.class, String.class);
			 
			String name = registrationsDetail.get("Name");
		    String email = registrationsDetail.get("Email");
		  
		    registerUser.fillTheFirstName (name);
		    registerUser.fillThAdressEmailInformation (email);	
	    }
	    @When("i Click Sign up button")
	    public void iClickSignUpButton() {
	    	registerUser.submitButtonClick();
	    }
	    @When("I Verify that enter account information  {string} is visible")
	    public void iVerifyThatEnterAccountInformationIsVisible (String info) {
		 String enterAccountMessage = registerUser.getEnterAccountInformationMsg(info);
		 System.out.println("the account information is " + enterAccountMessage);
		 Assert.assertTrue(enterAccountMessage.contains(info));
	    }
	    @When("I Select details Title")
	    public void iSelectDetailsTitle() {
	    	registerUser.clickOnTitle();
	    }
	    @When("I fill details name and email and passwords:")
	    public void iFillDetailsNameAndEmailAndPasswords(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> registrationsDetails = dataTable.asMap(String.class, String.class);
			 
			String firstname = registrationsDetails.get("FirstName");
		    String lastname = registrationsDetails.get("LastName");
		    String password = registrationsDetails.get("Password");
		        
		    registerUser.fillFirstName (firstname);
		    registerUser.fillAdressEmailInformation (lastname);
		    registerUser.fillPassWordInformation (password);	
	    }
        @When("I Select details Date Day of birth {string}")
        public void iSelectDetailsDateDayOfBirth(String optionTextday) {
        	registerUser.selectDayBirth (optionTextday);
        }
	    @When("I Select details Date Month of birth {string}")
	    public void iSelectDetailsDateMonthOfBirth(String optionTextmonth) {
	    	registerUser.selectMonthBirth (optionTextmonth);
	    }
	   // @When("I Select details Date Year of birth {string}")
	    //public void iSelectDetailsDateYearOfBirth(String optionTextYear) {
	    	//registerUser.selectYearBirth (optionTextYear);
	    
	    @When("I Select checkbox Sign up for our newsletter")
	    public void iSelectCheckboxSignUpForOurNewsletter() {
	    	registerUser.clickOnNewsLetters();
	    }
	    @When("I Select checkbox Receive special offers from our partners")
	    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
	    	registerUser.clickOnSPcialOffer();
	    }
	    @When("I Verify that sign up for newsletters {string} is visible")
	    public void iVerifyThatSignUpForNewslettersIsVisible(String newlettersmsg) {
	    	String newsLettersMSG = registerUser.getNewsLettersMsg(newlettersmsg);
			 Assert.assertTrue(newsLettersMSG.contains(newlettersmsg));
	    }
	    @When("I Verify that receive special offers {string} is visible")
	    public void iVerifyThatReceiveSpecialOffersIsVisible(String specialoffermsg) {
	    	String specialOfferMSG = registerUser.getSpecialOfferMsg(specialoffermsg);
			 Assert.assertTrue(specialOfferMSG.contains(specialoffermsg));
	    }
	    @When("I fill the registration informations with the following details:")
	    public void iFillTheRegistrationInformationsWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
	        Map<String, String> registrationDetails = dataTable.asMap(String.class, String.class);
	    	
	    	String firstnameinfo = registrationDetails.get("Firstname");
		    String lastnameinfo = registrationDetails.get("Lastname");
	        String compagnyname = registrationDetails.get("Company");
	        String currentadress = registrationDetails.get("Address");
	        String secondadress = registrationDetails.get("Address2");
	        
	        registerUser.fillFirstNameInformation (firstnameinfo);
		    registerUser.fillLastNameInformation (lastnameinfo);
	        registerUser.fillCompagnyNameInformation(compagnyname);
	        registerUser.fillCurrentAdressInformation(currentadress);
	        registerUser.fillSecondAdressInformation(secondadress);
	    }
	    @When("I Select drop down list Country {string}")
	    public void iSelectDropDownListCountry(String optionTextcountry) {
	    	registerUser.selectCountry (optionTextcountry);
	    }  
	    @When("I fill the following informations state city zipCode mobile number:")
	    public void iFillTheFollowingInformationsStateCityZipCodeMobileNumber(io.cucumber.datatable.DataTable dataTable) {
	    	Map<String, String> registrationsDetails = dataTable.asMap(String.class, String.class);
	    	
	    	String state = registrationsDetails.get("State");
	    	String city = registrationsDetails.get("City");
		    String zipcode = registrationsDetails.get("Zipcode");
	        String number = registrationsDetails.get("MobileNumber");
	        
	        registerUser.fillStateInformation (state);
		    registerUser.fillCittyInformation (city);
	        registerUser.fillZipCodeInformation(zipcode);
	        registerUser.filltelephoneNumberInformation(number);  
	    }
	    @When("I Click on Create Account button")
	    public void iClickOnCreateAccountButton() {
	    	registerUser.clickONAccountButton();
	   
	    }
	    @When("I Verify that account created {string} is visible")
	    public void iVerifyThatAccountCreatedIsVisible(String accountcreatedmessag) {
	    	String createdAccountMSG = registerUser.getAccountCreatedMsg(accountcreatedmessag);
			 Assert.assertTrue(createdAccountMSG.contains(accountcreatedmessag));
	    }
	    @When("I Click on Continue button")
	    public void iClickOnContinueButton() {
	    	registerUser.clickOnContinueButton();
	    }
	    @When("I Verify that the logged in {string} is visible")
	    public void iVerifyThatTheLoggedInIsVisible(String loginmessage) {
	     String userMessage = registerUser.getLoginMessage(loginmessage);
	     Assert.assertTrue(userMessage.contains(loginmessage));
	    } 
	    @When("I Click on Delete Account button")
	    public void iClickOnDeleteAccountButton() {
	    	registerUser.clickOnDeleteButton();
	    }
	    @When("I Verify that account deleted {string} is visible")
	    public void iVerifyThatAccountDeletedIsVisible(String deletemessage) {
	    	String deleteButtonMessage = registerUser.getdeleteMessage(deletemessage);
		     Assert.assertTrue(deleteButtonMessage.contains(deletemessage));	
	    }
	    @Then("I click on continue button user")
	    public void iClickOnContinueButtonUser() {
	    	registerUser.clickOnContinueDeleteButton();
	    	driver.quit();
	    }
}
