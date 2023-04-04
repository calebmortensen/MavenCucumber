package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class AutoItUploader {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		Actions actions = new Actions(driver);
		actions.moveToElement(chooseFile).click().build().perform();
		Thread.sleep(3000);
		String autoItScriptFilePath = System.getProperty("user.dir")+".\\src\\test\\java\\autoIT\\AutoITUpload.exe";
		String fileToBeUploadedPath = System.getProperty("user.dir")+".\\src\\test\\java\\autoIT\\FileToUpload.txt";
		String[] cmd = {autoItScriptFilePath,fileToBeUploadedPath};
		Runtime.getRuntime().exec(cmd);
		
		//driver.findElement(By.id("file-submit")).click();
		
	
	}

}
