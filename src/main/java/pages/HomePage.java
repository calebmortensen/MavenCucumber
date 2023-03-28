package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class HomePage {

	WebDriver driver;
	private ElementUtils elementUtils;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountDropMenu;

	@FindBy(linkText = "Login")
	private WebElement loginOption;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	public void clickOnMyAccount() {
		// myAccountDropMenu.click();
		elementUtils.clickOnElement(myAccountDropMenu, 15);
	}

	public LoginPage selectLoginOption() {
		// loginOption.click();
		elementUtils.clickOnElement(loginOption, 15);
		loginOption.click();
		return new LoginPage(driver);
	}
}
