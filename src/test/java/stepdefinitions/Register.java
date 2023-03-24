package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Register {
	WebDriver driver;
	
	@Given("Navigate to Register Account page")
	public void Navigate_to_Register_Account_page() {
		
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	@When ("user enters the details into below fields")
	public void user_enter_details_into_below_field(DataTable dataTable) {
		
		 Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		 driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
		 driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
		 driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
		 driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
		 driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
		 driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
	}
	
	@When("selects Privacy Policy field")
	public void selects_privacy_policy_field() {
		driver.findElement(By.name("agree")).click();
	}

	@When("clicks on Continue button")
	public void clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	@When("selects Yes Radio for Subscribe to Newsletter")
	public void selects_yes_radio_for_subscribe_to_newsletter() {
	    driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
	}

	@Then("Account is successfully created")
	public void account_is_successfully_created() {
		Assert.assertEquals("Your Account Has Been Created!",driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
	}

	

	
}
