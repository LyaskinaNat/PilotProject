package stepDefs;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.driverFactory;

public class categoriesSteps extends driverFactory {

	@Given("user navigates to Dresses section of the website")
	public void user_navigates_to_Dresses_section_of_the_website() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.get("http:\\/\\/automationpractice.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.dressesButton)));
		driver.findElement(By.xpath(dressesPage.dressesButton)).click();

	}

	@When("user clicks on  subcategory {string}")
	public void user_clicks_on_subcategory(String subCategory) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.categoryBlock)));
		driver.findElement(By.xpath(subCategory)).click();
		Thread.sleep(1000);
	}

	@Then("user should be re-directed to corresponding {string} page")
	public void user_should_be_re_directed_to_corresponding_page(String pageName) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dressesPage.subCategoryTitle)));
		WebElement title = driver.findElement(By.xpath(dressesPage.subCategoryTitle));
		String titleName = title.getText();
		Assert.assertEquals(pageName.trim(), titleName.trim());
		Thread.sleep(1000);

	}

}
