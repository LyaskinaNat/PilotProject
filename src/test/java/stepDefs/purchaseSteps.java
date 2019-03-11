package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class purchaseSteps {
	
	@Given("logged in user navigates to Summer Dresses section of the website")
	public void logged_in_user_navigates_to_Summer_Dresses_section_of_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1");
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
