package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-email")
	private WebElement emailField;
	@FindBy(id="input-password")
	private WebElement password;
	@FindBy(id="//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissibl')]")
	private WebElement warningMessage;
	
	public void enterEmailAddress(String emailText) {
		emailField.sendKeys(emailText);
	}
		
	public void password (String passwordText) {
		password.sendKeys(passwordText);
	}
		
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String getWarningMessageText() {
		return warningMessage.getText();
	}
	
	
	
}
