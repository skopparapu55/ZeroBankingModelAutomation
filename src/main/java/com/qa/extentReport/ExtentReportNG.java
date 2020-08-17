package com.qa.extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.qa.base.Base;

public class ExtentReportNG  extends Base {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporters;
	public static ExtentReports generateExtentReport()
	{
		String FilePath = System.getProperty("user.dir")+"//Reports//index.html";
		reporters = new ExtentSparkReporter(FilePath);
		reporters.config().setDocumentTitle("Web Automation");
		reporters.config().setReportName("Web Results");
		extent = new ExtentReports();
		extent.attachReporter(reporters);
		extent.setSystemInfo("Name", "S");
		return extent;
	}
	
	
	

}
