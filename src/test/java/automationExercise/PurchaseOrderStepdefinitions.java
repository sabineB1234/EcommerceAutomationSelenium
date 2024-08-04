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

public class PurchaseOrderStepdefinitions extends CommonMethods {

	public PurchaseOrderPage  purchaseOrder = new PurchaseOrderPage ();
	public WebDriver driver ;
    public  PurchaseOrderStepdefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, PurchaseOrderPage.class);
    }
    
    @Given("I navigate to url to purchase order")
    public void iNavigateToUrlToPurchaseOrder() throws IOException {
    	super.openURLWithConfigFile("Url");
    }
    
    @Given("I Verify that the home page is visible successfully")
    public void iVerifyThatTheHomePageIsVisibleSuccessfully() {
    	String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I click on sign up login button1")
	public void iClickOnSignUpLoginButton1() throws InterruptedException {     
    	purchaseOrder.clickSignupLogin(); 
 	}
 
	@When("I enter correct email {string}")
	public void iEnterCorrectalidEmail(String email) {
		purchaseOrder.fillTheEmail(email);
	}

	@When("I enter correct password {string}")
	public void iEnterCorrectPassword(String password) {
		purchaseOrder.fillThePassWord(password);	
	}
	
	@When("I click on the login Button")
	public void iClickOnTheLoginButton()  {
		purchaseOrder.ClickOnTheloginButtonClick();
	} 
	
	@Then("I verify that I m login as {string}")
	public void iVerifyThatIMLoginAs(String msg) {
	String userMessage = purchaseOrder.getLoginMsg(msg);
	Assert.assertTrue(userMessage.contains(msg));
	} 
    @When("I Click on the Cart button")
    public void iClickOnTheCartButton() {
    	purchaseOrder.clickOnTheCartButton();
    }
    @When("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
    	String currentTitle2 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle2);
	   	if( currentTitle2.equals("Shopping Cart")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @Then("I Click on Proceed To Checkout")
    public void iClickOnProceedToCheckout() {
    	purchaseOrder.clickOnTheProceedToCheckOut();
    }
    @When("I Verify Address Details {string}")
    public void iVerifyAddressDetails(String adressmessage) {
    	String userMessage = purchaseOrder.getTheAdressMessage(adressmessage);
    	System.out.println("the adress details  is " + userMessage);
    	//Assert.assertTrue(userMessage.contains(adressmessage));
    }
    @When("I verify Review Your Order {string}")
    public void iVerifyReviewYourOrder(String reviewordermessage) {
    	String userReviewYourOrderMessage = purchaseOrder.getReviewYourOrderMessage(reviewordermessage );
    	System.out.println("the adress details is " + userReviewYourOrderMessage);
    	//Assert.assertTrue(userReviewYourOrderMessage.contains(reviewordermessage));
    }
    @When("I Enter description in comment text area {string}")
    public void iEnterDescriptionInCommentTextArea(String areamessage) {
    	purchaseOrder.sendAreaMessage (areamessage);
    }
    @When("I click on the place order button")
    public void iClickOnThePlaceOrderButton() {
    	purchaseOrder.clickOnThePlaceOderButton();
    }
    @When("I verify that I m on the checkout page")
    public void iVerifyThatIMOnTheCheckoutPage() {
    	String currentTitle5 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle5);
	    if( currentTitle5.equals("Payment")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I enter payment details:")
    public void iEnterPaymentDetails(io.cucumber.datatable.DataTable dataTable) {
    	Map<String, String> paymentDetails = dataTable.asMap(String.class, String.class);
    	String nameoncard = paymentDetails.get("Nameoncard");
        String numberoncard = paymentDetails.get("Cardnumber");
        String numbercvc = paymentDetails.get("CVC");
        String expirationmonth = paymentDetails.get("ExpirationMonth");
        String expirationyear = paymentDetails.get("ExpirationYear");
     
    	purchaseOrder.fillNameOnCard (nameoncard) ;
    	purchaseOrder.fillNumberOnCard (numberoncard) ;
    	purchaseOrder.fillNumberCVCOnCard (numbercvc) ;
    	purchaseOrder.fillExpirationMonthOnCard (expirationmonth); 
    	purchaseOrder.fillExpirationYearOnCard (expirationyear) ;
    }
    @When("I click on pay and confirm order button")
    public void iClickOnPayAndConfirmOrderButton() {
    	purchaseOrder.clickOnPayAndConfirmButton();
    }
    @When("I Verify success message {string}")
    public void iVerifySuccessMessage(String confirmedordermessage) {
    	String confirmedOrderMessage = purchaseOrder.getTheConfirmedOrderMessage(confirmedordermessage );
    	System.out.println("the adress details  is " + confirmedOrderMessage);
    	Assert.assertTrue(confirmedOrderMessage.equals(confirmedordermessage));
    }
    @When("I Click on the Download Invoice button")
    public void iClickOnTheDownloadInvoiceButton() {
    	purchaseOrder.clickOnDownlouedButton();
    }
    @When("I verify invoice is downloaded successfully")
    public void iVerifyInvoiceIsDownloadedSuccessfully() {
    	
    }
    @When("I Click on Continues buttons")
    public void iClickOnContinuesButtons() {
    	purchaseOrder.clickOnContinuePayButton();
    }
    @When("I Click on Sign up login button")
    public void iClickOnSignUpLoginButton() throws InterruptedException {
    	purchaseOrder.clickOnTheSignupLogin();
    }
    @When("I fill name  {string}")
    public void iFillName(String named) {
    	purchaseOrder.fillTheName (named);
    }
    @When("I fill email address {string}")
    public void iFillEmailAddress(String emailed) {
    	purchaseOrder.fillTheAdressMail(emailed) ;
    }
    @When("i Click on the Sign up button")
    public void iClickOnTheSignUpButton() {
    	purchaseOrder.submitTheButtonClick ();
    }
    @When("I Verify that enter information  {string} is visible")
    public void iVerifyThatEnterInformationIsVisible(String info) {
    	String userEnterInformationMessage = purchaseOrder. getTheEnterAccountInformationMsg(info);
    	System.out.println("the adress details  is " + userEnterInformationMessage);
    	Assert.assertTrue(userEnterInformationMessage.equals(info));
    }
    @When("I verify  User is on the registration page")
    public void iVerifyUserIsOnTheRegistrationPage() {
    	String currentTitle3 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle3);
	    if( currentTitle3.equals("Registration page")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I select User title Mrs")
    public void iSelectUserTitleMrs() {
    	purchaseOrder.clickOnTheTitle();
    }
    @When("I fill User fills in the following details:")
    public void iFillUserFillsInTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    	 Map <String, String> userDetails = dataTable.asMap(String.class, String.class);
         
         String name = userDetails.get("Name");
         String password = userDetails.get("Password");
         purchaseOrder.fillTheFirstName(name);
         
         purchaseOrder.fillThePassWordInformation(password);
    }
    @When("I select day of birth {string}")
     public void iSelectDayOfBirth(String DayofBirth) {
         purchaseOrder.selectDayOfBirth (DayofBirth);
     }
 	@When("I select month of birth {string}")
 	 public void iSelectMonthOfBirth (String MonthofBirth) {
 	     purchaseOrder.selectTheMonthOfBirth (MonthofBirth);
 	}
 	@When("I select year of birth {string}")
 	 public void iSelectYearOfBirth(String YearofBirth) {
 	     purchaseOrder.selectTheYearOfBirth (YearofBirth);
    }
    @When("I select the sign up for our newsletter checkbox")
    public void iSelectTheSignUpForOurNewsletterCheckbox() {
    	purchaseOrder.clickOnTheNewsLetters();
    }
    @When("I select the receive special offers from our partners checkbox")
    public void iSelectTheReceiveSpecialOffersFromOurPartnersCheckbox() {
    	purchaseOrder.clickOnTheSPcialOffer();
    }
    @When("I verify that the {string} checkbox checked")
    public void iVerifyThatTheCheckboxChecked(String newlettersmsg) {
    	purchaseOrder.clickOnTheSPcialOffer ();
    	String userNewsLettersMessage = purchaseOrder.getTheNewsLettersMsg (newlettersmsg);
    	System.out.println("the checkbox  " + userNewsLettersMessage + "is selected ");
    	Assert.assertTrue(userNewsLettersMessage.contains(newlettersmsg));
    }
    @When("I verify that the {string} checkbox")
    public void iVerifyThatTheCheckbox(String specialoffermsg) {
    	String userSpecialOffersMessage = purchaseOrder.getSpecialOfferMsg(specialoffermsg ) ;
    	System.out.println("the checkbox " + userSpecialOffersMessage + "is selected");
    	//Assert.assertTrue(userSpecialOffersMessage.equals(specialoffermsg));
	}
    @When("I verify that I m on the registration page")
    public void iVerifyThatIMOnTheRegistrationPage() {
    	String currentTitle4 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle4);
	    if( currentTitle4.equals("Automation Exercise - Signup")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I fill the registration form with the following details:")
    public void iFillTheRegistrationFormWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    	Map<String, String> registrationDetails = dataTable.asMap(String.class, String.class);
    	 	 
        String firstNameInfo = registrationDetails.get("FirstName");
        String lastNameInfo = registrationDetails.get("LastName");
        String companyName = registrationDetails.get("Company");
        String currentAddress = registrationDetails.get("Address");
        String secondAddress = registrationDetails.get("Address2");
        String city = registrationDetails.get("City");
        String state = registrationDetails.get("State");
        String zipCode = registrationDetails.get("Zipcode");
        String phoneNumber = registrationDetails.get("MobileNumber");
        
        purchaseOrder.fillTheFirstNameInformation(firstNameInfo);
        purchaseOrder.fillTheLastNameInformation(lastNameInfo);
        purchaseOrder.fillTheCompanyNameInformation(companyName);
        purchaseOrder.fillTheCurrentAddressInformation(currentAddress);
        purchaseOrder.fillTheSecondAddressInformation(secondAddress);
        purchaseOrder.fillTheStateInformation(state);
        purchaseOrder.fillTheCityInformation(city);
        purchaseOrder.fillTheZipCodeInformation(zipCode);
        purchaseOrder.fillTheTelephoneNumberInformation(phoneNumber);
    }
    @When("I select the country {string}")
	 public void iSelectTheCountry (String Coutry) {
    	purchaseOrder.selectTheCountry (Coutry);
    }
    @When("I click on the Create Account button")
    public void iClickOnTheCreateAccountButton() {
    	purchaseOrder.clickTheONAccountButton ();
    }
    @When("I Verify account created {string} is visible")
    public void iVerifyAccountCreatedIsVisible(String accountcreatedmessage) {
    	String accountCretedMessage = purchaseOrder.getTheAccountCreatedMsg(accountcreatedmessage) ;
    	System.out.println("the account information is " + accountCretedMessage);
        Assert.assertTrue(accountCretedMessage.contains(accountcreatedmessage));
    }
    @When("I Click on the Continue buttons")
    public void iClickOnTheContinueButtons() {
    	purchaseOrder.clickOnTheContinueButton();
    }
    @When("I Verify {string} at top")
    public void iVerifyAtTop(String loginmessage) {
    	String userLoginMessage = purchaseOrder.getTheLoginMessage(loginmessage);
    	System.out.println("the adress details  is " + userLoginMessage);
    	Assert.assertTrue(userLoginMessage.equals(loginmessage));
    }
    @When("I Click on the Delete Account button")
    public void iClickOnTheDeleteAccountButton() {
    	purchaseOrder.clickOnTheDeleteButton();
    }
    @When("I Verify the message {string} is visible")
    public void iVerifyTheMessageIsVisible(String deletemessage) {
    	purchaseOrder.getThedeleteMessage( deletemessage );
    }
    @Then("I click on Continues button")
    public void iClickOnContinuesButton() {
    	purchaseOrder.clickOnTheContinueDeleteButton();
    }
}
