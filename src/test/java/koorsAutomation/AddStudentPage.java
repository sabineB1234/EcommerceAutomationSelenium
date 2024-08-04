package koorsAutomation;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class AddStudentPage {

	
	final static String  EMAIL_ADRESS = "div.d-flex:nth-child(1) div.d-flex.justify-content-center.auth-details.px-4 div.d-flex.flex-column.align-items-center.w-100.auth-form.mx-5 div.d-flex.flex-column.align-items-center.w-100.mb-4 div.mb-3.w-100:nth-child(2) > input.form-control.input.text-default";
	final static String  PASS_WORD = "div.d-flex:nth-child(1) div.d-flex.justify-content-center.auth-details.px-4 div.d-flex.flex-column.align-items-center.w-100.auth-form.mx-5 div.d-flex.flex-column.align-items-center.w-100.mb-4 div.w-100:nth-child(3) div.input-form-control > input.form-control.input.text-default" ;
	final static String  LOGGED_BUTTON = "btn-cnx";
	
	final static String  STUDENT_BUTTON = "#step-Etudiants-navbar_director";
	final static String  INVITER_ETUDIANT_BUTTON = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/div[1]";
	
    final static String  INVITER_BUTTON = "btn-Tabs  me-3 d-flex align-items-center";
	final static String  NAME_INFORMATION = "div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-body.mb-3 div.row.justify-content-center div.col-md-10 div.row div.col-md-12.mt-4:nth-child(3) div.mb-4:nth-child(1) > input.form-control.input.text-default";
    final static String  FIRSTNAME_INFORMATION = "div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-body.mb-3 div.row.justify-content-center div.col-md-10 div.row div.col-md-12.mt-4:nth-child(3) div.mt-2.mb-4:nth-child(2) > input.form-control.input.text-default";
    final static String  ADRESS_EMAIL ="div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-body.mb-3 div.row.justify-content-center div.col-md-10 div.row div.col-md-12.mt-4:nth-child(3) div.mt-2.mb-4:nth-child(3) > input.form-control.input.text-default";

    final static String  VALIDER_BUTTON = "div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-body.mb-3 div.row.justify-content-center div.col-md-10 div.row div.col-md-12.mt-4:nth-child(3) div.d-flex.w-100.mt-5.mb-4.justify-content-end:nth-child(4) > button.btn-Primary.large.success";
    final static String  ANNULER_BUTTON = "div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-body.mb-3 div.row.justify-content-center div.col-md-10 div.row div.col-md-12.mt-4:nth-child(3) div.d-flex.w-100.mt-5.mb-4.justify-content-end:nth-child(4) > button.btn-Secondary.large.me-3";
    final static String  SUPPRIMER_BUTTON = "div.MuiDialog-root:nth-child(11) div.MuiDialog-container.MuiDialog-scrollBody:nth-child(3) div.MuiPaper-root.MuiDialog-paper.MuiDialog-paperScrollBody.MuiDialog-paperWidthMd.MuiPaper-elevation24.MuiPaper-rounded div.modal-header div.w-100.d-flex.align-items-center.justify-content-end.p-3 button.btn-QuickActions > span.material-icons";
    
    final static String  ERROR_MESSAGE_NAME ="";
    final static String  ERROR_MESSAGE_FIRSTNAME ="";
    final static String  ERROR_MESSAGE_EMAIL ="//span[contains(text(),\"L'email est invalide\")]";
    
    final static String  IMPORTER_BUTTON = "//button[contains(text(),'Importer une liste')]";
    final static String  IMPORTER_LIST_TEXT = "//span[contains(text(),'Importer la liste des étudiants')]";
    final static String  SELECTIONNER_FICHIER_BUTTON = "//button[contains(text(),'SÉLECTIONNER UN FICHIER')]";
    
    final static String  CONSENT_CHECKBOX = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/label[1]";
    final static String  CONTINUER_BUTTON = "//button[contains(text(),'Continuer')]";
    final static String  NUMBER_LIST_TEXT = "//body/div[4]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]";
    
    final static String  ENVOYER_INVITATIONS = "//button[contains(text(),'Envoyer les invitations')]";
    final static String  CONFIRMER_BUTTON = "//button[contains(text(),'Confirmer et Envoyer')]";
    
    final static String  IMPORTER_MESSAGE = "//span[contains(text(),'Importer la liste des étudiants')]";
    final static String  SELECT_FILE_MESSAGE = "//label[contains(text(),'Vous devez ajouter votre fichier Excel.')]";
    final static String  CONSENT_MESSAGE = "//body/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/span[1]";
    final static String  ANNULER_CANCIL_BUTTON = "//button[contains(text(),'ANNULER')]";
    
    @FindBy (how= How.CSS, using = EMAIL_ADRESS) 
	public static WebElement emailAdress ;
	@FindBy (how= How.CSS, using = PASS_WORD)
	public static WebElement passWord ;
	@FindBy (how = How.ID , using = LOGGED_BUTTON)
	public static WebElement loginButton ;
	@FindBy (how = How.CSS , using = STUDENT_BUTTON)
	public static WebElement studentButton ;
	@FindBy (how = How.XPATH , using = INVITER_ETUDIANT_BUTTON)
	public static WebElement inviterEtudiantButton ;
	
	@FindBy (how = How.CLASS_NAME , using = INVITER_BUTTON)
	public static WebElement inviterButton ;
	@FindBy (how = How.CSS, using = NAME_INFORMATION)
	public static WebElement NameInformation ;
	@FindBy (how = How.CSS, using = FIRSTNAME_INFORMATION)
	public static WebElement firstNameInformation ;
	@FindBy (how = How.CSS, using = ADRESS_EMAIL)
	public static WebElement adressEmail ;
	
	@FindBy (how = How.CSS, using = VALIDER_BUTTON)
	public static WebElement validerButton ;
	@FindBy (how = How.CSS, using = ANNULER_BUTTON)
	public static WebElement annulerButton ;
	@FindBy (how = How.CSS, using = SUPPRIMER_BUTTON)
	public static WebElement supprimerButton ;
	
	@FindBy (how= How.CSS, using = ERROR_MESSAGE_NAME)
	public static WebElement errorMessageName ;
	@FindBy (how= How.CSS, using = ERROR_MESSAGE_FIRSTNAME)
	public static WebElement errorMessageFirstname ;
	@FindBy (how= How.XPATH, using = ERROR_MESSAGE_EMAIL)
	public static WebElement errorMessageEmail ;
	
	@FindBy (how = How.XPATH, using = IMPORTER_BUTTON)
	public static WebElement importerButton ;
	@FindBy (how = How.XPATH, using = IMPORTER_LIST_TEXT)
	public static WebElement importerListText ;
	@FindBy (how= How.XPATH, using = SELECTIONNER_FICHIER_BUTTON)
	public static WebElement selectionnerFichierButton ;
	
	@FindBy (how = How.XPATH, using = CONSENT_CHECKBOX)
	public static WebElement consentCheckBox ;
	
	@FindBy (how= How.XPATH, using = CONTINUER_BUTTON)
	public static WebElement continuerButton ;
	@FindBy (how= How.XPATH, using = NUMBER_LIST_TEXT)
	public static WebElement numberListText ;

	@FindBy (how= How.XPATH, using = ENVOYER_INVITATIONS)
	public static WebElement envoyerInvitations ;
	@FindBy (how= How.XPATH, using = CONFIRMER_BUTTON)
	public static WebElement confirmerButton ;
	
	@FindBy (how = How.XPATH, using = IMPORTER_MESSAGE)
	public static WebElement importerMessage ;
	@FindBy (how = How.XPATH, using = SELECT_FILE_MESSAGE)
	public static WebElement selectFileMessage ;
	@FindBy (how = How.XPATH, using = CONSENT_MESSAGE)
	public static WebElement consentMessage ;
	@FindBy (how= How.XPATH, using = ANNULER_CANCIL_BUTTON)
	public static WebElement annulerCancilButton ;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
    Actions act = new Actions(driver);
	/* Methods */
	public void fillEmail (String email) {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, EMAIL_ADRESS, 10);	
	emailAdress.sendKeys(email);  
	} 
	public void fillPassWord (String password) {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, PASS_WORD, 10);
	passWord.sendKeys(password); 
	} 
	public void loginButtonClick () {
	loginButton.click();
    } 
	public void StudentButtonClick () {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, STUDENT_BUTTON, 10);	
	studentButton.click();
	} 
	public void loginInviterEtudiantClick () {
	boolean inviterEtudiantIsDisplayed = inviterEtudiantButton.isDisplayed();
		if (inviterEtudiantIsDisplayed == true) {
			System.out.println(" the inviter etudiant button is Displayed");
	inviterEtudiantButton.click();
	}
    String handle = driver.getWindowHandle();
    System.out.println(handle);
	try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!windowHandle.equals(handle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
	}
	public void inviterButtonClick () throws InterruptedException {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, INVITER_BUTTON, 10);
    act.moveToElement(inviterButton).doubleClick().build().perform();
    Thread.sleep(10000); 
	} 
	public void fillTheLastNameInformation (String lastname)  {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, NAME_INFORMATION, 10);
	NameInformation.sendKeys(lastname);
	}
	public void fillTheFirstNameInformation (String firstname) {
	firstNameInformation.sendKeys(firstname);
	}
	public void fillAdressEmailInformation (String adresseemail) {
	adressEmail.sendKeys(adresseemail);
	}
	public void validerButtonClick () throws InterruptedException {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, VALIDER_BUTTON, 10);
	boolean validerButtonIsDisplayed = validerButton.isDisplayed();
		if (validerButtonIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");
	    validerButton.click();
	String handle1 = driver.getWindowHandle();
    System.out.println(handle1);
	try {
	     Set<String> handles1 = driver.getWindowHandles();
	     System.out.println(handles1);
	        for (String windowHandle : handles1) {
	            if (!windowHandle.equals(handle1)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
		}
		Thread.sleep(10000); 
	}
	public void fillLastNameInformation (String lastname1)  {
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, NAME_INFORMATION, 10);
		NameInformation.sendKeys(lastname1);
		}
		public void fillFirstNameInformation (String firstname1) {
		firstNameInformation.sendKeys(firstname1);
		}
		public void fillTheAdressEmailInformation (String adresseemail1) {
		adressEmail.sendKeys(adresseemail1);
		}
	public void annulerButtonClick () throws InterruptedException {
	wait.explicitWaitUntilVisibilityOfButtonCss(driver, ANNULER_BUTTON, 10);
		boolean annulerButtonIsDisplayed = annulerButton.isDisplayed();
		if (annulerButtonIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");
	    act.moveToElement(annulerButton).doubleClick().build().perform();
	    Thread.sleep(10000); 
	}
	}  
	public void fillLastNameInformation2 (String lastname2)  {
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, NAME_INFORMATION, 10);
		NameInformation.sendKeys(lastname2);
		}
	public void fillFirstNameInformation2 (String firstname2) {
		firstNameInformation.sendKeys(firstname2);
		}
	public void fillTheAdressEmailInformation2 (String adresseemail2) {
		adressEmail.sendKeys(adresseemail2);
		}
	public void supprimerButtonClick () throws InterruptedException { 
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, SUPPRIMER_BUTTON, 10);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",supprimerButton);
		boolean supprimerButtonIsDisplayed = supprimerButton.isDisplayed();
		if (supprimerButtonIsDisplayed == true) {
			System.out.println(" the valider button is Displayed");
	        act.moveToElement(supprimerButton).doubleClick().build().perform();
	        Thread.sleep(10000); 
	}
	} 
	public void fillLastNameInformation3 (String lastname3)  {
		wait.explicitWaitUntilVisibilityOfButtonCss(driver, NAME_INFORMATION, 10);
		NameInformation.sendKeys(lastname3);
		}
	public void fillFirstNameInformation3 (String firstname3) {
		firstNameInformation.sendKeys(firstname3);
		}
	public void fillTheAdressEmailInformation3 (String adresseemail3) {
		adressEmail.sendKeys(adresseemail3);
		}

	public String getNameErrorMsg() {
		return errorMessageName.getText();
	}
	public String getFirstnameErrorMsg() {
		return errorMessageFirstname.getText();
	}
	public String getEmailErrorMsg() {
		return errorMessageEmail.getText();
	}
	
	public void StudentImportFileButtonClick () {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, IMPORTER_BUTTON, 10);
		boolean studentImporterIsDisplayed = importerButton.isDisplayed();
			if (studentImporterIsDisplayed == true) {
			System.out.println(" the valider button is Displayed");
		    importerButton.click();
		}
		} 
	public String getImportListMsg() {
		return importerListText.getText();
	}
	public void SelectStudentImportFileButtonClick () {
		boolean selectionnerFichierIsDisplayed = selectionnerFichierButton.isDisplayed();
		if (selectionnerFichierIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		selectionnerFichierButton.click();
		} 
	}
   
	public static void testFileUpload(String filePath) throws AWTException {
        // Ouvrir la boîte de dialogue de téléchargement de fichier dans votre application web
        // Par exemple, en utilisant Selenium WebDriver :
        // driver.findElement(By.id("uploadButton")).click();

        // Appel de la méthode pour télécharger le fichier
        //FileUploadUtil.KeyboardActionUploadFile(filePath);

        // Vous pouvez ajouter des assertions ici pour vérifier que le fichier a été téléchargé avec succès
        // Par exemple, vérifier un message de succès ou la présence du fichier téléchargé dans la liste
    }
    
	public void selectConsentCheckBoxButton () {
		boolean selectCheckBoxIsDisplayed = consentCheckBox.isDisplayed();
		if (selectCheckBoxIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		consentCheckBox.click();
		} 
	    }
	
	public void continuerButtonClick () throws InterruptedException {
		boolean continuerIsDisplayed = continuerButton.isDisplayed();
		if (continuerIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		continuerButton.click();
		String handle2 = driver.getWindowHandle();
	    System.out.println(handle2);
		try {
		     Set<String> handles2 = driver.getWindowHandles();
		     System.out.println(handles2);
		        for (String windowHandle : handles2) {
		            if (!windowHandle.equals(handle2)) {
		                driver.switchTo().window(windowHandle);
		                break;
		            }
		        }
		    } catch (NoSuchWindowException e) {
		        e.printStackTrace();
		    } 	
			}
			Thread.sleep(10000); 
		} 
	public String getNumbuerStudentsListMsg() {
		return numberListText.getText();
	}
	public void envoyerInvitationsButtonClick () throws InterruptedException {
		boolean envoyerInvitationsIsDisplayed = envoyerInvitations.isDisplayed();
		if (envoyerInvitationsIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		envoyerInvitations.click();
		String handle3 = driver.getWindowHandle();
	    System.out.println(handle3);
		try {
		     Set<String> handles3 = driver.getWindowHandles();
		     System.out.println(handles3);
		        for (String windowHandle : handles3) {
		            if (!windowHandle.equals(handle3)) {
		                driver.switchTo().window(windowHandle);
		                break;
		            }
		        }
		    } catch (NoSuchWindowException e) {
		        e.printStackTrace();
		    } 	
			}
		Thread.sleep(10000); 
		} 
	public void confirmerButtonClick () throws InterruptedException {
		boolean confirmerButtonIsDisplayed = confirmerButton.isDisplayed();
		if (confirmerButtonIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		confirmerButton.click();
		String handle4 = driver.getWindowHandle();
	    System.out.println(handle4);
		try {
		     Set<String> handles4 = driver.getWindowHandles();
		     System.out.println(handles4);
		        for (String windowHandle : handles4) {
		            if (!windowHandle.equals(handle4)) {
		                driver.switchTo().window(windowHandle);
		                break;
		            }
		        }
		    } catch (NoSuchWindowException e) {
		        e.printStackTrace();
		    } 	
			}
		Thread.sleep(10000); 
		} 
	
	public String verifyImprtListMsg() {
		return importerMessage.getText();
	}
	public String selectFileMsg() {
		return selectFileMessage.getText();
	}
	public String consentMsg() {
		return consentMessage.getText();
	}

	public void annulerconcilButtonClick () {
		boolean confirmerButtonIsDisplayed = annulerCancilButton.isDisplayed();
		if (confirmerButtonIsDisplayed == true) {
		System.out.println(" the valider button is Displayed");	
		annulerCancilButton.click();
		String handle5 = driver.getWindowHandle();
	    System.out.println(handle5);
		try {
		     Set<String> handles5 = driver.getWindowHandles();
		     System.out.println(handles5);
		        for (String windowHandle : handles5) {
		            if (!windowHandle.equals(handle5)) {
		                driver.switchTo().window(windowHandle);
		                break;
		            }
		        }
		    } catch (NoSuchWindowException e) {
		        e.printStackTrace();
		    } 	
			}
			
		} 
}
