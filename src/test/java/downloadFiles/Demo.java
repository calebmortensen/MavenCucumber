package downloadFiles;

import java.io.File;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws MalformedURLException {
		
		//Date Created: 04/11/2023
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page7.html");
		
		
		WebElement downloadLink = driver.findElement(By.linkText("ZIP file"));
		String fileToDownloadAbsoluteLocation = downloadLink.getAttribute("href");
		URL fileToDownload = new URL(fileToDownloadAbsoluteLocation);
		String hostURL = fileToDownload.getHost();
		int port = fileToDownload.getPort();
		
		
		HttpClient hClient = new HttpClient();
		hClient.getParams().setCookiePolicy(CookiePolicy.RFC_2965);
		HostConfiguration hostConfig = new hostConfiguration();
		hostConfig.setHost(hostURL,port);
		Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
		HttpState cookieState = new HttpState();
		for (org.openqa.selenium.Cookie : cookies) {
			Cookie httpClientCookie = new Cookie(seleniumCookie.getDomain(), seleniumCookie.getName(), seleniumCookie.getValue(),
			cookieState.addCookie(httpClientCookie);
			}
		
		HttpMethod getFileRequest = new GetMethod(fileToDownloadAbsoluteLocation);
		boolean followRedirects = true;
		getFileRequest.setFollowRedirects(followRedirects);
		hClient.executeMethod(getFileRequest);
		String downloadPath = System.getProperty("user.dir")+ "\\downloads";
		File downloadedFile = new File(downloadPath+"\\DownloadDemo-master.zip");
		FileUtils.copyInputStreamToFile(getFileRequest.getResponseBodyAsStream(), downloadedFile);
		getFileRequest.releaseConnection();
		
		Thread.sleep(5000);
		
		if(downloadedFile.exists()) {
			System.out.println("ZIP file Download Successfully");
		}else {
			System.out.println("ZIP file Download Failed");
		}
		
		driver.quit();
		
		}

}
