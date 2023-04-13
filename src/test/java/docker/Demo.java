package docker;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setBrowserName("firefox");  //chrome  MicrosoftEdge firefox
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
		
		//driver.manage().window().maximize();
		driver.get("https://www.heroku.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}