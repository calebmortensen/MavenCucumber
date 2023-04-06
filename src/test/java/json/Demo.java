package json;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.jayway.jsonpath.JsonPath;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo {
	static ChromeDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File jsonFile = new File(System.getProperty("user.dir")+".\\src\\test\\java\\json\\LoginLocators.json");
		
		Object myAccount_Menu = JsonPath.read(jsonFile, "$."+"Home_Page.MyAccount_Menu");
		
		Object register_MenuOption = JsonPath.read(jsonFile, "$."+"Home_Page.Register_MenuOption");
		
		Object login_MenuOption = JsonPath.read(jsonFile, "$."+"Home_Page.Login_MenuOption");
		
		Object email_TextBox = JsonPath.read(jsonFile, "$."+"Login_Page.Email_TextBox");
		
		Object password_TextBox = JsonPath.read(jsonFile, "$."+"Login_Page.Password_TextBox");
		
		Object login_Button = JsonPath.read(jsonFile, "$."+"Login_Page.Login_Button");
		
		Object registerAffiliate_Link = JsonPath.read(jsonFile, "$."+"Login_Page.RegisterAffiliate_Link");
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless", "--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		objectToElement(myAccount_Menu).click();
		objectToElement(login_MenuOption).click();
		objectToElement(email_TextBox).sendKeys("Amotooricap9@gmail.com");
		objectToElement(password_TextBox).sendKeys("12345");
		objectToElement(login_Button).click();
		if(objectToElement(registerAffiliate_Link).isDisplayed()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login NOT successful");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
		public static WebElement objectToElement(Object object) {
			WebElement element = null;
			String locatorTypeAndValue = object.toString();
			String[] locatorArray = locatorTypeAndValue.split(";");
			String locatorType = locatorArray[0];
			String locatorValue = locatorArray[1];
			if(locatorType.equalsIgnoreCase("ID")) {
				element = driver.findElement(By.id(locatorValue));
			}else if(locatorType.equalsIgnoreCase("NAME")) {
				element = driver.findElement(By.name(locatorValue));
			}else if(locatorType.equalsIgnoreCase("CLASSNAME")) {
				element = driver.findElement(By.className(locatorValue));
			}else if(locatorType.equalsIgnoreCase("LINK")){
					element = driver.findElement(By.linkText(locatorValue));	
		    }else if(locatorType.equalsIgnoreCase("CSS")) {
		    	    element = driver.findElement(By.cssSelector(locatorValue));
		    }else if(locatorType.equalsIgnoreCase("XPATH")) {
		    	element = driver.findElement(By.xpath(locatorValue));
		    }
			
			
			return element;
		}
	
	
	
}
