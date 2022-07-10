package com.utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class library {
	public static ExtentTest test;
	public static void customsendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, "test is good");
			
		} catch(Exception e){
			String msg=e.getMessage();
			System.out.println(msg);
			test.log(Status.FAIL, "test is bad");
			
		}
	
	}
	
	public static void custonclick(WebElement element) {
		try {
			element.click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void customscreenshot(WebDriver driver) {
	try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		File dst=new File("C:\\Users\\pc\\eclipse-workspace\\hybrid_freamework\\test.png");
		FileHandler.copy(src, dst);
		
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
		
		
	}
}
