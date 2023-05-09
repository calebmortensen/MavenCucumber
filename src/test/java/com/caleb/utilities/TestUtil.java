package com.caleb.utilities;

import com.caleb.base.TestBase;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;

public class TestUtil extends TestBase {

	
	public static String screenshotPath;
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":","_").replace(" ", "_");
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"/src/test/java/takeScreenShot/"+ screenshotName+".jpg"));
		
	}
	
	
}
