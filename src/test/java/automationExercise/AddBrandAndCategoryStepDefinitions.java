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

public class AddBrandAndCategoryStepDefinitions extends CommonMethods{


		public AddBrandAndCategoryPage  addBrandAndCategory = new AddBrandAndCategoryPage ();
		public WebDriver driver ;
	    public  AddBrandAndCategoryStepDefinitions () {
	    super ();
	    driver = Setup.driver;
	    PageFactory.initElements (driver, AddBrandAndCategoryPage.class);
	    }
	    
	   
	    @Given("I navigate to url to view categories and brands")
	    public void iNavigateToUrlToViewCategoriesAndBrands() throws IOException {
	     super.openURLWithConfigFile("Url");
	    }
	    @When("I click on the Products button")
	    public void iClickOnTheProductsButton() {
	    	addBrandAndCategory.clickOnProductsButton();
	    }
	    @When("I verify user is navigate to all brands product page successfully")
	    public void iVerifyUserIsNavigateToAllBrandsProductPageSuccessfully() {
	    	String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("Automation Exercise - All Products")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
	    }
	    @When("I verify that {string} are visible on left side bar")
	    public void iVerifyThatAreVisibleOnLeftSideBar(String categorysmsg) {
	    	String BrandMessage = addBrandAndCategory.getCategoryMessage( );
	    	System.out.println("the title information is " + BrandMessage);
	    	Assert.assertTrue(BrandMessage.contains(categorysmsg));
	    }
	    @When("I click on women brand name")
	    public void iClickOnWomenBrandName() {
	    	addBrandAndCategory.clickOnWomenButton();
	    }
	    @When("I click on any brand name")
	    public void iClickOnAnyBrandName() {
	    	addBrandAndCategory.clickOnDressButton();
	    }
	    
	    @When("I verify that user is navigated to brand page and brand products are displayed")
	    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
	    	String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("WOMEN - DRESS PRODUCTS")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
	    }
	    @When("on left side bar, click on any other brand link")
	    public void onLeftSideBarClickOnAnyOtherBrandLink() {
	    	addBrandAndCategory.clickOnMadameButton();
	    }
	    @Then("I verify that user is navigated to that brand page and can see products")
	    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
	    	String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("BRAND - MADAME PRODUCTS")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
		    driver.quit();
	    }
}
