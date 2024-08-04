package ecommerceProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utiles.CommonMethods;
import utiles.Setup;

public class ContactUsStepDefinition extends CommonMethods {

	public ContactUsPage  contactUsPage = new ContactUsPage ();
	public WebDriver driver ;
    public  ContactUsStepDefinition () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, ContactUsPage.class);
    }
	
	@Given("I navigate to URL to contact consumer service")
	public void iNavigateToURLToContactConsumerService() throws IOException {
		super.openURLWithConfigFile("url1");
	}
	@When("I click on contact us button")
	public void iClickOnContactUsButton() throws InterruptedException, IOException {
		contactUsPage.clickOnContactUsButton();
	}
	@When("I verify user is navigate to CUSTOMER SERVICE - CONTACT US page successfully")
	public void iVerifyUserIsNavigateToCUSTOMERSERVICECONTACTUSPageSuccessfully() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("Contact us - My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
	}
	@When("I verify that {string} is visible CONTACT US")
	public void iVerifyThatIsVisibleCONTACTUS(String customermsg) {
		String customerMessage = contactUsPage.getCustomerServiceMessage();
		System.out.println("the account information is " + customerMessage);
		Assert.assertTrue(customerMessage.contains(customermsg));
	}
	@When("I verify that subject Heading {string} is visible on contact us page")
	public void iVerifyThatSubjectHeadingIsVisibleOnContactUsPage(String sendamsg) {
		String customerSendMessage = contactUsPage.getSendMessage();
		System.out.println("the account information is " + customerSendMessage);
		Assert.assertTrue(customerSendMessage.contains(sendamsg));
	}
	@When("I select Subject Heading {string}")
	public void iSelectSubjectHeading(String subjecthealding) {
		contactUsPage.selectSubjectHealding(subjecthealding);
	}
	@When("I verify that email address {string} is visible on CONTACT US page")
	public void iVerifyThatEmailAddressIsVisibleOnCONTACTUSPage(String emailtitle) {
		String adressEmailMessage = contactUsPage.getAdressEmailTitle();
		System.out.println("the account information is " + adressEmailMessage);
		Assert.assertTrue(adressEmailMessage.contains(emailtitle));
	}
	@When("I enter the correct email address {string} on contact us  page")
	public void iEnterTheCorrectEmailAddressOnContactUsPage(String email) {
		contactUsPage.fillTheAdressMail(email);
		
	}
	@When("I enter the text order reference {string}")
	public void iEnterTheTextOrderReference(String orderreferancemsg) {
		contactUsPage.fillOrderRferanceMessage(orderreferancemsg);
	}
	@When("I select attach file {string}")
	public void iSelectAttachFile(String choosefile) {
		contactUsPage.chooseFile(choosefile);
	}
	@When("I enter the text message {string}")
	public void iEnterTheTextMessage(String customerservicesend) {
		contactUsPage.fillCustomerServiceSend(customerservicesend);
	}
	@When("I click on send button on contact us page")
	public void iClickOnSendButtonOnContactUsPage() {
		contactUsPage.clickOnSendButton();
	}
	@When("I verify success message {string} thank you")
	public void iVerifySuccessMessageThankYou(String successendamsg) {
		String successSendMessage = contactUsPage.getSuccesSendMessage();
		System.out.println("the account information is " + successSendMessage);
		Assert.assertTrue(successSendMessage.contains(successendamsg));
	}
	@When("I click on the home button")
	public void iClickOnTheHomeButton() {
		contactUsPage.clickOnHomeButton();
	}
	@Then("I verify that home page is visible successfully")
	public void iVerifyThatHomePageIsVisibleSuccessfully() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
        driver.quit();
	} 
}
