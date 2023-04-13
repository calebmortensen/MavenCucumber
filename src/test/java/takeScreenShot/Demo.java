package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@Test
	public void sampleSeleniumCode() throws IOException {
		
		Reporter.log("Test execution started");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Reporter.log("Navigated to application URL");
		
		//Take Screenshot
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File(".\\src\\test\\java\\takeScreenShot\\ScreenShots\\ScreenShot1.png"));
		
		driver.close();
		Reporter.log("Test execution Complete");
		
		//add to testng.xml <listener class-name"org.uncommons.reportng.HTMLReporter"/>
		//add to testng.xml <listener class-name="org.uncommons.reportng.JUnitXMLReporter"/>
		
		/*
		 * System.setProperty("org.uncommons.reportng.escape-output", "false");
		 * Reporter.
		 * log("<img src=\".\\src\\test\\java\\takeScreenShot\\ScreenShots\\ScreenShot1.png\" />"
		 * );
		 */
	}
}
