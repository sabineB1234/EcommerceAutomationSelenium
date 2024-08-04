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


public class ShoppingProductsStepDefinitions extends CommonMethods {
	public ShoppingProductsPage  shoppingProductsPage = new ShoppingProductsPage ();
	public WebDriver driver ;
    public  ShoppingProductsStepDefinitions () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, ShoppingProductsPage.class);
    }
	@Given("User navigates to the Automation Exercise web site")
	public void userNavigatesToTheAutomationExerciseWebSite() throws IOException {
		super.openURLWithConfigFile("Url");	
	}
	@When("User clicks on the Products button")
	public void userClicksOnTheProductsButton() throws InterruptedException {
		shoppingProductsPage.clickProductButton();
	}
	@When("User verifies being navigated to the All Products page successfully")
	public void userVerifiesBeingNavigatedToTheAllProductsPageSuccessfully() {
		String currentTitle = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle);
	    if( currentTitle.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User enters {string} in the search input field")
	public void userEntersInTheSearchInputField(String productinput) {
		shoppingProductsPage.enterProductInSearchProduct(productinput);
	}
	@When("User clicks on the search button")
	public void userClicksOnTheSearchButton() {
		shoppingProductsPage.clickonProductsSearchProduct();
	} 
	@When("User verifies that the search product {string} is visible")
	public void userVerifiesThatTheSearchProductIsVisible(String searchproductsmsg) {
	String searchProductMessage = shoppingProductsPage.getSearchProductsMessage();
	System.out.println("the account information is " + searchProductMessage);
    Assert.assertTrue(searchProductMessage.contains(searchproductsmsg));
	}
	@When("User verifies all the products related to the search are visible")
	public void userVerifiesAllTheProductsRelatedToTheSearchAreVisible() {
		String currentTitle1 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle1);
	    if( currentTitle1.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	//@When("User pass the mouse over  sleeveless dress product")
	//public void UserPassTheMouseOverSleevelessDressProduct() {
	@When("User move to sleeveless dress product")
	public void userUserMoveToSleevelessDressProduct() {
		shoppingProductsPage.moveToSleevelessDressProduct();
		}
	@When("User click on sleeveless dress add button as the first article")
	public void UserClickOnSleevelessDressAddButtonAsTheFirstArticle() {
		shoppingProductsPage.clickOnSleeveDressProduct();
		}
	@When("User click on continue button")
	public void userClickOnContinueButton () {
		shoppingProductsPage.clickOnContinueButton();
	}
	@When("User move to stylish product")
	public void UserMoveToStylishProduct() {
		shoppingProductsPage.moveToStaylishProduct();
	}
	@When("User click on stylish add button as the first article")
	public void UserClickOnStylishAddButtonAsTheFirstArticle() {
		shoppingProductsPage.clickOnStylishProduct();
	}
	@When("User clicks on the Cart Review button")
	public void userClicksOnTheCartReviewButton() {
		shoppingProductsPage.clickOnCartButton();
	}
	@When("User verifies being on the Shopping Cart page")
	public void userVerifiesBeingOnTheShoppingCartPage() {
	String currentTitle3 = driver.getTitle(); 
	System.out.println("the current URL is " + currentTitle3);
	    if( currentTitle3.equals("Shopping Cart")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	}
	@When("User clicks on the first article button")
	public void userClicksOnTheFirstArticleButton() {
		shoppingProductsPage.clickOnStylishDressProduct();
	}
	@When("User verifies being on the product page")
	public void userVerifiesBeingOnTheProductPage() {
		String currentTitle4 = driver.getTitle(); 
		System.out.println("the current URL is " + currentTitle4);
		    if( currentTitle4.equals("Automation Exercise - All Products")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
	}
	@When("User clicks on the Increase Quantity button {string}")
	public void userClicksOnTheIncreaseQuantityButton(String quantity) {
		shoppingProductsPage.clickOnQuantityProduct(quantity);
	}
	@When("User clicks on the Add to Cart button")
	public void userClicksOnTheAddToCartButton() {
		shoppingProductsPage.ClickOnAddProductButton();
	}
	@When("User clicks on the cart button to proceed")
	public void userClicksOnTheCartButtonToProceed() {
	shoppingProductsPage.clickOnCartButtonProduct();
	} 
	@When("User clicks on the Proceed to Checkout button")
	public void userClicksOnTheProceedToCheckoutButton() {
		shoppingProductsPage.clickOnPorceedToCheckOutButton();
	}
	@When("User verifies being on the shopping page")
	public void userVerifiesBeingOnTheShoppingPage() {
		String currentTitle5 = driver.getTitle(); 
		System.out.println("the current URL is " + currentTitle5);
		    if( currentTitle5.equals("Shopping Cart")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
	}
	@When("User clicks on the Login\\/Sign Up button to proceed with the purchase")
	public void userClicksOnTheLoginSignUpButtonToProceedWithThePurchase() {
		shoppingProductsPage.clickOnLoginInButton();
	}
	@Then("User verifies being on the home page after completing the purchase")
	public void userVerifiesBeingOnTheHomePageAfterCompletingThePurchase() {
		String currentTitle6 = driver.getTitle(); 
	   	System.out.println("the current URL is " + currentTitle6);
	    if( currentTitle6.equals("Automation Exercise - All Products")) {
		    System.out.println(" succeful");
		    } else {
		    System.out.println(" failed");
		    }
	    driver.quit();
	}
}
