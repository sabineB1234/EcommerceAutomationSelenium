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

public class RemoveProductSTepDefinitions extends CommonMethods {

	public RemoveProductPage  RemoveProduct = new RemoveProductPage ();
	public WebDriver driver ;
    public  RemoveProductSTepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, RemoveProductPage.class);
    }


	@Given("User navigate to the Automation Exercise web site to add and move product")
	public void userNavigateToTheAutomationExerciseWebSiteToAddAndMoveProduct() throws IOException  {
		super.openURLWithConfigFile("url");
	}
	@When("User clicks on the Product buttons to access to all product")
	public void userClicksOnTheProductButtonsToAccessToAllProduct() throws InterruptedException  {
		RemoveProduct.clickOnProductsButton();
	}
	@When("User verifies being navigated to All Products page with success")
	public void userVerifiesBeingNavigatedToAllProductsPageWithSuccess() {
		String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User enters saree {string} in the search input field to get to the products page")
	public void userEntersSareeInTheSearchInputFieldToGetToTheProductsPage(String productinput) {
		RemoveProduct.enterSareeProductInSearchProduct(productinput);
	}
	@When("User clicks on the searches buttonss to get to the products page")
	public void userClicksOnTheSearchesButtonssToGetToTheProductsPage() {
		RemoveProduct.clickonProductsSearchProductButton();
	}
	@When("User move to saree product and click")
	public void userMoveToSareeProductAndClick() {
		RemoveProduct.moveAndClickToBlueTopProduct();
	}
	@When("User verifies being on the saree products page")
	public void userVerifiesBeingOnTheSareeProductsPage() {
		String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	    if( currentTitle1.equals("Automation Exercise - Product Details")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User clicks on the Increase Quantity button {string} of saree product")
	public void userClicksOnTheIncreaseQuantityButtonOfSareeProduct(String input) {
		RemoveProduct.clickOnIncreasedButton(input );
	}
	@When("User clicks on the Add to Cart button of saree product")
	public void userClicksOnTheAddToCartButtonOfSareeProduct() {
		RemoveProduct.clickOnAddProductsButtons();
	}
	@When("User clicks on the cart button to proceed of saree product")
	public void userClicksOnTheCartButtonToProceedOfSareeProduct() {
		RemoveProduct.ClickOnViewCartToProceedButton();
	}
	@When("User verifies being on the recap product page")
	public void userVerifiesBeingOnTheRecapProductPage() {
		String currentTitle3 = driver.getTitle(); 
	   	System.out.println("Automation Exercise - Checkout" + currentTitle3);
	    if( currentTitle3.equals("Shopping Car")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User verifies that message saree silk is {string}")
	public void UserVerifiesThatHeIsOnTheRecapProduct(String sareesilkproductsmsg) {
		String userMessage = RemoveProduct.getSareeSilkProductMessage();
	 	Assert.assertTrue(userMessage.contains(sareesilkproductsmsg));
	}
	@When("User clicks on the X to remove product")
	public void userClicksOnTheXToRemoveProduct() {
		RemoveProduct.clickOnRemoveProductButton();
	}
	@Then("user clicks on the homes button")
	public void userClicksOnTheHomesButton() {
		RemoveProduct.ClickOnHomeButton();
		driver.quit();
	}




}
