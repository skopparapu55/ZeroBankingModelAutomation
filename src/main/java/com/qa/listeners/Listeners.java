package com.qa.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.base.Base;
import com.qa.extentReport.ExtentReportNG;

public class Listeners extends Base implements ITestListener  {
	ExtentReports extent = ExtentReportNG.generateExtentReport();
	ExtentTest test;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
		}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "successful");
		
		}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try
		{
			CaptureScreen(result.getMethod().getMethodName());
			System.out.println("Refresh your project");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

	
}
