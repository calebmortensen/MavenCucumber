package autoIT;

import java.io.IOException;
import java.io.File;

public class AutoItDownload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String autoItScriptFilePath = System.getProperty("user.dir")+".\\src\\test\\java\\autoIT\\AutoItDownload.exe";
		String downloadFilePath = System.getProperty("user.dir")+".\\src\\test\\java\\autoIT\\dummy.txt";
		String fileURLPath = "https://the-internet.herokuapp.com/download/dummy.txt";
		
		String[] cmd = {autoItScriptFilePath, downloadFilePath, fileURLPath};
		Runtime.getRuntime().exec(cmd);
		
		Thread.sleep(3000);
		
		
		File file = new File(downloadFilePath);
		
		if(file.exists()) {
			
			System.out.println("File was successfully downloaded");
		}

	}

}
