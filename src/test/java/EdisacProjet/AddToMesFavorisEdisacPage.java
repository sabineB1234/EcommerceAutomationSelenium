package EdisacProjet;

import java.io.IOException;
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

public class AddToMesFavorisEdisacPage {

	/* Locators */ 
	
	final static String  WOMEN_BUTTON = "//span[contains(text(),'Femme')]";
	final static String  SAC_BANDELIERE_PRODUCT = "//header/nav[@id='headerMenu']/ul[1]/li[1]/div[1]/div[3]/div[2]/a[2]";
	
	final static String  BRAND_PRODUCT ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='Hfilterbar']/div[@id='filtres']/div[2]/div[2]/div[1]";
	final static String  LANCASTER_PRODUCT ="#makes_188";
	final static String  FILTRE_BUTTON1 ="//body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/a[1]/span[1]";
	
	final static String  MATIERE_PRODUCT ="//div[contains(text(),'Matiere / aspect')]";
	final static String  CUIRE_PRODUCT ="#s995_matasp_D1";
	final static String  FILTRE_BUTTON2 ="//body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div[6]/div[2]/a[1]/span[1]";
	
	final static String  LANCASTER_PRODUCT1 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[1]";
	final static String  FAVORIS_PRODUCT1 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[1]/div[1]/div[1]/span[1]";
	
	final static String  LANCASTER_PRODUCT2 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[2]";
	final static String  FAVORIS_PRODUCT2 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[2]/div[1]/div[1]/span[1]";
	
	final static String  FAVORIS_BUTTON ="//a[@id='favoris-mini']";
	
    /* @FindBy */
	
	@FindBy (how=How.XPATH, using = WOMEN_BUTTON) 
	public static WebElement womenClick ; 
	@FindBy (how= How.XPATH, using = SAC_BANDELIERE_PRODUCT)
	public static WebElement sacBandouliereProduct ;
	
	@FindBy (how= How.XPATH, using = BRAND_PRODUCT)
	public static WebElement brandProduct ;
	@FindBy (how= How.CSS, using = LANCASTER_PRODUCT)
	public static WebElement lancasterProduct ;
	@FindBy (how= How.XPATH, using = FILTRE_BUTTON1)
	public static WebElement filtreButon1 ;
	
	@FindBy (how= How.XPATH, using = MATIERE_PRODUCT)
	public static WebElement matiereProduct ;
	@FindBy (how= How.CSS, using = CUIRE_PRODUCT)
	public static WebElement cuireProduct ;
	@FindBy (how= How.XPATH, using = FILTRE_BUTTON2)
	public static WebElement filtreButton2 ;
	
	@FindBy (how= How.XPATH, using = LANCASTER_PRODUCT1)
	public static WebElement lancasterproduct1 ;
	@FindBy (how= How.XPATH, using = FAVORIS_PRODUCT1)
	public static WebElement favorisProduct1 ;
	
	@FindBy (how= How.XPATH, using = LANCASTER_PRODUCT2)
	public static WebElement lancasterproduct2 ;
	@FindBy (how= How.XPATH, using = FAVORIS_PRODUCT2)
	public static WebElement favorisProduct2 ;
	
	@FindBy (how= How.XPATH, using = FAVORIS_BUTTON)
	public static WebElement favorisButton ;
	
	/* Initialization */
	
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
    
	/* Methods */
    
    String handle1;
    
	public void moveToWomenButton () throws InterruptedException , IOException {
	Thread.sleep(10000); 
    wait.explicitWaitUntilVisibilityOfButtonXpath(driver, WOMEN_BUTTON, 10);
    Actions act = new Actions(driver);
	act.moveToElement(womenClick).perform();
	} 
	public void moveToSacBandeliereButton () {
	    handle1 = driver.getWindowHandle();
	    System.out.println(handle1);
	    Actions act = new Actions(driver);
	    act.moveToElement(sacBandouliereProduct).perform();
	}
	
	public void clickOnSacBandeliereButton () {
		boolean sacbandouiereIsDisplayed = sacBandouliereProduct.isDisplayed();
		if (sacbandouiereIsDisplayed == true) {
			System.out.println(" the login button is Displayed");
			sacBandouliereProduct.click();
		}
	    try {
	     Set<String> handles = driver.getWindowHandles();
	     System.out.println(handles);
	        for (String windowHandle : handles) {
	            if (!handle1.equals(windowHandle)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }
	    } catch (NoSuchWindowException e) {
	        e.printStackTrace();
	    } 	
	}
	
	public void selectBrandLancaster () {
		brandProduct.click();
		lancasterProduct.click();
		filtreButon1.click();
		}
	
	public void selectMatiereLancaster () throws InterruptedException {
		Thread.sleep(5000);
		wait.explicitWaitUntilVisibilityOfButtonXpath(driver, MATIERE_PRODUCT, 10);
		matiereProduct.click();
		cuireProduct.click();
		filtreButton2.click();
		}

	public void moveMouseOverLancasterProduct1 () throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",lancasterproduct1);
		wait.explicitWaitUntilVisibilityOfButtonXpath(driver, LANCASTER_PRODUCT1, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(lancasterproduct1).build().perform();
	}
	
	public void clickOnFavorisProduct1 () {
	// Attente explicite pour permettre à l'élément "more" d'être cliquable
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement moretButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("moreButton")));
		
		// Cliquez sur le bouton "more"
		Actions act = new Actions(driver);
		act.moveToElement(favorisProduct1).click().build().perform();
		act.doubleClick(favorisProduct1).build().perform();		
		}
	
	public void moveMouseOverLancasterProduct2 () {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",lancasterproduct2);
		wait.explicitWaitUntilVisibilityOfButtonXpath(driver, LANCASTER_PRODUCT2, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(lancasterproduct2).build().perform();
	}
	public void clickOnFavorisProduct2 (){
	// Attente explicite pour permettre à l'élément "more" d'être cliquable
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement moretButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("moreButton")));
		// Cliquez sur le bouton "more"
		Actions act = new Actions(driver);
		act.moveToElement(favorisProduct2).click().build().perform();
		act.doubleClick(favorisProduct2).build().perform();
		}
	
	public void clickOnIncreaseButton () {
		boolean favorisButtonIsEnable = favorisButton.isDisplayed();
		if (favorisButtonIsEnable == true) {
			System.out.println(" the login button is Displayed");
		
		favorisButton.click();	
	}
	}
}