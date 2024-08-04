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

public class SearchAndAddStepDefinitions extends CommonMethods{

	
	public SearchAndAddProductPage  SearchAndAddProduct = new SearchAndAddProductPage ();
	public WebDriver driver ;
    public  SearchAndAddStepDefinitions () {
    super ();  
    driver = Setup.driver;
    PageFactory.initElements (driver, SearchAndAddProductPage.class);
   
    }

	@Given("I navigate to url to search and add product")
	public void iNavigateToUrlToSearchandAddProduct() throws IOException {
		super.openURLWithConfigFile("url1");
	}
	@When("I move the mouse to women button")
	public void iClickOnWomenButton() throws InterruptedException, IOException {
		SearchAndAddProduct.moveToWomenButton();
	}
	@When("I move the mouse to EVENING DRESSES  button")
	public void iMoveTheMouseToEVENINGDRESSESButton() {
		SearchAndAddProduct.moveToDressEveningButton();
	}
	@When("I click on EVENING DRESSES  button")
	public void iClickOnEVENINGDRESSESButton() {
		SearchAndAddProduct.clickOnDressEveningButton();
	}
	@When("I get text of the first product {string}")
	public void iGetTextOfTheFirstProduct(String printeddressinfo) {
		String printDressMessage = SearchAndAddProduct.getPrintedDressMsg();
		System.out.println("the account information is " + printDressMessage);
		Assert.assertTrue(printDressMessage.contains(printeddressinfo));
	}
	@When("I enter the text product printed dress")
	public void iEnterTheTextProductPrintedDress() {
		SearchAndAddProduct.fillDressEveningButton();
	}
	@Then("I click on submits buttons")
	public void iClickOnSubmitsButtons() {
		SearchAndAddProduct.clickOnSearchButton();
		driver.quit();
	}
	
}
