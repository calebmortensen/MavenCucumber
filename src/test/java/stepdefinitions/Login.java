package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver; 
	//Note: Regular expressions: ^, $, (.+) are used for parameters VS Cucumber "" expressions
	//Feature: Scenario Outline: and Examples:
		
	@Given("User navigates to Login page")
	public void user_navigate_to_login_page() {
		DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@When("^User enters email address (.+)")
	public void user_enters_email_address(String email) {
		driver.findElement(By.id("input-email")).sendKeys(email);
	}

	@When("^Enter valid password (.+)")
	public void enter_valid_password(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@When("Clicks on Login button")
	public void clicks_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		driver.findElement(By.id("input-email")).sendKeys(invalidEmail);
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPassword) {
		driver.findElement(By.id("input-password")).sendKeys(invalidPassword);
	}

	@Then("user should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissibl')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String email) {
		driver.findElement(By.id("input-email")).sendKeys(email);
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Given("user navigates to Login page")
	public void user_navigates_to_login_page() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@When("Enters Valid password {string}")
	public void enters_valid_password(String password) {
		driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@When("user does not enter any credentials")
	public void user_does_not_enter_any_credentials() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissibl')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}
}