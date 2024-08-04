package EdisacProjet;

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

public class RegisterUserEdisacStepDefinitions extends CommonMethods{

	public RegisterUserEdisacPage  RegisterUserEdisac = new RegisterUserEdisacPage ();
	public WebDriver driver ;
    public RegisterUserEdisacStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, RegisterUserEdisacPage.class);
    }

    @Given("I Navigate to EDISAC URL to sign up")
    public void iNavigateToEDISACURLToSignUp() throws IOException {
    	super.openURLWithConfigFile("Url3");
    }
    @When("I verify that EDISAC home page is visible")
    public void iVerifyThatEDISACHomePageIsVisible() {
    	String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("Boutique de maroquinerie en ligne : sac à main pas cher ou de luxe | Sac bandoulière de qualité")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("I Click on the sign in button on the EDISAC page")
    public void iClickOnTheSignInButtonOnTheEDISACPage() throws InterruptedException, IOException {
    	RegisterUserEdisac.clickSignupLoginButton();
    }
    @When("I verify that EDISAC page authentications is visible")
    public void iVerifyThatEDISACPageAuthenticationsIsVisible() {
    	String currentTitle1 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle1);
        if( currentTitle1.equals("S'inscrire / Login sur edisac.com")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("I verify that {string} is visible on EDISAC page")
    public void iVerifyThatIsVisibleOnEDISACPage(String info) {
    	String CreateAccountMessage = RegisterUserEdisac.getCreateAccountInformationMsg();
    	System.out.println("the account information is " + CreateAccountMessage);
    	Assert.assertTrue(CreateAccountMessage.contains(info));
    }
    @Then("I fill the email address {string} on the create account section EDISAC page")
    public void iFillTheEmailAddressOnTheCreateAccountSectionEDISACPage(String email) {
    	RegisterUserEdisac.fillTheAdressMail(email);
    }
    @Then("I click create account button in EDISAC page")
    public void iClickCreateAccountButtonInEDISACPage() {
    	RegisterUserEdisac.clickOnCreateAccountButton ();
    }
    @When("I verify that I m on the create an account EDISAC page")
    public void iVerifyThatIMOnTheCreateAnAccountEDISACPage() {
    	String currentTitle2 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle2);
        if( currentTitle2.equals("Je crée un compte sur edisac.com")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("I verify that enter account information {string} Edisac website is visible")
    public void iVerifyThatEnterAccountInformationedisacWebsiteIsVisible(String createcompteinfo) {
    	RegisterUserEdisac.getICreateMyCounteMsg();
    }
    @When("I fill password in the following details:")
    public void iFillPasswordInTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    	Map<String, String> registrationsDetails = dataTable.asMap(String.class, String.class);
	    String password = registrationsDetails.get("Password");
    	String confirmationpassword = registrationsDetails.get("PassWordBis");    
	    
    	RegisterUserEdisac.fillThePassWordInformation (password);
    	RegisterUserEdisac.fillTheConfirmationPassWordInformation(confirmationpassword);
    }
    @When("I select User category personne or entrerpise")
    public void iSelectUserCategoryPersonneOrEntrerpise() {
    	RegisterUserEdisac.clickOnTheCategory ();
    }
    @When("I select User title Mrs or Mr on EDISAC create page")
    public void iSelectUserTitleMrsOrMrOnEDISACCreatePage() {
    	RegisterUserEdisac.clickOnTheTitleGender();
    }
    @When("I fill Personnel informations on EDISAC create page in the following details:")
    public void iFillPersonnelInformationsOnEDISACCreatePageInTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    	Map<String, String> registrationsPersonalDetails = dataTable.asMap(String.class, String.class);
		 
		String firstname = registrationsPersonalDetails.get("FirstName");
	    String lastname = registrationsPersonalDetails.get("LastName");
	    
	    RegisterUserEdisac.fillTheFirstNameInformation (firstname);
	    RegisterUserEdisac.fillTheLastNameInformation (lastname);
	    
    }
    @When("I select day of birth of the user {string} on EDISAC create page")
    public void iSelectDayOfBirthOfTheUserOnEDISACCreatePage(String dayofbirth) {
    	RegisterUserEdisac.selectDayOfBirth (dayofbirth);
    }
    @When("I select month of birth of the user {string} on EDISAC create page")
    public void iSelectMonthOfBirthOfTheUserOnEDISACCreatePage(String monthofbirth) {
    	RegisterUserEdisac.selectMonthOfBirth (monthofbirth);
    }
    @When("I select year of birth of the user {string} on EDISAC create page")
    public void iSelectYearOfBirthOfTheUserOnEDISACCreatePage(String yearofbirth) {
    	RegisterUserEdisac.selectYearOfBirth (yearofbirth);
    }
    @When("I select the country of the user {string} on EDISAC create page")
    public void iSelectTheCountryOfTheUserOnEDISACCreatePage(String country) {
    	RegisterUserEdisac.selectCountry (country);
    }
    @When("I fill the supply registration informations form on EDISAC create page with the following details:")
    public void iFillTheSupplyRegistrationInformationsFormOnEDISACCreatePageWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    	 Map<String, String> registrationPersonalInformationsDetails = dataTable.asMap(String.class, String.class);
	    	
    	String city = registrationPersonalInformationsDetails.get("City");
	    String zipcode = registrationPersonalInformationsDetails.get("Zipcode");
	    String currentadress = registrationPersonalInformationsDetails.get("Address");
        String secondaddress = registrationPersonalInformationsDetails.get("Address2");
        String homephone = registrationPersonalInformationsDetails.get("HomePhone");
        String mobilephone = registrationPersonalInformationsDetails.get("MobilePhone");
        
        RegisterUserEdisac.fillTheCityInformation (city);
        RegisterUserEdisac.fillTheZipCodeInformation (zipcode);
        RegisterUserEdisac.fillTheCurrentAddressInformation(currentadress);
        RegisterUserEdisac.fillTheSecondAddressInformation (secondaddress);
        RegisterUserEdisac.fillTheHomePhoneInformation (homephone); 
        RegisterUserEdisac.fillTheMobilePhoneInformation (mobilephone); 
        
    }
    @When("I Select checkbox Sign up for our newsletter! on EDISAC create page")
    public void iSelectCheckboxSignUpForOurNewsletterOnEDISACCreatePage() {
    	RegisterUserEdisac.clickOnNewsLetters ();
    }
    @When("I verify {string} information on EDISAC create page")
    public void iVerifyInformationOnEDISACCreatePage(String newlettersmsg) {
    	RegisterUserEdisac.getTheNewsLettersMsg();
    }
    @When("I click on register button on EDISAC create page")
    public void iClickOnRegisterButtonOnEDISACCreatePage() {
    	RegisterUserEdisac.clickOnRegisterButton ();
    }
    @When("I verify that I m on my account page on EDISAC create page")
    public void iVerifyThatIMOnMyAccountPageOnEDISACCreatePage() {
    	String currentTitle3 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle3);
        if( currentTitle3.equals("Boutique de maroquinerie en ligne : sac à main pas cher ou de luxe | Sac bandoulière de qualité")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("I Click on mon compte button on EDISAC create page")
    public void iClickOnMonCompteButtonOnEDISACCreatePage() {
    	RegisterUserEdisac.clickTheOnSaveButton ();
    }
    @When("I verify the statue {string} on EDISAC create page")
    public void iVerifyTheStatueOnEDISACCreatePage(String statutsmsg) {
    	String statutMessage = RegisterUserEdisac.getStatutMsg();
    	System.out.println("the account information is " + statutMessage);
    	Assert.assertTrue(statutMessage.contains(statutsmsg));
    }
    @Then("I Click on sign out button")
    public void iClickOnSignOutButton() {
    	RegisterUserEdisac.clickOnSignOutButton ();
    	driver.quit();
    }
    @When("I fill all authentication details with incorrect Email on the EDISAC page:")
    public void iFillAllAuthenticationDetailsWithIncorrectEmailOnTheEDISACPage(io.cucumber.datatable.DataTable dataTable) {
    	Map<String, String> registrationemailInformationsDetails = dataTable.asMap(String.class, String.class);
    	
    	String emails = registrationemailInformationsDetails.get("Email");
        RegisterUserEdisac.fillIncorrestAdressMailInformations (emails );
    }
    @When("I click on sign in up buttons with incorrect email on the EDISAC page")
    public void iClickOnSignInUpButtonsWithIncorrectEmailOnTheEDISACPage() {
    	RegisterUserEdisac.clickOnSingnInUpButtonWithIncorrectEmail ();
    }
    @Then("I verify the message errors {string} on the EDISAC page")
    public void iVerifyTheMessageErrorsonTheEDISACPage(String errormessage) {
    	RegisterUserEdisac.getTheIncorrectEmailErrorMsg();
    	driver.quit();
    }
    @When("I fill all authentication details with used Email on the EDISAC page:")
    public void iFillAllAuthenticationDetailsWithUsedEmailOnTheEDISACPage(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> registrationEmailsInformationsDetails = dataTable.asMap(String.class, String.class);
    	
    	String email2 = registrationEmailsInformationsDetails.get("Email");
    	RegisterUserEdisac.fillUsedEmailAdressMailInformations (email2);
    }
    @When("I click on sign in up button with user email on the EDISAC page")
    public void iClickOnSignInUpButtonWithUserEmailOnTheEDISACPage() {
    	RegisterUserEdisac.clickOnSingnInUpButtonWithUsedEmail ();
    }
    @Then("I verify the message error {string}")
    public void iVerifyTheMessageError(String errormessage) {
    	RegisterUserEdisac.getTheUsedEmailErrorMsg();
    	driver.quit();
    }

}
