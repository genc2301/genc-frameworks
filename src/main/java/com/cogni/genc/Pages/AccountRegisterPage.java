package com.cogni.genc.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cogni.genc.CommomMethods.CommonHelperActions;

public class AccountRegisterPage {
	
	public WebDriver driver;	
	
	public AccountRegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
		System.out.println("Inside AccountRegisterPage Constructor -"+driver);
		PageFactory.initElements(driver, this);
	}

	//@FindBy annotation replaces driver.findElement.
	// Code looks clean but bulky 
	
	@FindBy(xpath = ".//a[@class='btn btn-primary']")
	WebElement newCust;
	
	@FindBy(name = "firstname")
	WebElement fname;
	
	@FindBy(name = "lastname")
	WebElement lname;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "telephone")
	WebElement telephone;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirm")
	WebElement confirm;
	
	
   public void testLogin() {
		
		System.out.println("Inside testLogin()-"+driver);		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Inside test case");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		newCust.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(email));
		
	}
	
	
	public void enterDetails() {
		
		System.out.println("Inside enterDetails()-"+driver);
		fname.sendKeys("Rohit");
		lname.sendKeys("Ranjan");
		
		//Cannot implement common methods as Page Factory provides WebElement but we require By locator
		//CommonHelperActions.sendKeys(driver, email, "rohit125@gmail.com");
		
		email.sendKeys("rohit125@gmail.com");
		telephone.sendKeys("2323433343");
		newCust.sendKeys("rohit125");
//		password.sendKeys("rohit125");
		confirm.sendKeys("rohit125");
	}
	
}
