package com.cogni.genc.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cogni.genc.CommomMethods.*;

public class AccountLoginPage {
	
	WebDriver driver;
	CommonHelperActions actions = new CommonHelperActions();
	
	public AccountLoginPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("this.driver-> "+this.driver);
		System.out.println("driver-> "+driver);
	}
	
	public static final By txtEmail = By.xpath(".//input[@name='email']");
	public static final By txtPassword = By.id("input-password");
	public static final By btnLogin = By.xpath(".//input[@type='submit']");
	
	String txt = "TestCase";
	
	 public void enterCredentials(WebDriver driver) {
		 
		 System.out.println("4>> Driver Id-"+driver);
		 
		 driver.findElement(txtEmail).sendKeys("rohit123@gmail");
		 driver.findElement(txtPassword).sendKeys("rohit123");
		 
	 }
	 
	 public void clickLoginButton() throws InterruptedException {
		 
		 //actions.click(driver, btnLogin);
		 CommonHelperActions.waitAndclick(driver, btnLogin);
		 
	 }
	 
	 public void validateLogin(WebDriver driver) {
		 
		 if(driver.findElements(By.xpath(".//div[contains(@class,'alert')]")).size() >0) {
			 System.out.println("Login Failed");
		 }
	 }

	
}
