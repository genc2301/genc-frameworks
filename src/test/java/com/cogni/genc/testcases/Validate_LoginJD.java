package com.cogni.genc.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Validate_LoginJD extends BaseTest{

	@Test
	public void testLogin() {
		
		System.out.println("5>> Driver Id-"+driver);
		
		driver.get("https://hcm8preview.sapsf.com/sf/start?_s.crb=hOXWBo6JQwftlKn%252fPnvaejyooYHinSYWfpJf2fy3s3I%253d#/login");
		System.out.println("Inside test case");
		driver.findElement(By.xpath(".//input[@name='username']"));
		
		
	}
	
	
}
