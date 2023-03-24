package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		DriverFactory.initializeBrowser("chrome");
		DriverFactory.getDriver();
		WebDriverManager.chromedriver().setup(); //NOTE		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);				
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
