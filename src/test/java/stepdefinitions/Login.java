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
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	WebDriver driver; 
	//Note: Regular expressions: ^, $, (.+) are used for parameters VS Cucumber "" expressions
	//Feature: Scenario Outline: and Examples:
		
	private LoginPage loginPage;
	
	@Given("User navigates to Login page")
	public void user_navigate_to_login_page() {
		
		DriverFactory.getDriver();
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		homePage.selectLoginOption();
	}

	@When("^User enters email address (.+)")
	public void user_enters_email_address(String email) {
		loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(email);
	}

	@When("^Enter valid password (.+)")
	public void enter_valid_password(String passwordText) {
		
		loginPage.password(passwordText);
		
	}

	@When("Clicks on Login button")
	public void clicks_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		AccountPage accountPage = new AccountPage(driver);
		
		Assert.assertTrue(accountPage.displayStatusOfEditYourAccountInformationOption());
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		
		loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress(CommonUtils.getEmailWithTimeStamp());
		
	}

	@When("Enter invalid password {string}")
	public void enter_invalid_password(String invalidPassword) {
		loginPage.password(invalidPassword);
	}

	@Then("user should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		Assert.assertTrue(loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
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