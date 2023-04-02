package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebElement button = driver.findElement(By.id("alert1"));
		javaScriptClick(driver, button);

	}

	private static void javaScriptClick(ChromeDriver driver, WebElement button) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", button);

	}
	// driver.findElement(By.xpath("//div[@id='car']/button"));
	// WebElement buttonElement = driver.findElement(By.id("alert1"));
	// jse.executeScript("prompt('What is your name?')");
	// jse.executeScript("alert('Caleb Mortensen')");
	// jse.executeScript("confirm('Do you want to proceed?')");

}
