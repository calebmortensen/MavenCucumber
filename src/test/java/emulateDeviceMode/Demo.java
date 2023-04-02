package emulateDeviceMode;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		/*
		 * devTools.send(Emulation.setDeviceMetricsOverride( //Dimenesions iPhone 12 Pro
		 * 390, 840, 100, true, Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty()));
		 */
		Map<String,Object> dm = new HashMap<String,Object>();
		dm.put("width", 390);
		dm.put("height", 840);
		dm.put("deviceScaleFactor", 100);
		dm.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", dm);
		
		driver.get("https://www.selenium.dev/");
	}

}
