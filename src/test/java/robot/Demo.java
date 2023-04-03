package robot;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Demo {

	public static void main(String[] args) throws AWTException, IOException {
		
		robotTest();
	}

	
	private static void robotTest() throws AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		
		Robot robot = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		robot.createScreenCapture(rectangle);
		BufferedImage srcImage = robot.createScreenCapture(rectangle);
		ImageIO.write(srcImage, "PNG", new File(".//src//test//java//robot//screenshots//robot.png"));
		
		
		/* String path = System.getProperty("user.dir")+".//src//test//java//robot//screenshots//robot.png";
		 * Rectangle rectangle = new Rectangle(25,50,1000,300); //x,y,width,height
		 * BufferedImage srcImage = robot.createScreenCapture(rectangle);
		 * ImageIO.write(srcImage, "PNG", new
		 * File(".//src//test//java//robot//screenshots//robot.png"));
		 */
		
		
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
}
}