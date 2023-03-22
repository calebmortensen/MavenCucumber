package oop.MavenCucumber;

import io.cucumber.java.en.*;

public class Login {

	@Given("User navigates to Login page")
	public void user_navigate_to_login_page() {
	    System.out.println(">>User landed on login page");
	}

	@When("User enters email address {string}")
	public void user_enters_email_address(String email) {
		System.out.println(">>User enters valid email address"+email);
	}

	@When("Enter valid password {string}")
	public void enter_valid_password(String passwordText) {
	  System.out.println("User Enters valid password"+passwordText);
	}

	@When("Clicks on Login button")
	public void clicks_login_button() {
	   System.out.println("User clicks on login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	   System.out.println("login successful");
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
	    System.out.println("invalid email address"+invalidEmail);
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPassword) {
	    System.out.println("invalid_password"+invalidPassword);
	}

	@Then("user should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
	    System.out.println("warning message");
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String validEmail) {
	  System.out.println("valid email entered"+validEmail);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	   System.out.println("Login button clicked");
	}

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {
	   System.out.println("Lands on login page");
	}

	@When("Enters Valid password {string}")
	public void enters_valid_password(String validPassword) {
	    System.out.println("Valid password entered"+validPassword);
	}

	@When("user does not enter any credentials")
	public void user_does_not_enter_any_credentials() {
	    System.out.println("No credentials entered");
	}
}