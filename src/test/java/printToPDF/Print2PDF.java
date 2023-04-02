package printToPDF;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print2PDF {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();  //FirefoxOptions
		chromeOptions.addArguments("--headless", "--remote-allow-origins=*");
		//chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Pdf pdf = driver.print(new PrintOptions());
		Files.write(Paths.get(".//src//test/java//printToPDF//PDFs//InternetHerokuHomePage.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		driver.quit();
	}
	
}
