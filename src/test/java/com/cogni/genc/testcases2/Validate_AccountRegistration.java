package com.cogni.genc.testcases2;

import org.testng.annotations.Test;

import com.cogni.genc.Pages.AccountRegisterPage;

public class Validate_AccountRegistration extends BaseTest{
	
	AccountRegisterPage acc;
	
	@Test
	public void check_EnterDetails() {
		
		System.out.println("Inside check_EnterDetails()-"+driver);
		acc = new AccountRegisterPage(driver);
		acc.testLogin();
		acc.enterDetails();
	}

}
