package com.cogni.genc.global;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.cogni.genc.Pages.AccountLoginPage;

public class BaseTest {
	
	protected WebDriver driver;
	protected AccountLoginPage page;
	
	@BeforeSuite
	public void setUp() {
		
//		System.out.println("1>>Driver Id-"+driver);	
//		System.out.println("Before Initialization-"+driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("After Initialization-"+driver);
		
	}
	
	
	@BeforeTest
	public void initializeObject() {
		
		page = new AccountLoginPage(driver);
	}
	
	
	/**
	 * Returns driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

}
