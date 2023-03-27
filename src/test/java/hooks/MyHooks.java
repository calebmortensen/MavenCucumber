package hooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class MyHooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		Properties prop = ConfigReader.initializeProperties();
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		DriverFactory.getDriver();
		WebDriverManager.chromedriver().setup(); //NOTE		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);				
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
