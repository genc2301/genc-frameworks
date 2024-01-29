package com.cogni.genc.CommomMethods;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class CommonHelperActions {

	public void click(WebDriver driver , By locator) {
		
		try{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator);				
		}catch(StaleElementReferenceException  | NoSuchElementException e1) {
			driver.navigate().refresh();
			driver.findElement(locator);	
		}
	}
	
	
public void sendKeys(WebDriver driver , By locator, String str) {
		
		try{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).sendKeys(str);;				
		}catch(StaleElementReferenceException  | NoSuchElementException e1) {
			driver.navigate().refresh();
			driver.findElement(locator);	
		}
	}

public void selectByValue(WebDriver driver , By locator, String str) {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(locator));
	Select sel = new Select(driver.findElement(locator));
	sel.selectByValue(str);
	
}


// Wait for sometime before clicking
public static void waitAndclick(WebDriver driver , final By by) throws InterruptedException {
	try {
		new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
					.ignoring(NoSuchElementException.class)
						.until(new Function<WebDriver, WebElement>() {
											public WebElement apply(WebDriver driver) {
											return driver.findElement(by);
											}
		});
		driver.findElement(by).click();
	} catch (StaleElementReferenceException sere) {
		// simply retry finding the element in the refreshed DOM
		driver.findElement(by).click();
	}catch (WebDriverException web) {
		// simply retry finding the element in the refreshed DOM
		try { 
			new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		}catch(Exception e) {
			// Catching other exceptions if any
			Thread.sleep(5000);
			driver.findElement(by).click();
			//				e.printStackTrace();
		}
	}catch (Exception e) {
		// Catching other exceptions if any
		e.printStackTrace();
	}
}
	
}
