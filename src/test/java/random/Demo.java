package random;

import java.util.Random;
import org.openqa.selenium.By;
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
		driver.get("http://omayo.blogspot.com/");
		
		
		
		int numberOfRadioOptions = driver.findElements(By.xpath("//input[@name='gender']")).size();
		
		System.out.println("Number of Options: "+ numberOfRadioOptions);
		
		int randomNumber = generateRandomNumber(numberOfRadioOptions); //Gender index 0 or 1, so total of 2
		
		driver.findElement(By.xpath("(//input[@name='gender'])["+randomNumber+"]")).click();
		
		//int linksCount = driver.findElements(By.xpath("div[@id='LinkList1']/div/ul/li/a")).size();
		//int randomNumber = generateRandomNumber(linksCount);
		//driver.findElement(By.xpath("(div[@id='LinkList1']/div/ul/li/a["+(randomNumber)+"]")).click();

	}
	
	public static int generateRandomNumber(int number) {
		
		Random random = new Random();
		int rNum = random.nextInt(number);
		return ++rNum;
	}

}
