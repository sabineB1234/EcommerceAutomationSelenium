package koorsAutomation;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utiles.CommonMethods;
import utiles.Setup;

public class AddStudentStepDefinition extends CommonMethods {

	public AddStudentPage  AddStudent = new AddStudentPage ();
	public WebDriver driver ;
    public AddStudentStepDefinition () {
    super ();
    driver = Setup.driver;
    PageFactory.initElements (driver, AddStudentPage.class);
    }

	@Given("I am on the director login page")
	public void iAmOnTheDirectorLoginPage() throws IOException {
		super.openURLWithConfigFile("Url2");   
	}
	@When("I enter the email {string}")
	public void iEnterTheEmail(String email) {
		AddStudent.fillEmail(email);	    
	}
	@When("I enter the password {string}")
	public void iEnterThePassword(String password) {
		AddStudent.fillPassWord (password);   
	}
	@Then("I click on the login buttonssss")
	public void iClickOnTheLoginButton() {
		AddStudent.loginButtonClick();	    
	}
	@When("I am on Activity page")
	public void iAmOnActivityPage() {
		String currentTitle1 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle1);
        if( currentTitle1.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    } 
	}
	@When("I click on the student button")
	public void iClickOnTheStudentButton() {
		AddStudent.StudentButtonClick ();	    
	}
	@When("I click on add a student button")
	public void iClickOnAddAStudentButton() {
		AddStudent.loginInviterEtudiantClick ();    
	}
	@Given("I click on inviter button")
	public void iClickOnInviterButton() throws InterruptedException {
		AddStudent.inviterButtonClick ();    
	}
	@Given("I fill last name student {string}")
	public void iFillLastNameStudent(String lastname) {
		AddStudent.fillTheLastNameInformation (lastname);	  
	}
	@When("I fill first name student {string}")
	public void iFillFirstNameStudent(String firstname) {
		AddStudent.fillTheFirstNameInformation (firstname);	    
	}
	@When("I fill e-mail address student {string}")
	public void iFillEMailAddressStudent(String adresseemail) {
		AddStudent.fillAdressEmailInformation (adresseemail);	    
	}
	@When("I click on the inviter button")
	public void iClickOnTheInviterButton() throws InterruptedException {
		AddStudent.validerButtonClick ();	    
	}
	@Then("I verify am on student page")
	public void iVerifyAmOnStudentPage() {
	
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }
        driver.quit();
	}
	@Given("I fill the last name student {string}")
	public void iFillTheLastNameStudent(String lastname1) {
		AddStudent.fillLastNameInformation (lastname1);	   
	}
	@When("I fill the first name student {string}")
	public void iFillTheFirstNameStudent(String firstname1) {
		AddStudent.fillFirstNameInformation (firstname1);	    
	}
	@When("I fill the e-mail address student {string}")
	public void iFillTheEMailAddressStudent(String adresseemail1) {
		AddStudent.fillTheAdressEmailInformation ( adresseemail1) ;  
	}
	@When("I click on cancel button")
	public void iClickOnCancelButton() throws InterruptedException {
		AddStudent.annulerButtonClick();	    
	}
	@Then("I verify I am on the student page")
	public void iVerifyIAmOnTheStudentPage() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }	 
        driver.quit();
	}
	@Given("I enter last name student {string}")
	public void iEnterLastNameStudent(String lastname2) {
		AddStudent.fillLastNameInformation2 (lastname2);	    
	}
	@When("I enter first name student {string}")
	public void iEnterFirstNameStudent(String firstname2) {
		AddStudent.fillFirstNameInformation2 (firstname2);	    
	}
	@When("I enter e-mail address student {string}")
	public void iEnterEMailAddressStudent(String adresseemail2) {
		AddStudent.fillTheAdressEmailInformation2 (adresseemail2);	    
	}
	@When("I click on delete button")
	public void iClickOnDeleteButton() throws InterruptedException {
		AddStudent.supprimerButtonClick();	    
	}
	@Then("I verify that I am on student page")
	public void iVerifyThatIAmOnStudentPage() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    }	
        driver.quit();
	}
	@Given("I enter the last name student {string}")
	public void iEnterTheLastNameStudent(String lastname3) {
		AddStudent.fillLastNameInformation3 (lastname3);	  
	}
	@When("I enter the first name student {string}")
	public void iEnterTheFirstNameStudent(String firstname3) {
		AddStudent.fillFirstNameInformation3 (firstname3);	    
	}
	@When("I enter the e-mail address student {string}")
	public void iEnterTheEMailAddressStudent(String adresseemail3) {
		AddStudent.fillTheAdressEmailInformation3 (adresseemail3);
	}
	
	@When("I click on the invite buttons")
	public void iClickOnTheInviteButtons() throws InterruptedException {
		AddStudent.validerButtonClick ();	   
	}

	@When("I verify text {string} on login koors page")
	public void iVerifyTextOnLoginKoorsPage(String expectedErrorMessage) {
		
	    String actualErrorMessage;
        if (expectedErrorMessage.contains("nom")) {
            actualErrorMessage = AddStudent.getNameErrorMsg();  
        } 
        
        else if (expectedErrorMessage.contains("prenom")) {
            actualErrorMessage = AddStudent.getFirstnameErrorMsg();  
        } 
        
        else {
            actualErrorMessage = AddStudent.getEmailErrorMsg();
        }

        System.out.println("The error message is: " + actualErrorMessage);
        Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
    }

	@Then("I verify that I am on the student page")
	public void iVerifyThatIAmOnTheStudentPage() {
		String currentTitle = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle);
        if( currentTitle.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" uptotestG2");
    	    }	 
        driver.quit();
	}
	@Given("I click on importer une liste button")
	public void iClickOnImporterUneListeButton() {
		AddStudent.StudentImportFileButtonClick ();  
	}
	@When("I verify the text {string} on ajouter un etudiant page")
	public void iVerifyTheTestOnAjouterUnEtudiantPage(String importerlistmessage) {
		String imprtListMessage = AddStudent.getImportListMsg();
		System.out.println("the account information is " + imprtListMessage);
		Assert.assertTrue(imprtListMessage.contains(importerlistmessage));
	}
	
	private static final String filePath = "/Users/nadine/template.xlsx";
	
	@When("I click on select file button and choose file")
	public void iClickOnSelectFileButtonAndChooseFile() throws AWTException {
		AddStudent.SelectStudentImportFileButtonClick();
		AddStudent.testFileUpload(filePath);
	}
	@When("I click on checkbox consent")
	public void iClickOnCheckboxConsent() {
		AddStudent.selectConsentCheckBoxButton ();
	}
	@When("I click on continue button")
	public void iClickOnContinueButton() throws InterruptedException {
		AddStudent.continuerButtonClick ();
	}
	@When("I verify number of student {string}")
	public void iVerifyNomberOfStudent(String numberstudentlist) {
		String numberStudentList = AddStudent.getNumbuerStudentsListMsg();
		System.out.println("the account information is " + numberStudentList);
		Assert.assertTrue(numberStudentList.contains(numberstudentlist));
	}
	@When("I click on send invitations button")
	public void iClickOnSendInvitationsButton() throws InterruptedException {
		AddStudent.envoyerInvitationsButtonClick ();
	}
	@When("I click on confirm and send button")
	public void iClickOnConfirmAndSendButton() throws InterruptedException {
		AddStudent.confirmerButtonClick ();
	}
	@Then("I verify that I am on student page to add students")
	public void iVerifyThatIAmOnStudentPageToAddStudents() {
		String currentTitle2 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle2);
        if( currentTitle2.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    } 
	}
	@Given("I click on importer une liste button to cancil")
	public void iClickOnImporterUneListeButtonToCancil() {
		AddStudent.StudentImportFileButtonClick ();
	}
	@When("I verify the import list text {string} on ajouter un etudiant page")
	public void iVerifyTheImportListTextOnAjouterUnEtudiantPage(String importlistmessage) {
		String importListmessage = AddStudent.verifyImprtListMsg();
		System.out.println("the account information is " + importListmessage);
		Assert.assertTrue(importListmessage.contains(importlistmessage));
	}
	@When("I click on continue button to cancil")
	public void iClickOnContinueButtonToCancil() throws InterruptedException {
		AddStudent.continuerButtonClick ();
	}
	@When("I verify the file text {string} to cancil")
	public void iVerifyTheFileTextToCancil(String selectfilemessage) {
		String selectFileMessage = AddStudent.selectFileMsg();
		System.out.println("the account information is " + selectFileMessage);
		Assert.assertTrue(selectFileMessage.contains(selectfilemessage));
	}
	@When("I verify the consent text {string}")
	public void iVerifyTheConsentText(String consentmessage) {
		String consentMessage = AddStudent.consentMsg();
		System.out.println("the account information is " + consentMessage);
		Assert.assertTrue(consentMessage.contains(consentmessage));
	}
	@When("I click on cancil button to cancil student list")
	public void iClickOnCancilButtonToCancilStudentList() {
		AddStudent.annulerconcilButtonClick ();
	}
	@Then("I verify that I am on student page to cancil")
	public void iVerifyThatIAmOnStudentPageToCancil() {
		String currentTitle3 = driver.getTitle(); 
       	System.out.println("the current URL is " + currentTitle3);
        if( currentTitle3.equals("uptotestG2")) {
    	    System.out.println(" succeful");
    	    } else {
    	    System.out.println(" failed");
    	    } 
        driver.quit();
	}
}

		   
		





