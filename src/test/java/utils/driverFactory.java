package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.dressesPage;
import pageObjects.loginPage;
import pageObjects.checkoutPage;


public class driverFactory {
	
	public static WebDriver driver;
	public static loginPage loginPage;
	public static dressesPage dressesPage;
	public static checkoutPage checkoutPage;
	
	public WebDriver getFirefoxDriver() {
		  
		  try {
		  
		  
		  String exePath = "/src/test/java/drivers/geckodriver.exe";
		  System.setProperty("webdriver.firefox.driver", exePath ); 
		  driver = new FirefoxDriver(); 
		  driver.manage().window().maximize();
		  
		  System.out.println("Chrome browser was opened");
		  
		  } catch (Exception e) { System.out.println("Unable to open Chrome browser: "
		  + e.getMessage()); } 
		  finally {
		//	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			  loginPage = PageFactory.initElements(driver, loginPage.class);
			  dressesPage = PageFactory.initElements(driver, dressesPage.class);
			  checkoutPage = PageFactory.initElements(driver, checkoutPage.class);
		  }
		  return driver;
	}

}
