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

public class StepDefinitionsRegisterUserProject extends CommonMethods{

		public RegisterUserProjectpage  registerUserProject = new RegisterUserProjectpage ();
		public WebDriver driver ;
	    public  StepDefinitionsRegisterUserProject () {
	    super ();
	    driver = Setup.driver;
	    PageFactory.initElements (driver, RegisterUserProjectpage.class);
	    }
	@Given("I navigate to automation practice URL to sign up")
	public void iNavigatesToAutomationPracticeURLToSignUp() throws IOException  {
		super.openURLWithConfigFile("url1");
	}  
	@When("I verify that home page automation practice is visible")
	public void iVerifysThatHomePageAutomationPracticeIsVisible() {
		String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }	
	}
	@When("I click on the sign in button to sign up")
	public void iClickOnTheSignInButtonToSignUp() throws InterruptedException, IOException {
		registerUserProject.clickSignupLoginButton();
	}
	@When("I verify that these page authentications is visible")
	public void iVerifyThatThesePageAuthenticationsIVisible() {
		String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	    if( currentTitle1.equals("Login - My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }	
	}
	@When("I verify that {string} is visible on the page authentication")
	public void iVerifyThatIsVisibleOnThePageAuthentication(String info) {
	String CreateAccountMessage = registerUserProject.getCreateAccountInformationMsg();
	System.out.println("the account information is " + CreateAccountMessage);
	Assert.assertTrue(CreateAccountMessage.contains(info));
	}
	@When("I fill the email address {string} on the create account section")
	public void iFillTheEmailAddressOnTheCreateAccountSection(String email) {
		registerUserProject.fillTheAdressMail(email);
	}
	@When("I click create account button")
	public void iClickCreateAccountButton() {
		registerUserProject.clickOnCreateAccountButton();
	}
	@When("I verify that I m on the create an account page")
	public void iVerifyThatIMOnTheCreateAnAccountPage() {
		String currentTitle2 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle2);
	    if( currentTitle2.equals("Login - My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }	
	}
	@When("I verify that enter account information {string} is visible")
	public void iVerifyThatEnterAccountInformationIsVisible(String personalinfo) {
	String personalInformationMessage = registerUserProject.getPersonalInformationMsg();
	System.out.println("the account information is " + personalInformationMessage);
	Assert.assertTrue(personalInformationMessage.contains(personalinfo));
	}
	@When("I select User title Mrs or Mr")
	public void iSelectUserTitleMrsOrMr() {
    registerUserProject.clickOnTheTitleGender(); 
	}
	@When("I fill User informations in the following details:")
	public void iFillUserInformationsInTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
	Map<String, String> registrationsDetails = dataTable.asMap(String.class, String.class);
		 
		String firstname = registrationsDetails.get("FirstName");
	    String lastname = registrationsDetails.get("LastName");
	    String password = registrationsDetails.get("Password");
	        
	    registerUserProject.fillTheFirstNameInformation (firstname);
	    registerUserProject.fillTheLastNameInformation (lastname);
	    registerUserProject.fillThePassWordInformation (password);
    }
	@When("I select day of birth of the user {string}")
	public void iSelectDayOfBirthOfTheUser(String dayofbirth) {
		registerUserProject.selectDayOfBirth(dayofbirth);
	}
	@When("I select month of birth of the user {string}")
	public void iSelectMonthOfBirthOfTheUser(String monthofbirth) {
		registerUserProject.selectMonthOfBirth ( monthofbirth);
	}
	@When("I select year of birth of the user {string}")
	public void iSelectYearOfBirthOfTheUser(String yearofbirth) {
		registerUserProject.selectYearOfBirth (yearofbirth);
	}
	@When("I Select checkbox Sign up for our newsletter!")
	public void iSelectCheckboxSignUpForOurNewsletter() {
		registerUserProject.clickOnNewsLetters();
	}
	@When("I verify {string} information")
	public void iVerifyInformation(String newlettersmsg) {
    String newsLettersMessage = registerUserProject.getTheNewsLettersMsg( );
	System.out.println("the account information is " + newsLettersMessage);
	Assert.assertTrue(newsLettersMessage.contains(newlettersmsg));
	}
	@When("I click on register button")
	public void iClickOnRegisterButton() {
		registerUserProject.clickOnRegisterButton();
	}
	@When("I verify that I m on my account page")
	public void iVerifyThatIMOnMyAccountPage() {
		String currentTitle3 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle3);
	    if( currentTitle3.equals("My account - My Shop")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("I verify that account created success {string}is visible")
	public void iVerifyThatAccountCreatedSuccessIsVisible(String successmsg) {
		String SuccessMessage = registerUserProject.getTheSuccessMsg();
		System.out.println("the account information is " + SuccessMessage);
		Assert.assertTrue(SuccessMessage.contains(successmsg));
	}
	@When("I click on the add my first adress")
	public void iClickOnTheAddMyFirstAdress() {
		registerUserProject.clickOnMyFirstAddressButton();
	}
	@When("I verify that I m on the Your addresses page")
	public void iVerifyThatIMOnTheYourAddressesPage() {
		String currentTitle4 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle4);
	    if( currentTitle4.equals("YOUR ADDRESSES")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("I fill the registration informations form with the following details:")
	public void iFillTheRegistrationInformationsFormWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
	Map<String, String> registrationDetails = dataTable.asMap(String.class, String.class);
	
        String companyName = registrationDetails.get("Company");
        String currentAddress = registrationDetails.get("Address");
        String secondAddress = registrationDetails.get("Address2");
        String city = registrationDetails.get("City");
        
        registerUserProject.fillTheCompanyNameInformation(companyName);
        registerUserProject.fillTheCurrentAddressInformation(currentAddress);
        registerUserProject.fillTheSecondAddressInformation(secondAddress);
        registerUserProject.fillTheCityInformation(city);
	}
	
	@When("I select the country {string} on checkbox")
	public void iSelectTheCountryOnCheckbox(String country) {
		registerUserProject.selectTheCountry (country);
	}
	@When("I select the state {string} on checkbox")
	public void iSelectTheStateOnCheckbox(String state) {
		registerUserProject.fillTheStateInformation (state);
	}
	@When("I fill the supply registration informations form with the following details:")
	public void iFillTheSupplyRegistrationInformationsFormWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> registrationDetails = dataTable.asMap(String.class, String.class);
		
        String zipCode = registrationDetails.get("Zipcode");
        String homephone = registrationDetails.get("HomePhone");
        String mobilephone = registrationDetails.get("MobilePhone");
        String additionalinfo = registrationDetails.get("Additionals");
        String myaddress = registrationDetails.get("MyAddress");

        registerUserProject.fillTheZipCodeInformation(zipCode);
        registerUserProject.fillTheHomePhoneInformation(homephone);
        registerUserProject.fillTheMobilePhoneInformation (mobilephone);
        registerUserProject.fillAdditionalInformation (additionalinfo);
        registerUserProject.fillMyAddressInformation (myaddress);
	}
	@When("I verify the information assign {string}")
	public void iVerifyTheInformationAssign(String addresstitle) {
	String adressTitleMessage = registerUserProject.getTheAdressTitleMsg();
	System.out.println("the account information is " + adressTitleMessage);
    Assert.assertTrue(adressTitleMessage.contains(addresstitle));
	}
	@When("I click on save button")
	public void iClickOnSaveButton() {
		registerUserProject.clickTheOnSaveButton();
	}
	@When("I verify that I m on my addresses page")
	public void iVerifyThatIMOnMyAddressesPage() {
		String currentTitle5 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle5);
	    if( currentTitle5.equals("MY ADDRESSES")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("I verify the adress information {string}")
	public void iVerifyTheAdressInformation(String nameaddress) {
	String nameAdressMessage = registerUserProject.getTheNameAddressMsg();
	System.out.println("the title information is " + nameAdressMessage);
	Assert.assertTrue(nameAdressMessage.contains(nameaddress));
		
	}
	@When("I click on back to your account button")
	public void iClickOnBackToYourAccountButton() {
		registerUserProject.clickOnAddNewAddressButton();
	}
	@Then("I Click on sign out buttons")
	public void iClickOnSignOutButtons() {
		registerUserProject.clickOnSignOutButton();
	}
	@Given("I fill all authentication details:")
	public void iFillAllAuthenticationDetails(io.cucumber.datatable.DataTable dataTable) {
     Map<String, String> authenticationDetails = dataTable.asMap(String.class, String.class);
		
		String emails = authenticationDetails.get("Email");
        String passwords = authenticationDetails.get("Password");
       
        registerUserProject.fillAdressMailInformations (emails);
        registerUserProject.fillPassWordInformations (passwords); 
	}
	@When("I click on sign in up button")
	public void iClickOnSignInUpButton() {
		registerUserProject.clickOnSingnInUpButton();
	    }
	@Then("I verify the messages error {string} on automation practice page")
	public void iVerifyTheMessagesErrorOnAutomationPracticePage (String errormessage) {
		String errorMessage = registerUserProject.getTheErrorMsg();
		System.out.println("the account information is " + errorMessage);
		Assert.assertTrue(errorMessage.contains(errormessage));
		driver.quit();
	}
}

