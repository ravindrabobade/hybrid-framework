package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.loginpom;
import com.utility.Baseclass;
import com.utility.library;

public class Test_001 extends Baseclass {

	@Test
	public void verifytest001() {
		 loginpom login=PageFactory.initElements(driver, loginpom.class);
		login.getText_emailid().sendKeys("TEST");
		login.getText_password().sendKeys("123456");
		login.getBtn_login().click();
	library.customscreenshot(driver);
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Facebook – log in or sign up";
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
		
		
	}
	@Test
	public void verifytest002() {
		 loginpom login=PageFactory.initElements(driver, loginpom.class);
		login.getText_emailid().sendKeys(excel.getstringvalue("sheet1", 0, 0));
		login.getText_password().sendKeys("123456");
		login.getBtn_login().click();
	
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Facebook – log in or sign up";
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
		
		
	}
	
	@Test               //another way to utilise library class
	public void verifytest003() {
		 loginpom login=PageFactory.initElements(driver, loginpom.class);
		library.customsendkeys(login.getText_emailid(), excel.getstringvalue("Sheet1", 0, 0) );
		library.customsendkeys(login.getText_password(),"123456" );
		
		
		login.getBtn_login().click();
	library.custonclick(login.getBtn_login());
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Facebook – log in or sign up";
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
		
		
	}
}
