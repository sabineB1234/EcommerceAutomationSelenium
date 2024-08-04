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

public class SearchProductStepDefinitions extends CommonMethods{

	public SearchProductPage  searchProduct = new SearchProductPage ();
	public WebDriver driver ;
    public  SearchProductStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, SearchProductPage.class);
    }
    
    @Given("I navigate to url to search product")
    public void iNavigateToURLToSearchProduct() throws InterruptedException, IOException {
    	super.openURLWithConfigFile("Url");
    	
    	    }
    @When("I click on products button")
    public void iClickOnProductsButton() throws InterruptedException {  
    	searchProduct.clickOnProductsButton();	
    }
   
	@When("I verify user is navigated to all products page successfully")
    public void iVerifyUserIsNavigatedToAllProductsPageSuccessfully() {
		String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
    }
    @When("I enter product name in search input {string}")
    public void iEnterProductNameInSearchInput(String productinput) {
    	searchProduct.fillProductInSearchInput(productinput);
    }
    @When("I click on search button")
    public void iClickSignUpButton() {
    	searchProduct.clickonProductSearchInput();
    }
    @When("I Verify that search product {string} is visible")
    public void iVerifyThatSearchProductIsVisible (String searchproductsmsg) {
	 String searchProductMessage = searchProduct.getSearchProductsMsg(searchproductsmsg);
	 System.out.println("the account information is " + searchProductMessage);
	 Assert.assertTrue(searchProductMessage.contains(searchproductsmsg));
    }
    @Then("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
    	String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	   	if( currentTitle1.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	   	driver.quit();
    }
    
}
