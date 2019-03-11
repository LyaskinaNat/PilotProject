package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.driverFactory;

public class loginPage extends driverFactory {
	
//login page
	
public String signInButton = "//a[@title='Log in to your customer account']"; // xPath locator

public String email = "email"; //id locator

public String password = "passwd"; //id locator

public String submit = "SubmitLogin"; //id locator

public String userSignedIn = "//a[@title='View my customer account']"; // xPath locator

public String authFailed = "//li[contains(text(),'Authentication failed.')]"; // xPath locator

public String invalidEmail = "//li[contains(text(),'Invalid email address.')]"; // xPath locator

public void userLoggesIn () throws Throwable {
	WebDriverWait wait = new WebDriverWait(driver, 5);
	driver.get("http:\\/\\/automationpractice.com/");
	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.findElement(By.xpath(signInButton)).click();
	driver.findElement(By.id(email)).sendKeys("bellnatnat@gmail.com");
	driver.findElement(By.id(password)).sendKeys("Mytestpassword");
	driver.findElement(By.id(loginPage.submit)).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginPage.userSignedIn)));
	Thread.sleep(1000);
	
}


}

