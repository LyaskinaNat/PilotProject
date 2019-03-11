package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.driverFactory;

public class mainHooks extends driverFactory {
	
	@Before
	  
	  public void setup() {
	  driver = getFirefoxDriver();
		
	}
	  
	  	  
	  @After
	  
	  public void tearDown() { 
	  driver.manage().deleteAllCookies(); 
	  //driver.close();
	  driver.quit();
	  System.out.println("Browser was closed after scenario execution");
	  
	  }

}
