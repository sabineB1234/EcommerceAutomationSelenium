package EdisacProjet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import utiles.Setup;
import utiles.WaitMethods;

public class SearchAddToPanierEdisacPage {

	/* Locators */
	final static String  SEARCH_PRODUCT = "//form[@id='searchForm']";
	final static String  SEARCH_BUTTON = "//body/div[@id='df-9xdwwfd2zrkyqh5qamj9lbtnwk2aospx']/div[@id='df-hook-layer-KR52y']/div[1]/form[1]/div[2]";
	final static String  LANCEL_BRAND = "//header/nav[@id='headerMenu']/ul[1]/li[1]/div[1]/div[4]/div[2]/a[2]";
	
	
	final static String  SUBMIT_SEARCH = "//body/div[@id='df-5jeh1zkwqg9xcfsy9bmn7go8o2vujick']/div[@id='df-hook-layer-FL7FN']/div[1]/div[1]/div[1]/button[1]/span[1]/strong[1]";
	final static String  FILTRER_PRIX = "//span[contains(text(),'Filtrer par prix')]";
	final static String  DRAG_PRICE ="//body/div[@id='df-havwqhwx4ut4kewjbb41ad3dx2v4yi9n']/div[@id='df-hook-layer-ISeBS']/div[@id='dfd-tabs-ISeBS']/div[@id='df-hook-results-ISeBS']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]";
	final static String  DROP_PRICE ="//body/div[@id='df-havwqhwx4ut4kewjbb41ad3dx2v4yi9n']/div[@id='df-hook-layer-ISeBS']/div[@id='dfd-tabs-ISeBS']/div[@id='df-hook-results-ISeBS']/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]";
	
	
	final static String  SAC_PRODUCT1 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[24]/div[1]";
	final static String  SAC_PRODUCT2 ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='wrapper-category']/div[@id='categorycontent']/div[@id='wrapperCategoryContent']/div[27]/div[1]";
	final static String  SAC_PRODUCT1_ADDBUTTON="div.dfd-root.dfd-closable.dfd-fullscreen.dfd-animate.phx-connected:nth-child(24) div.dfd-layer.dfd-ext.dfd-feat-add-to-cart.dfd-feat-guided-search.dfd-feat-voice-search div.dfd-tabs div.dfd-content div.dfd-results div.dfd-results-grid:nth-child(4) div.dfd-card.dfd-card-preset-product.dfd-card-type-products:nth-child(2) div.dfd-card-content.dfd-card-flex div.dfd-card-row > div.dfd-cart-add-button";
	final static String  SAC_PRODUCT2_ADDBUTTON="div.dfd-root.dfd-closable.dfd-fullscreen.dfd-animate.phx-connected:nth-child(24) div.dfd-layer.dfd-ext.dfd-feat-add-to-cart.dfd-feat-guided-search.dfd-feat-voice-search div.dfd-tabs div.dfd-content div.dfd-results div.dfd-results-grid:nth-child(4) div.dfd-card.dfd-card-preset-product.dfd-card-type-products:nth-child(4) div.dfd-card-content.dfd-card-flex div.dfd-card-row > div.dfd-cart-add-button";
	final static String  DELETE_BUTTON ="body:nth-child(2) div.dfd-root.dfd-closable.dfd-fullscreen.dfd-animate.phx-connected:nth-child(24) div.dfd-layer.dfd-ext.dfd-feat-add-to-cart.dfd-feat-guided-search.dfd-feat-voice-search div.dfd-header > button.dfd-close-button";
	
	final static String  PANIER_BUTTON = "#cart-mini";
	
	final static String  QUANTITY_BUTTON = "div.mbm:nth-child(2) div.row.ligne-top.mbs.pbs:nth-child(5) div.col.w80:nth-child(2) div.row:nth-child(1) div.col.w20.txtcenter.line:nth-child(3) div.txtcenter > span.change-qte.plus:nth-child(3)" ;
	final static String  TOTAL_PRICE ="//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='ordercontent']/div[@id='cartcontent']/div[@id='cartcontainer']/div[@id='cartright']/form[@id='basketform']/div[@id='option-cde']/div[3]/div[1]/div[2]/div[1]/div[1]";
	final static String  COMMANDER_BUTTON = "//body/div[@id='wrapper']/div[@id='container']/div[@id='middlefull']/div[@id='ordercontent']/div[@id='cartcontent']/div[@id='cartcontainer']/div[@id='cartright']/div[@id='cart-nav-footer']/div[1]/a[1]" ;


    /* @FindBy */
	@FindBy (how=How.XPATH, using = SEARCH_PRODUCT)
	public static WebElement searchProduct ; 
	@FindBy (how=How.XPATH, using = SEARCH_BUTTON) 
	public static WebElement searchButton ; 
	@FindBy (how= How.XPATH, using = LANCEL_BRAND)
	public static WebElement lancelBrand ;
	
	@FindBy (how=How.XPATH, using = SUBMIT_SEARCH)
	public static WebElement submitSearch ; 
	@FindBy (how=How.XPATH, using = FILTRER_PRIX)
	public static WebElement filtrerPrix ; 
	@FindBy (how=How.XPATH, using = DRAG_PRICE)
	public static WebElement MaximumPrince ; 
	@FindBy (how=How.XPATH, using = DROP_PRICE)
	public static WebElement MinimumPrince ;
	
	@FindBy (how=How.XPATH, using = SAC_PRODUCT1)
	public static WebElement sacproduct1 ; 
	@FindBy (how=How.XPATH, using = SAC_PRODUCT2)
	public static WebElement sacProduct2 ; 
	
	@FindBy (how=How.CSS, using = SAC_PRODUCT1_ADDBUTTON)
	public static WebElement sacProduct1AddButton ; 
	@FindBy (how=How.CSS, using = SAC_PRODUCT2_ADDBUTTON)
	public static WebElement sacProduct2AddButton ; 
	@FindBy (how=How.CSS, using = DELETE_BUTTON)
	public static WebElement deleteButton ; 
	
	@FindBy (how=How.CSS, using = PANIER_BUTTON)
	public static WebElement monPanierButton ;
	@FindBy (how=How.CSS, using = QUANTITY_BUTTON)
	public static WebElement quantityButton ;
	
	@FindBy (how=How.XPATH, using = TOTAL_PRICE)
	public static WebElement totalPrice ;
   	@FindBy (how = How.XPATH, using = COMMANDER_BUTTON)
   	public static WebElement commanderButton ; 
   	
   	
   	/* Initialization */
    WaitMethods wait = new WaitMethods();
    WebDriver driver= Setup.driver ;
    String handle1;
	/* Methods */ 
    
	public void moveToSearchProduct () throws InterruptedException {
		Thread.sleep(10000); 
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",searchProduct);
		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, SEARCH_PRODUCT, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(searchProduct).doubleClick().build().perform();
	}
	public void clickonProductsSearchProduct(String productinput) {
		Actions actions = new Actions(driver);
		searchProduct.sendKeys(productinput);
		actions.doubleClick(searchButton);
		handle1 = driver.getWindowHandle();
		System.out.println(handle1);
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
	
	public String getFiltrerPrixMessage() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",filtrerPrix);
		return filtrerPrix.getText();
		
	}
	public void DragAndDropPrice() {
		Actions actions = new Actions(driver);
        actions.dragAndDropBy(MaximumPrince,995, 595).perform();
        actions.dragAndDropBy(MinimumPrince, 60, 100).perform();
	}
	public void moveToProductOne() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",sacproduct1);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, SAC_PRODUCT1, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(sacproduct1).build().perform();
	}
	public void clickOnProductOne() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, SAC_PRODUCT1_ADDBUTTON, 10);
		boolean dressproduct1AddButtonIsDisplayed = sacProduct1AddButton.isDisplayed();
		if (dressproduct1AddButtonIsDisplayed == true) {
		System.out.println(" the continue button is Displayed");
		Actions act = new Actions(driver);
	    act.moveToElement(sacProduct1AddButton).doubleClick().build().perform();
		//dressproduct1AddButton.click();
	}
	}
	public void moveToProductTwo() {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",sacProduct2);
		wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, SAC_PRODUCT2, 10);
		Actions act = new Actions(driver);
	    act.moveToElement(sacProduct2).perform();
	}
	public void clickOnProductTwo() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, SAC_PRODUCT2_ADDBUTTON, 10);
		boolean dressProduct2AddButtonIsDisplayed = sacProduct2AddButton.isDisplayed();
		if (dressProduct2AddButtonIsDisplayed == true) {
		System.out.println(" the add product button is Displayed");
		Actions act = new Actions(driver);
	    act.moveToElement(sacProduct2AddButton).doubleClick().build().perform();
		//dressProduct2AddButton.click(); 		 
	}
	}
	public void clickDeleteButton() {
		  deleteButton.click(); 
    
	}
	public void clickOnMonPanierButton() {
		String handle2 = driver.getWindowHandle();
		monPanierButton.click();
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
	public void clickOnQuantityProduct(String quantity) {
		 Select quantityProductButton = new Select(driver.findElement(By.cssSelector(QUANTITY_BUTTON)));
		 quantityProductButton.selectByValue(quantity);
	}
	public String getTotalPriceMessage( ) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",totalPrice);
		return totalPrice.getText();
	}
	public void ClickOnCommanderButton () {
		String handle5 = driver.getWindowHandle();
		Boolean commanderIsDisplayed = commanderButton.isDisplayed();
		  if (commanderIsDisplayed == true ) {
			  System.out.println("the add product button is Displayed");
			  
			  commanderButton.click();
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
