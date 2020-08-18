package com.qa.extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qa.base.Base;

public class ExtentReportNG  extends Base {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentReports generateExtentReport()
	{
		String FilePath = System.getProperty("user.dir")+"\\Reports\\index.html";
		reporter = new ExtentSparkReporter(FilePath);
		reporter.config().setReportName("Web Results");
		reporter.config().setDocumentTitle("Web Automation");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Name", "Swetha");
		return extent;
	}
	
	
	

}
