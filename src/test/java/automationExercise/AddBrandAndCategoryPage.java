package automationExercise;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utiles.Setup;
import utiles.WaitMethods;

public class AddBrandAndCategoryPage {

	/* Locators */
	final static String  PRODUCTS_BUTTON = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(2) > a:nth-child(1)";
	final static String  CATEGORY_BUTTON = "//h2[contains(text(),'Category')]";
	final static String  WOMEN_BUTTON = "div.container div.row div.col-sm-3 div.left-sidebar div.panel-group.category-products:nth-child(2) div.panel.panel-default:nth-child(1) div.panel-heading h4.panel-title > a:nth-child(1)" ;
	final static String  DRESS_BUTTON = "div.container div.row div.col-sm-3 div.left-sidebar div.panel-group.category-products:nth-child(2) div.panel.panel-default:nth-child(1) div.panel-collapse.in div.panel-body ul:nth-child(1) li:nth-child(1) > a:nth-child(1)";
	final static String  MADAME_BUTTON= "a[href='/brand_products/Polo']";
	
	/* @FindBy */
	@FindBy (how=How.CSS, using = PRODUCTS_BUTTON) 
	public static WebElement productsButton ; 
	@FindBy (how= How.XPATH, using = CATEGORY_BUTTON) 
	public static WebElement categoryButton ;
	@FindBy (how= How.CSS, using = WOMEN_BUTTON)
	public static WebElement womenButton ;
	@FindBy (how = How.CSS , using = DRESS_BUTTON)
	public static WebElement dressButton ;
	@FindBy (how = How.CSS , using = MADAME_BUTTON)
	public static WebElement madameButton;
	
	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
	
	/* Methods */
    public void clickOnProductsButton () {
    	boolean signOutIsEnable = productsButton.isEnabled();
		if (signOutIsEnable == true) {
			System.out.println(" the login button is Enabled");
			// Get CSS value
	        String colorButton = productsButton.getCssValue("color");
	        System.out.println(" the login button is  "  + colorButton);
	        String fontSizeButton  = productsButton.getCssValue("font-size");
	        System.out.println(" the login button is " + fontSizeButton);
	        String marginButton = productsButton.getCssValue("margin");
	        System.out.println(" the login button is " + marginButton );
	        String underLineButton = productsButton.getCssValue("text-decoration");
	        System.out.println(" the login button is " + underLineButton );
            productsButton.click();  
    }
    }
    public String getCategoryMessage() {
		return categoryButton.getText();
	}
    public void clickOnWomenButton () {
    	JavascriptExecutor js =((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView()",womenButton );
    	boolean signOutIsEnable = womenButton.isEnabled();
		if (signOutIsEnable == true) {
			System.out.println(" the login button is Enabled");
            womenButton.click();  
	}
    }
    public void clickOnDressButton() {
    wait.explicitWaitUntilButtonIsClickableCss(driver, DRESS_BUTTON, 10);
    boolean dressesEveningIsDisplayed = dressButton.isDisplayed();
	if (dressesEveningIsDisplayed == true) {
		System.out.println(" the login button is Displayed");
		dressButton.click();
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
    public void clickOnMadameButton() {
	    wait.explicitWaitUntilButtonIsClickableCss(driver, MADAME_BUTTON, 10);
	    JavascriptExecutor js =((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].scrollIntoView()",madameButton );
	    String handle1 = driver.getWindowHandle();
	    System.out.println(handle1);
	    madameButton.click();
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
        }
    
    			
		    
		    
		    
		    
		 
