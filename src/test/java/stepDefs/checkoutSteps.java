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

public class checkoutSteps extends driverFactory {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	@Given("singed in user has a selected item in the shopping basket")
	public void signed_in_user_has_a_selected_item_in_the_shopping_basket() throws Throwable {
		driver.get("http:\\/\\/automationpractice.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		loginPage.userLoggesIn();
		//calling "add selected item in the basket" method
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
		driver.findElement(By.xpath(dressesPage.dressesButton)).click();
		dressesPage.userPurchaseItem();
	}


	@When("user clicked on Proceed to checkout button on Summmary tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Summmary_tab() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(checkoutPage.proceedToCheckout1)));
	//	jse.executeScript("scroll(0, 500);");
		driver.findElement(By.linkText(checkoutPage.proceedToCheckout1)).click();
	}

	

	@When("user clicked on Proceed to checkout button on Address tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Address_tab() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(checkoutPage.proceedToCheckout2)));
	//	jse.executeScript("scroll(0, 500);");
		driver.findElement(By.name(checkoutPage.proceedToCheckout2)).click();
	}

	@When("user agreed to T&Cs on Shipping tab")
	public void user_agreed_to_T_Cs_on_Shipping_tab() {
	//	jse.executeScript("scroll(0, 500);");
		driver.findElement(By.xpath(checkoutPage.termsOfServiceTickBox)).click();
	}

	@When("user clicked on Proceed to checkout button on Shippping tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Shippping_tab() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(checkoutPage.proceedToCheckout4)));
	//	jse.executeScript("scroll(0, 500);");
		driver.findElement(By.name(checkoutPage.proceedToCheckout4)).click();
	}

	@When("user selected Pay by bank wire method")
	public void user_selected_Pay_by_bank_wire_method() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(checkoutPage.payByBankWire)));
	//	jse.executeScript("scroll(0, 500);");
		driver.findElement(By.partialLinkText(checkoutPage.payByBankWire)).click();
	}

	@When("user clicked on I confirm my order button")
	public void user_clicked_on_I_confirm_my_order_button() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkoutPage.orderConfirmation)));
		jse.executeScript("scroll(0, 500);");
		driver.findElement(By.xpath(checkoutPage.orderConfirmation)).click();
	}

	@Then("user sees successfull purchase conformation message")
	public void user_sees_successfull_purchase_conformation_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(checkoutPage.orderConformationMessage)));
		WebElement conformation = driver.findElement(By.xpath(checkoutPage.orderConformationMessage));
		String expectedMessage = "Order confirmation";
		String actualMessage = conformation.getText();
		Assert.assertEquals(expectedMessage.trim().toLowerCase(), actualMessage.trim().toLowerCase());
		Thread.sleep(1000);
	}	
	
}
	





