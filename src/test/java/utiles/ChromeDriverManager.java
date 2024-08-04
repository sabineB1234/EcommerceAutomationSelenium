package utiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

	private ChromeDriverService chService;

	public void startService() {
		
	}

	@Override
	public void stopService() {
		if (null != chService && chService.isRunning())
			chService.stop();
	}
	@Override
	public void createDriver() {
		 System.setProperty("webdriver.chrome.driver","/Users/nadine/eclipse-workspace2/FrameWorkSeleniumBDD1/src/test/ressources/drivers/chromedriver");
         ChromeOptions optionsChrome = new ChromeOptions();
	     optionsChrome.addArguments("--remote-allow-origins=*");
	     optionsChrome.addArguments("--incognito");
         optionsChrome.addArguments("--start-maximized");
         optionsChrome.addArguments("--disable-infobars");
         optionsChrome.addArguments("--disable-popup-blocking");
         optionsChrome.setAcceptInsecureCerts(true);
         driver = new ChromeDriver(optionsChrome);
       
	}
}
