package stepDefs;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.loginPage;
import utils.driverFactory;

public class loginSteps extends driverFactory {
	

	  
	  	
	@Given("User navigates to http:\\/\\/automationpractice.com website")
	public void user_navigates_to_http_automationpractice_com_website() throws Throwable {
		driver.get("http:\\/\\/automationpractice.com/");
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        
	}

	@Given("User clicks on the Sign in option")
	public void user_clicks_on_the_Sign_in_option() {
        driver.findElement(By.xpath(loginPage.signInButton)).click();
	}

	@Given("User enters a valid email address") 
	public void user_enters_a_valid_email_address() throws Throwable {
		driver.findElement(By.id(loginPage.email)).sendKeys("bellnatnat@gmail.com");
		
	}

	@Given("User enters a valid password")
	public void user_enters_a_valid_password()throws Throwable {
		driver.findElement(By.id(loginPage.password)).sendKeys("Mytestpassword");
		Thread.sleep(1000);
	}

	@When("User clicks on the Sign in button")
	public void user_clicks_on_the_Sign_in_button()throws Throwable {
		driver.findElement(By.id(loginPage.submit)).click();
		Thread.sleep(1000);
	}

	@Then("User should be signed in to the website")
	public void user_should_be_signed_in_to_the_website() {
	    String test =driver.findElement(By.xpath(loginPage.userSignedIn)).getText();
	    Assert.assertEquals("Nat Lastname", test);
		
	}

	@Given("User enters an invalid email address")
	public void user_enters_an_invalid_email_address() {
		driver.findElement(By.id(loginPage.email)).sendKeys("natnat@gmail.com");
	}

	@Given("User enters an invalid password")
	public void user_enters_an_invalid_password()throws Throwable {
		driver.findElement(By.id(loginPage.password)).sendKeys("Mypassword");
		Thread.sleep(1000);
	}


	@Then("Authentication failed message should be displayed to the user")
	public void authentication_failed_message_should_be_displayed_to_the_user() {
		String auth =driver.findElement(By.xpath(loginPage.authFailed)).getText();
		Assert.assertEquals("Authentication failed.", auth);
		
	}

	@Given("User enters an incorrect format email address")
	public void user_enters_an_incorrect_format_email_address() {
		driver.findElement(By.id(loginPage.email)).sendKeys("bellnatnat_gmail.com");
	}

	@Given("User enters an valid password")
	public void user_enters_an_valid_password() throws Throwable {
		driver.findElement(By.id(loginPage.password)).sendKeys("Mytestpassword");
		Thread.sleep(1000);
	}

	@Then("Error message Invalid email address is displayed to the user")
	public void error_message_Invalid_email_address_is_displayed_to_the_user() {
		String auth =driver.findElement(By.xpath(loginPage.invalidEmail)).getText();
		Assert.assertEquals("Invalid email address.", auth);
		
	}

}
