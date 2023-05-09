package com.caleb.utilities;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		
		if(extent==null) {
			
			extent = new ExtentReports(System.getProperty("user.dir")+"/src/test/java/reports/extent.html", true, DisplayOrder.OLDEST_FIRST);
			//extent.loadConfig(new File(System.getProperty("user.dir")+"/src/test/java/resources/config/ReportsConfig.xml"));
		}
		
		return extent;
	}
	
}
