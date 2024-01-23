package com.cogni.genc.testcases2;

import org.testng.annotations.Test;
import com.cogni.genc.Pages.AccountLoginPage;

public class Validate_LoginPageTest extends BaseTest{

	
	@Test
	public void testLogin() {
		
		System.out.println("5>> Driver Id-"+driver);	
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("Inside test case");
		page.enterCredentials(driver);
		page.clickLoginButton();
		page.validateLogin(driver);
	
		
	}
	
	
}
