package EdisacProjet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utiles.CommonMethods;
import utiles.Setup;

public class SearchAddToPanierEdisacStepDef extends CommonMethods{

	public SearchAddToPanierEdisacPage  SearchAddToPanier = new SearchAddToPanierEdisacPage ();
	public WebDriver driver ;
    public SearchAddToPanierEdisacStepDef () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, SearchAddToPanierEdisacPage.class);
    }

    @Given("User navigates to EDISAC web site to add products to mon panier")
    public void userNavigatesToEDISACWebSiteToAddProductsToMonPanier() throws IOException {
    	super.openURLWithConfigFile("Url3");
    }
    @When("User move to search input on the EDISAC page")
    public void userMoveToSearchInputOnTheEDISACPage() throws InterruptedException {
    	SearchAddToPanier.moveToSearchProduct ();
    }
    @When("User clicks on lancel button and sends {string} on the EDISAC page")
    public void userClicksOnLancelButtonAndSendsOnTheEDISACPage(String productinput) throws InterruptedException, IOException {
    	SearchAddToPanier.clickonProductsSearchProduct(productinput);
    }
    @When("User move to {string} on the EDISAC page")
    public void UserMoveToOnTheEDISACPagegetFiltrerPrixMessage( String pricesmsg ) throws InterruptedException, IOException {
    	SearchAddToPanier.getFiltrerPrixMessage();
    }
    @When("User drags and drops to {string} on the EDISAC page")
    public void UserDragsAndDropsToOnTheEDISACPage(String quantity) {
    	SearchAddToPanier.DragAndDropPrice() ;
    }
    @When("User move to Sac bandoulière zoé LANCEL product")
    public void userMoveToSacBandoulièreZoéLANCELProduct() {
    	SearchAddToPanier.moveToProductOne();
    }
    @When("User click on Sac bandoulière zoé LANCEL add button as the first article")
    public void userClickOnSacBandoulièreZoéLANCELAddButtonAsTheFirstArticle() {
    	SearchAddToPanier.clickOnProductOne();
    }
    @When("User move to Sac bandoulière Billie cuir LANCEL")
    public void userMoveToSacBandoulièreBillieCuirLANCEL() {
    	SearchAddToPanier.moveToProductTwo();
    }
    @When("User click on Sac bandoulière Billie cuir LANCEL as the second article")
    public void userClickOnSacBandoulièreBillieCuirLANCELAsTheSecondArticle() {
    	SearchAddToPanier.clickOnProductTwo();
    }
    @When("User clicks on delete button on the EDISAC page")
    public void userClicksOnDeleteButtonOnTheEDISACPage() {
    	SearchAddToPanier.clickDeleteButton();
    }
    @When("User clicks on mon panier button to verify all products")
    public void userClicksOnMonPanierButtonToVerifyAllProducts() {
    	SearchAddToPanier.clickOnMonPanierButton();
    }
    @When("User verifies being on the Shopping Lancel products page")
    public void userVerifiesBeingOnTheShoppingLancelProductsPage() {
    	String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("User clicks on the Increase Quantity button {string} of Sac bandoulière roxane")
    public void userClicksOnTheIncreaseQuantityButtonOfSacBandoulièreRoxane(String quantity) {
    	SearchAddToPanier.clickOnQuantityProduct(quantity);
    }
    @When("User verifies total price {string} on the Shopping products page")
    public void userVerifiesTotalPriceOnTheShoppingProductsPage(String totalpricesmsg) {
    	SearchAddToPanier.getTotalPriceMessage();
    }
    @When("User clicks on the commander button")
    public void userClicksOnTheCommanderButton() {
    	SearchAddToPanier.ClickOnCommanderButton ();
    }
    @Then("User verifies being on authenfication page to log up")
    public void userVerifiesBeingOnAuthenficationPageToLogUp() {
    	String currentTitle2 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle2);
        if( currentTitle2.equals("My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
}
