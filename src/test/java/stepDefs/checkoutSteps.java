package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkoutSteps {
	
	@Given("user has a selected item in the shopping basket")
	public void user_has_a_selected_item_in_the_shopping_basket() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("user is on a checkout page")
	public void user_is_on_a_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1");
	}

	@When("user clicked on Proceed to checkout button on Summmary tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Summmary_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("2");
	}

	@When("user successfully logged in on Sign in tab")
	public void user_successfully_logged_in_on_Sign_in_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("3");
	}

	@When("user clicked on Proceed to checkout button on Address tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Address_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("4");
	}

	@When("user agreed to T&Cs on Shipping tab")
	public void user_agreed_to_T_Cs_on_Shipping_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("5");
	}

	@When("user clicked on Proceed to checkout button on Shippping tab")
	public void user_clicked_on_Proceed_to_checkout_button_on_Shippping_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("6");
	}

	@When("user selected Pay by bank wire method")
	public void user_selected_Pay_by_bank_wire_method() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("7");
	}

	@When("user clicked on I confirm my order button")
	public void user_clicked_on_I_confirm_my_order_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("8");
	}

	@Then("user sees successfull purchase conformation message")
	public void user_sees_successfull_purchase_conformation_message() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("9");
	}	

}
