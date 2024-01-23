package com.cogni.genc.testcases2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.cogni.genc.Pages.AccountLoginPage;

public class BaseTest {
	
	
	protected WebDriver driver;
	AccountLoginPage page;
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("1>>Driver Id-"+driver);
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--headless");	
//		driver = new ChromeDriver(options);
		
		System.out.println("Before Initialization-"+driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("After Initialization-"+driver);
		
	}
	
	@BeforeTest
	public void initializeObject() {
		
		page = new AccountLoginPage(driver);
	}
	

}
