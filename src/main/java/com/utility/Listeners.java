package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

	ExtentReports extent=Extentreportgenerator.getreports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		library.test=extent.createTest(result.getTestClass().getName()+"--"+result.getMethod().getMethodName());
		extenttest.set(library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		extenttest.get().log(Status.PASS, "test case is pass");
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "test case is fail");

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "test case is skip");

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	

}
