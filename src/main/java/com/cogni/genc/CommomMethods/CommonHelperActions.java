package com.cogni.genc.CommomMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
}
