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



	public class AddToWishListStepDefinitions extends CommonMethods{

		
		public AddToWishListPage  addToWishListPage = new AddToWishListPage ();
		public WebDriver driver ;
	    public  AddToWishListStepDefinitions () {
	    super (); 
	    driver = Setup.driver;
	    PageFactory.initElements (driver, AddToWishListPage.class);
	    
	    
	    } 
		
		@Given("I navigate to url to add to wish list")
		public void iNavigateToUrlToAddProductAddToWishList() throws IOException {
			super.openURLWithConfigFile("url1");
		}
		@When("I move the mouse to the dress button")
		public void iMoveTheMouseToTheDressButton() throws InterruptedException, IOException {
			addToWishListPage.moveToWomenButton();
		}
		@When("I move the mouse to SUMMER DRESSES button")
		public void iMoveTheMouseToSUMMERDRESSESButton() {
			addToWishListPage.moveToTShirtButton();
		}
		@When("I click on SUMMER DRESSES button")
		public void iClickOnSUMMERDRESSESButton() {
			addToWishListPage.clickOnTShirtButton();
		}
		@When("I verify I m on T-SHIRTS page is visible")
		public void iVerifyIMOnTSHIRTSPageIsVisible() {
			String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("Summer Dress - My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
		}
		@When("I move the mouse to the second product")
		public void iMoveTheMouseToTheSecondProduct() {
			addToWishListPage.moveToPrintedSummerDress();
		}
		@When("I click on more SUMMER DRESSES button")
		public void iClickOnMoreSUMMERDRESSESButton() {
			addToWishListPage.clickOnMoreButtons();
		}
		@When("I verify that the page product is visible")
		public void andIVerifyThatThePageProductIsVisible() {
			String currentTitle = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle);
		    if( currentTitle.equals("Printed Summer Dress - My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
		}
		@When("I select the color blue")
		public void iSelectTheColorBlue() {
			addToWishListPage.clickOnColorButton();
		}
		@When("I select size {string}")
		public void iSelectSize(String sizebutton) {
			addToWishListPage.selectSizeButton(sizebutton);
		}
		@When("I select the color yellow")
		public void iSelectTheColorYellow() {
			addToWishListPage.clickOnColorButton();
		}
		
		@When("I verify the price of product {string}")
		public void iVerifyThePriceOfProduct(String pricedressinfo) {
			String priceDressMessage = addToWishListPage.getPriceDressMsg();
			System.out.println("the account information is " + priceDressMessage);
			Assert.assertTrue(priceDressMessage.contains(pricedressinfo));
		}
		@When("I increase the product quantity")
		public void iIncreaseTheProductQuantity() {
			addToWishListPage.clickOnIncreaseButton();
		}
		@When("I click on the add to cart button")
		public void iClickOnTheAddToCartButton() {
			addToWishListPage.clickOnAddToCartButton();
		}
		@When("I click on proceed to checkout button")
		public void iClickOnProceedToCheckoutButton() {
			addToWishListPage.clickOnPorceedButton();
		}
		@When("I verify that the page SHOPPING-CART SUMMARY is visible")
		public void iVerifyThatThePageSHOPPINGCARTSUMMARYIsVisible() {
			String currentTitle1 = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle1);
		    if( currentTitle1.contains("Order - My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
		}
		@When("I verify the total price of the product {string}")
		public void iVerifyTheTotalPriceOfTheProduct(String pricetotaldressinfo) {
			String totalPriceDressMessage = addToWishListPage.getTotalPriceDressMsg();
			System.out.println("the account information is " + totalPriceDressMessage);
			Assert.assertTrue(totalPriceDressMessage.contains(pricetotaldressinfo));
		}
		@When("I click on proceed to checkouts button")
		public void iClickOnProceedToCheckoutsButton() {
			addToWishListPage.clickOnProceedToCheckOutButton();
		}
		
		@Given("I fill authentication details:")
		public void iFillAuthenticationDetails(io.cucumber.datatable.DataTable dataTable) {
	     Map<String, String> authenticationDetails = dataTable.asMap(String.class, String.class);
			
			String email = authenticationDetails.get("Email");
	        String password = authenticationDetails.get("Password");
	       
	        addToWishListPage.fillAdressMailInformation (email);
	        addToWishListPage.fillPassWordInformation (password); 
		}
		@When("I verify that the page authentications is visible")
		public void iVerifyThatThePageAuthenticationsIsVisible() {
			String currentTitleM = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitleM);
		    if( currentTitleM.contains("AUTHENTICATION")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
		}
		@Then("I click on sign in button")
		public void iClickOnSignInButton() {
			addToWishListPage.clickOnSingnInButton();
		    }
		
		@When("I verify that the page ADDRESSES is visible")
		public void iVerifyThatThePageADDRESSESIsVisible() {
			String currentTitle3 = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle3);
		    if( currentTitle3.equals("Order - My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
			    }
		@When("I click on proceeds to checkouts buttons")
		public void iClickOnProceedsToCheckoutsButtons() {
			addToWishListPage.clickOnproceedCheckoutButton();
		}
		@When("I verify the price oh delivery {string}")
		public void iVerifyThePriceOhDelivery(String pricedeliveryinfo) {
			String priceDeliveryriceMessage =addToWishListPage.getPriceDeliveryMsg();
			System.out.println("the price delivrery is " + priceDeliveryriceMessage);
			Assert.assertTrue(priceDeliveryriceMessage.contains(pricedeliveryinfo));
		}
		@When("I select agree term service")
		public void iSelectAgreeTermService() {
			addToWishListPage.clickOnAgreeDelivrery();
		}
		@When("I clicked on proceeds to checkouts buttons")
		public void iClickedOnProceedsToCheckoutsButtons() {
			addToWishListPage.clickOnproceedCheckoutedButton();
		}
		@When("I click on pay by bank wire")
		public void iClickOnPayByBankWire() {
			addToWishListPage.clickOnPayByBankButton();
		}
		@When("I verify that the page ORDER SUMMARY is visible")
		public void iVerifyThatThePageORDERSUMMARYIsVisible() {
			String currentTitle4 = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle4);
		    if( currentTitle4.equals("My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
			    }
		@When("I click on I confirm my order")
		public void iClickOnIConfirmMyOrder() {
			addToWishListPage.clickOnIConfirMyOrderButton();
		}
		@When("I verify that the page ORDER CONFIRMATION is visible")
		public void iVerifyThatThePageORDERCONFIRMATIONIsVisible() {
			String currentTitle5 = driver.getTitle(); 
		   	System.out.println("the current URL is " + currentTitle5);
		    if( currentTitle5.equals("Order confirmation - My Shop")) {
			    System.out.println(" succeful");
			    } else {
			    System.out.println(" failed");
			    }
			    }
		@Then("I verify {string} on order confirmation page")
		public void iVerifyOnOrderConfirmationPage(String confirmordermessage) {
			String confirmOrderMessage =addToWishListPage.getConfirmOrderMsg();
			System.out.println("the account information is " + confirmOrderMessage);
			Assert.assertTrue(confirmOrderMessage.contains(confirmordermessage));
			driver.quit();
		}
		}



