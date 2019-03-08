/*
 * package stepDefs; import java.util.concurrent.TimeUnit; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import cucumber.api.java.After;
 * import cucumber.api.java.Before; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class login {
 * 
 * WebDriver driver; // Created a variable called driver
 * 
 * @Before
 * 
 * public void setupChromeDriver() {
 * 
 * try {
 * 
 * 
 * String exePath = "scr/test/drivers/chromedriver";
 * System.setProperty("webdriver.chrome.driver", exePath ); this.driver = new
 * ChromeDriver(); this.driver.manage().window().maximize();
 * this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
 * System.out.println("Chrome browser was opened");
 * 
 * } catch (Exception e) { System.out.println("Unable to open Chrome browser: "
 * + e.getMessage()); } }
 * 
 * 
 * @After
 * 
 * public void tearDown() { driver.manage().deleteAllCookies(); driver.close();
 * driver.quit();
 * System.out.println("Browser was closed after scenario execution");
 * 
 * }
 * 
 * @Given("User navigates to http://automationpractice.com website") public void
 * user_navigates_to_http_automationpractice_com_website() throws Throwable {
 * driver.get("http://automationpractice.com");
 * driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
 * Thread.sleep(2000); }
 * 
 * @Given("User clicks on the Sign in option") public void
 * user_clicks_on_the_Sign_in_option() { System.out.println("-"); }
 * 
 * @Given("User enters a valid email address") public void
 * user_enters_a_valid_email_address() { System.out.println("-"); }
 * 
 * @Given("User enters a valid password") public void
 * user_enters_a_valid_password() { System.out.println("-"); }
 * 
 * @When("User clicks on the Sign in button") public void
 * user_clicks_on_the_Sign_in_button() { System.out.println("-"); }
 * 
 * @Then("User should be signed in to the website") public void
 * user_should_be_signed_in_to_the_website() { System.out.println("-"); }
 * 
 * @Given("User enters an invalid email address") public void
 * user_enters_an_invalid_email_address() { System.out.println("-"); }
 * 
 * @Given("User enters an invalid password") public void
 * user_enters_an_invalid_password() { System.out.println("-"); }
 * 
 * @When("User clicks on the Sign button") public void
 * user_clicks_on_the_Sign_button() { System.out.println("-"); }
 * 
 * @Then("Authentication failed message should be displayed to the user") public
 * void authentication_failed_message_should_be_displayed_to_the_user() {
 * System.out.println("-"); }
 * 
 * @Given("User enters an incorrect format email address") public void
 * user_enters_an_incorrect_format_email_address() { System.out.println("-"); }
 * 
 * @Given("User enters an valid password") public void
 * user_enters_an_valid_password() { System.out.println("-"); }
 * 
 * @Then("Error message Invalid email address is displayed to the user") public
 * void authentication_error_message_should_be_displayed_to_the_user() {
 * System.out.println("-"); }
 * 
 * }
 * 
 * 
 * 
 */