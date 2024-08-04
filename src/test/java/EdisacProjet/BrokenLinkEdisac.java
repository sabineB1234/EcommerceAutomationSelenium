package EdisacProjet;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkEdisac {

		public static void main(String[] args) {
			// read from executable file  
		System.setProperty("webdriver.chrome.driver","/Users/nadine/eclipse-workspace2/firstFrameWorkSelenium/src/test/ressources/drivers/chromedriver");
					
			// open chrome 
		WebDriver driver= new ChromeDriver();
					
		 // create chromOption https://www.amazon.fr/ref=nav_logo/http://www.automationpractice.pl/index.php
		ChromeOptions option = new ChromeOptions();
					
		option.addArguments("--remote allow-origins");
		driver.get("https://www.edisac.com/");
					
		// capture links (always associated with "a" tag/ image "img"both 
		// have "href" propriety)
		List <WebElement> linksList = driver.findElements(By.tagName("a"));
		
		// count number of links 
		System.out.println("Total links on the Wb Page: " + linksList.size());
		
		// list of all links 
		Iterator <WebElement> iterator = linksList.iterator();
	        while (iterator.hasNext()) {
		String links = iterator.next().getText();
	    System.out.println(links);
				      }
		//checking the links fetched.
		    for(int i=0;i<linksList.size();i++)
				        {
		WebElement E1= linksList.get(i);
		String linksValid= E1.getAttribute("href");
		verifyLinks(linksValid);
					
		}
		}    
		@SuppressWarnings("deprecation")
		public static void verifyLinks(String linksValid)
		{
			 try
		{
		
		URL url = new URL(linksValid);

	   //Now we will be creating url connection and getting the response code
	   HttpURLConnection httpURLConnect= (HttpURLConnection)url.openConnection();
	   httpURLConnect.setConnectTimeout(5000);
	   httpURLConnect.connect();
			 if(httpURLConnect.getResponseCode()>=400)
		     {
	    System.out.println(linksValid+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
				                }    
				           
	   //Fetching and Printing the response code obtained
			else{
	    System.out.println(linksValid+" - "+httpURLConnect.getResponseMessage()+ " it is a valid link");
				}
		    }catch (Exception e) {
				}
				
				}
	}


