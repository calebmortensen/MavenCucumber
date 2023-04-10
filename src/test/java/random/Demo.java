package random;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");

		// Generate Random Number for selecting Web Elements randomly
		int numberOfRadioOptions = driver.findElements(By.xpath("//input[@name='gender']")).size();
		System.out.println("Number of Options: " + numberOfRadioOptions);
		int randomNumber = generateRandomNumber(numberOfRadioOptions); // Gender index 0 or 1, so total of 2
		driver.findElement(By.xpath("(//input[@name='gender'])[" + randomNumber + "]")).click();

			
		// List Cookies
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		//Delete cookies for website
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("Amotooricap9@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		Thread.sleep(5000);
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		
		
		// driver.quit();
		// int linksCount =
		// driver.findElements(By.xpath("div[@id='LinkList1']/div/ul/li/a")).size();
		// int randomNumber = generateRandomNumber(linksCount);
		// driver.findElement(By.xpath("(div[@id='LinkList1']/div/ul/li/a["+(randomNumber)+"]")).click();

	}

	public static int generateRandomNumber(int number) {

		Random random = new Random();
		int rNum = random.nextInt(number);
		return ++rNum;
	}

}
