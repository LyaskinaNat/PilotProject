package stepDefs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		driver.get("http:\\/\\/automationpractice.com/");
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		//calling user logs in method
        loginPage.userLoggesIn ();
        dressesPage.userPurchaseItem();
		//user clicks DRESSES button 
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
      //  driver.findElement(By.xpath(dressesPage.dressesButton)).click();
		
	}

	@Given("user clicks on  the item {string}")
	public void user_clicks_on_the_item(String item) throws Throwable {
	//	WebDriverWait wait = new WebDriverWait(driver, 5);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	Thread.sleep(1000);
     //   js.executeScript("window.scrollBy(0,7000)");
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(item)));
	//	driver.findElement(By.xpath(item)).click();
		Thread.sleep(1000);
		
		
		
	}
	
	@Given("user clicks on Add to cart button")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(dressesPage.addToCart)));
	//	driver.findElement(By.name(dressesPage.addToCart)).click();
		Thread.sleep(1000);

		}
	

	@When("user clicks on Proceed to checkout button")
	public void user_clicks_on_Proceed_to_checkout_button() throws Throwable  {
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.checkout)));
	//	driver.findElement(By.xpath(dressesPage.checkout)).click();
		Thread.sleep(2000);
	}

	@Then("user should see {string} of items in the basket")
	public void user_should_see_of_items_in_the_basket(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}	

}
