package com.utility;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static configdataprovider config;
	public static exceldataprovider excel;
	
	@BeforeSuite
	public void BS() throws Exception {
		config=new configdataprovider();
		excel=new exceldataprovider();
		
		
		
	}
	
	
@BeforeMethod
public void setup() {
	
	
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		
		
	
	driver.get(config.getstageurl());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

@AfterMethod
public void teardown() {
	
	driver.close();
}




}

