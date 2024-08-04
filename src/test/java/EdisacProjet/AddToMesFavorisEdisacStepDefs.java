package EdisacProjet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utiles.CommonMethods;
import utiles.Setup;

public class AddToMesFavorisEdisacStepDefs extends CommonMethods {

	public AddToMesFavorisEdisacPage  AddToMesFavoris = new AddToMesFavorisEdisacPage ();
	public WebDriver driver ;
    public AddToMesFavorisEdisacStepDefs () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, AddToMesFavorisEdisacPage.class);
    }
    
    @Given("I navigate to url to add to mes favoris")
    public void iNavigateToUrlToAddToMesFavoris() throws IOException {
    	super.openURLWithConfigFile("Url3");
    }
    @When("I move the mouse to femmes button")
    public void iMoveTheMouseToFemmesButton() throws InterruptedException, IOException {
    	AddToMesFavoris.moveToWomenButton ();
    }
    @When("I move the mouse to sacs en bandoulieres button")
    public void iMoveTheMouseToSacsEnBandoulieresButton() {
    	AddToMesFavoris.moveToSacBandeliereButton ();
    }
    @When("I click on sacs en bandoulieres  button")
    public void iClickOnSacsEnBandoulieresButton() {
    	AddToMesFavoris.clickOnSacBandeliereButton ();
    }
    @When("I verify I m on sacs en bandoulieres page is visible")
    public void iVerifyIMOnSacsEnBandoulieresPageIsVisible() {
    	String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("Sac bandoulière femme sur Edisac.com")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
    }
    @When("I select the the brand lancaster")
    public void iSelectTheTheBrandLancaster() {
    	AddToMesFavoris.selectBrandLancaster();
    }
    @When("I select the matiere cuir")
    public void iSelectTheMatiereCuir() throws InterruptedException {
    	AddToMesFavoris.selectMatiereLancaster();
    }
    @When("I move the mouse to sacs en bandoulieres zoé cuir product")
    public void iMoveTheMouseToSacsEnBandoulieresZoéCuirProduct() throws InterruptedException {
    	AddToMesFavoris.moveMouseOverLancasterProduct1 ();
    }
    @When("I click on mes favories icon of sacs en bandoulieres zoé cuir product")
    public void iClickOnMesFavoriesIconOfSacsEnBandoulieresZoéCuirProduct() {
    	AddToMesFavoris.clickOnFavorisProduct1 ();
    }
    @When("I move the mouse to sacs en bandoulieres soft product")
    public void iMoveTheMouseToSacsEnBandoulieresSoftProduct() {
    	AddToMesFavoris.moveMouseOverLancasterProduct2 ();
    }
    @When("I click on mes favories icon of sacs en bandoulieres soft product")
    public void iClickOnMesFavoriesIconOfSacsEnBandoulieresSoftProduct() {
    	AddToMesFavoris.clickOnFavorisProduct2 ();
    }
    @When("I click on mes favoris button")
    public void iClickOnMesFavorisButton() {
    	AddToMesFavoris.clickOnIncreaseButton ();
    }
    @Then("I verify that the page of mes favoris is visible")
    public void iVerifyThatThePageOfMesFavorisIsVisible() {
    	String currentTitle1 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle1);
        if( currentTitle1.equals("My Shop")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
        driver.quit();
    }
}
