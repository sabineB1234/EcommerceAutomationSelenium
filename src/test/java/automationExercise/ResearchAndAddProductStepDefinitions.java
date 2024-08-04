package automationExercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utiles.CommonMethods;
import utiles.Setup;



	public class ResearchAndAddProductStepDefinitions extends CommonMethods {
		public ResearchAndAddProductPage  ResearchAndAddProduct = new ResearchAndAddProductPage ();
		public WebDriver driver ;
	    public  ResearchAndAddProductStepDefinitions () {
	    super ();
	    driver = Setup.driver;
	    PageFactory.initElements (driver, ResearchAndAddProductPage.class);
	    }
	
	@Given("User navigates to the Automation Exercise web site to add product")
	public void userNavigatesToTheAutomationExerciseWebSiteToAddProduct() throws IOException {
		super.openURLWithConfigFile("Url");
	}
	@When("User clicks on the Products buttons")
	public void userClicksOnTheProductsButtons() throws InterruptedException {
		ResearchAndAddProduct.clickProductButton();
	}
	@When("User verifies being navigated to All Products page success")
	public void userVerifiesBeingNavigatedToAllProductsPageSuccess() {
		ResearchAndAddProduct.clickonProductsSearchProduct();
	}
	@When("User enters tops {string} in the search input field")
	public void userEntersTopsInTheSearchInputField(String productinput) {
		ResearchAndAddProduct.enterProductInSearchProduct(productinput);
	}
	@When("User clicks on the searches buttonss")
	public void userClicksOnTheSearchesButtonss() {
		String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	//@When("User verifies that the word search product {string} is visible")
	//public void userVerifiesThatTheWordSearchProductIsVisible(String searchproductsmsg) {
	//String searchProductMessage = ResearchAndAddProduct.getSearchProductsMessage(searchproductsmsg);
	//System.out.println("the account information is " + searchProductMessage);
	//Assert.assertTrue(searchProductMessage.contains(searchproductsmsg));
		
	@When("User move to tops  product and click")
	public void userMoveToTopsProductAndClick() {
		ResearchAndAddProduct.moveAndClickToBlueTopProduct();
	}
	@When("User verifies being on the products page")
	public void userVerifiesBeingOnTheProductsPage() {
		String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	    if( currentTitle1.equals("Automation Exercise - Product Details")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User clicks on the Increase Quantity button to {string}")
	public void userClicksOnTheIncreaseQuantityButtonTo(String input) {
		ResearchAndAddProduct.clickOnIncreaseButton(input);
	}
	@When("User verifies category product {string}")
	public void userVerifiesCategoryProduct(String categoryproductsmsg) {
		ResearchAndAddProduct.getCategoryProductMessage();
	}
	@When("User verifies price product {string}")
	public void userVerifiesPriceProduct(String priceproductsmsg) {
		ResearchAndAddProduct.getPriceProductMessage();
	}
	@When("User clicks on the Add to Carts buttons") 
	public void userClicksOnTheAddToCartsButtons() {
		ResearchAndAddProduct.ClickOnAddProductsButton();
	}
	@When("User clicks on the carts buttons to proceed to the next page")
	public void userClicksOnTheCartsButtonsToProceedToTheNextPage() {
		ResearchAndAddProduct.ClickOnViewCartButton();
	}
	@When("User verifies being on the shopping product page")
	public void userVerifiesBeingOnTheShoppingProductPage() {
		String currentTitle8 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle8);
	    if( currentTitle8.equals("Shopping Car")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User clicks on the buttons proceed to check out buttons")
	public void userClicksOnTheButtonsProceedToCheckOutButtons() {
		ResearchAndAddProduct.clickOnProceedCheckOutButton();
	}
	@When("User clicks on the sign up button to proceed with the shopping")
	public void userClicksOnTheSignUpButtonToProceedWithTheShopping() {
		ResearchAndAddProduct.ClickOnRegisterLoginButton();
	}
	@Then("User verifies being on the home page after complete shopping")
	public void userVerifiesBeingOnTheHomePageAfterCompleteShopping() {
		String currentTitleS= driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitleS);
	    if( currentTitleS.equals("Signup")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    driver.quit();
		    }
	}
	}

