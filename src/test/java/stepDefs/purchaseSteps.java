package stepDefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverFactory;

public class purchaseSteps extends driverFactory {
	
	
	@Given("logged in user navigates to Summer Dresses section of the website")
	public void logged_in_user_navigates_to_Summer_Dresses_section_of_the_website() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//calling user logs in method
        loginPage.userLoggesIn ();
        
		//user clicks DRESSES button 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
        driver.findElement(By.xpath(dressesPage.dressesButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.summerDressesButton)));
		driver.findElement(By.xpath(dressesPage.summerDressesButton)).click();
		Thread.sleep(1000);
			
		
		

	}

	@Given("user clicks on  the item {string} button")
	public void user_clicks_on_the_item_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	}

	@Then("user should see {string} of items in the basket")
	public void user_should_see_of_items_in_the_basket(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}	

}
