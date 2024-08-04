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


public class AddReviewProductStepDefinitions extends CommonMethods{

	public AddReviewOnProductPage  addReviewOnProduct = new AddReviewOnProductPage ();
	public WebDriver driver ;
    public  AddReviewProductStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, AddReviewOnProductPage.class);
    }
    
    
    @Given("I navigate to URL to add product")
    public void iNavigateToURLToAddProduct() throws IOException {
    	super.openURLWithConfigFile("Url");
    }
    @When("I click on the products button")
    public void iClickOnTheProductsButton() {
    	addReviewOnProduct.clickOnProductButton();
    }
    @When("I verify user is navigate to all product page successfully")
    public void iVerifyUserIsNavigateToAllProductPageSuccessfully() {
    	String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I click on view product button {string}")
    public void iClickOnViewProductButton(String string) {
    	addReviewOnProduct.clickONproductDress();
    }
    @When("I verify that {string} is visible")
    public void iVerifyThatIsVisible(String writereviewsmsg) {
    	String writeViewMessage = addReviewOnProduct.getWriteProductMessage();
    	System.out.println("the title information is " + writeViewMessage);
    	Assert.assertTrue(writeViewMessage.contains(writereviewsmsg));
    }
    @When("I enter name review {string}")
    public void iEnterNameReview(String yourname) {
    	addReviewOnProduct.sendYourName(yourname);
    }
    @When("I enter the correct email review {string}")
    public void iEnterTheCorrectEmailReview(String mail) {
    	addReviewOnProduct.sendAdressMail(mail);
    }
    @When("I enter the text review {string}")
    public void IEnterTheTextReview(String reviewmessage) {
        addReviewOnProduct.sendReviewMessage(reviewmessage);
    }
    	@When("I click on submits button")
    public void iClickOnSubmitsButton() {
    	addReviewOnProduct.clickOnSubmitButton();
    }
    @Then("I verify success message {string}")
    public void iVerifySuccessMessage(String string) {
      
    }   
}
