package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportgenerator {
	public static ExtentReports extent;
	
	public static ExtentReports getreports() {
		String extentpath=System.getProperty("user.dir")+"\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentpath);
		reporter.config().setDocumentTitle("Automation Test Reporter");
		reporter.config().setReportName("hybrid framework");
    	reporter.config().setTheme(Theme.DARK);
    	
    	
    	extent=new ExtentReports();
    	extent.attachReporter(reporter);
    	extent.setSystemInfo("project name", "flipkart");
    	extent.setSystemInfo("module name", "shopping");
    	extent.setSystemInfo("QA", "ravindra");
    	extent.setSystemInfo("OS", "windows");
    	return extent;
    	


   
    	
    	
	}
	

}
