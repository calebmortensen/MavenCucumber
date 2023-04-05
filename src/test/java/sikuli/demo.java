package sikuli;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		//Image Recognition with Selenium and Sikuli
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");

		Screen screen = new Screen();
		Pattern myAccountOption = new Pattern(".\\src\\test\\java\\screeenImages\\MyAccount.PNG");
		Pattern EmailAddress = new Pattern(".\\src\\test\\java\\screeenImages\\mailAddress.PNG");
		Pattern LoginButton = new Pattern(".\\src\\test\\java\\screeenImages\\LoginButton.PNG");
		Pattern LoginImage = new Pattern(".\\src\\test\\java\\screeenImages\\LoginImage.PNG");
		Pattern PasswordImage = new Pattern(".\\src\\test\\java\\screeenImages\\PasswordImage.PNG");

		screen.wait(myAccountOption, 10);

		screen.click(myAccountOption);
		screen.click(LoginImage);
		screen.type(EmailAddress, "amotooricap9@gmail.com");
		screen.type(PasswordImage, "12345");
		screen.click(LoginButton);

	}
}