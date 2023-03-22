package oop.MavenCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	//TIDY GHERKIN Chrome Plugin can be used

	@Given("Navigate to application")
	public void navigate_to_application() {
	    System.out.println("User navigates to application");
	}

	@When("a valid product is entered in Search field")
	public void a_valid_product_is_entered_in_search_field() {
	    System.out.println("User enters valid product in search field");
	}

	@When("Search button selected")
	public void search_button_selected() {
	    System.out.println("Search button selected");
	}

	@Then("Valid product is displayed in search results")
	public void valid_product_is_displayed_in_search_results() {
		System.out.println("Valid product is displayed");
	}

	@When("a non-existent product is entered in Search field")
	public void a_non_existent_product_is_entered_in_search_field() {
		System.out.println("Non-existent product is entered in Search field");
	}

	@Then("message prompts user there is No Product Matching")
	public void message_prompts_user_there_is_no_product_matching() {
	    System.out.println("Message prompts user there is No Product Matching");
	}
	
}
