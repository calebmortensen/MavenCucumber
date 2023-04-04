package autoIT;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		String autoItScriptFilePath = System.getProperty("user.dir")+".\\src\\test\\java\\autoIT\\AutoITScriptDemo.exe";
		String titleOnBox = "Caleb A Mortensen";
		String messageOnBox = "Welcome to Selenium Training";
		String[] cmd = {autoItScriptFilePath, titleOnBox, messageOnBox};
		
		Runtime.getRuntime().exec(cmd);
	}

}
