package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {

	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Text_emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement Text_password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;

	
	
	
	
	
	public WebElement getText_emailid() {
		return Text_emailid;
	}

	
	public WebElement getText_password() {
		return Text_password;
	}

	

	public WebElement getBtn_login() {
		return btn_login;
	}

	
	
}
