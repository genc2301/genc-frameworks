package com.cogni.genc.testcases;

import org.testng.annotations.Test;
import com.cogni.genc.global.BaseTest;
import com.cogni.genc.Pages.AccountRegisterPage;
import com.cogni.genc.CommomMethods.*;

public class Validate_AccountRegistration extends BaseTest{
	
	AccountRegisterPage acc;
	
	@Test
	public void check_EnterDetails() {
		
		System.out.println("Inside check_EnterDetails()-"+driver);
		System.out.println();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		acc = new AccountRegisterPage(driver);
		acc.testLogin();
		acc.enterDetails();
	}

}
