package com.cogni.genc.testcases;

import org.testng.annotations.Test;
import com.cogni.genc.global.BaseTest;

public class Validate_LoginPageTest extends BaseTest{

	
	@Test
	public void testLogin() throws InterruptedException {
		
//		System.out.println("5>> Driver Id-"+driver);	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		System.out.println("Inside test case");
		page.enterCredentials(driver);
		page.clickLoginButton();
		page.validateLogin(driver);
		
	}
	
	
}
