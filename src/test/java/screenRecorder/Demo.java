package screenRecorder;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

		public static void main(String[] args) throws Exception {

		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("iPhone");
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		driver.close();
		
		ScreenRecorderUtil.stopRecord();

	}

	
}
// Update POM with Maven: Monte Screen Recorder.
// Download ScreenRecorderUtil.java from:  https://drive.google.com/file/d/1d_ecCGWEhWb911iD_aAd2vHS1L-4YBIp/view
// Ancillary info:  Site: http://www.randelshofer.ch/monte/