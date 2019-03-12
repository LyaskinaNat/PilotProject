package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverFactory;

public class purchaseSteps extends driverFactory {


	@Given("user navigates to Summer Dresses section of the website")
	public void user_navigates_to_Summer_Dresses_section_of_the_website() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.get("http:\\/\\/automationpractice.com/");
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
		driver.findElement(By.xpath(dressesPage.dressesButton)).click();
	}

	@Given("user selects the item to purchase")
	public void user_selects_the_item_to_purchase() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dress)));
		driver.findElement(By.xpath(dressesPage.dress)).click();

	}

	@Given("user clicks on Add to cart button")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(dressesPage.addToCart)));
		driver.findElement(By.name(dressesPage.addToCart)).click();
		

	}

	@When("user clicks on Proceed to checkout button")
	public void user_clicks_on_Proceed_to_checkout_button() throws Throwable  {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.checkout)));
		driver.findElement(By.xpath(dressesPage.checkout)).click();
		
	}

	@Then("the item should be adde to the basket")
	public void the_item_should_be_adde_to_the_basket() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.quantity)));
		WebElement quantity = driver.findElement(By.xpath(dressesPage.quantity));
		String number = quantity.getText();
		Assert.assertEquals("1", number);

	}

}
