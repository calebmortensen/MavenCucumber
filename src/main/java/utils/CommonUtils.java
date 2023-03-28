package utils;

import java.util.Date;

public class CommonUtils {

	public static String getEmailWithTimeStamp() {
		Date date = new Date();
		//System.out.println("amotoori"+date.toString().replace(" ", "_").replace(":", " ") + "@gmail.com");
		return "amotoori"+date.toString().replace(" ", "_").replace(":", " ") + "@gmail.com";
		//System.exit(0);
	}
	
}
