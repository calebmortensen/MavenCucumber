package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Search {
	WebDriver driver;
	
	@Given("Navigate to application")
	public void navigate_to_application() {
		
		driver = DriverFactory.getDriver();
	    
	}

	@When("a valid product is entered in Search field {string}")
	public void a_valid_product_is_entered_in_search_field(String validProductText) {
		driver.findElement(By.name("search")).sendKeys("validProductText");
	}

	@When("Search button selected")
	public void search_button_selected() { //may not work
	    driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
	}

	@Then("Valid product is displayed in search results")
	public void valid_product_is_displayed_in_search_results() {
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}

	@When("a non-existent product is entered in Search field {string}")
	public void a_non_existent_product_is_entered_in_search_field(String invalidProduct) {
		driver.findElement(By.name("search")).sendKeys("invalidProduct");
	}

	@Then("message prompts user there is No Product Matching")
	public void message_prompts_user_there_is_no_product_matching() {
		Assert.assertEquals("There is no product that matches the search criteria.", driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText());
	    
	}
	
}
