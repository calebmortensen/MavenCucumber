package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {

	
	@Given("Navigate to Register Account page")
	public void Navigate_to_Register_Account_page() {
		
		System.out.println("Navigates to Register Account page");
	}
	//From Register.feature, setup an @When User enters below details |firstname| |caleb| etc...
	//Map<String, String> map = dataTable.asMap(String.class,String.class);
	//System.out.println("User has entered first name as "+map.get("firstname"); etc
	
	@When("firstname entered in First Name field {string}")
	public void firstname_entered_in_First_Name_field(String firstName) {
		System.out.println("firstname entered in First Name field: "+firstName);
	}
	
	@When("lastname entered in Last Name field {string}")
	public void lastname_entered_in_last_name_field(String lastName) {
	    System.out.println("Last Name entered: "+ lastName);
	}

	@When("email entered in Email field {string}")
	public void email_entered_in_email_field(String email) {
	    System.out.println("Email entered: "+email);
	}

	@When("enters telephone in Telephone field {string}")
	public void enters_telephone_in_telephone_field(String phone) {
	    System.out.println("phone entered: "+phone);
	}

	@When("password entered in Password field {string}")
	public void password_entered_in_password_field(String password) {
	    System.out.println("password entered: "+password);
	}

	@When("password entered in Confirm Password field {string}")
	public void password_entered_in_confirm_password_field(String confirmPassword) {
		System.out.println("confirm password entered: "+confirmPassword);
	}

	@When("selects Privacy Policy field")
	public void selects_privacy_policy_field() {
	    System.out.println("Privacy filed selected");
	}

	@When("clicks on Continue button")
	public void clicks_on_continue_button() {
		 System.out.println("Continue selected");
	}

	@Then("Account is successfully created")
	public void account_is_successfully_created() {
	    System.out.println("Account is created");
	}

	@When("selects Yes Radio for Subscribe to Newsletter")
	public void selects_yes_radio_for_subscribe_to_newsletter() {
	    System.out.println("Radio button selected for: Yes");
	}

	@When("no details entered")
	public void no_details_entered() {
	    System.out.println("No Details entered");
	}

	@When("clicks Continue button")
	public void clicks_continue_button() {
	    System.out.println("Continue selected");
	}

	@Then("Warning message displayed")
	public void warning_message_displayed() {
	    System.out.println("Warning displayed");
	}

	@Then("Warning message about duplicate email address is displayed")
	public void warning_message_about_duplicate_email_address_is_displayed() {
	    System.out.println("Duplicate email address message displayed");
	}
}
