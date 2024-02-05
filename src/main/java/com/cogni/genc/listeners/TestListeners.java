package com.cogni.genc.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cogni.genc.Utilies.ExtentReportsUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.cogni.genc.global.*;


public class TestListeners implements ITestListener{

	private static ExtentTest extentTest;
	private static ExtentReports extentReport;
	

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Stated");
		String className = result.getTestClass().getRealClass().getSimpleName(); // get className		
		extentTest = ExtentReportsUtils.startTest(className, "Test to check login functionality");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Successfull");
		extentTest.log(LogStatus.PASS, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed");
		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseTest) currentClass).getDriver();

		try {
			String str = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

			extentTest.log(LogStatus.FAIL, result.getMethod().getMethodName(),extentTest.addBase64ScreenShot("data:image-png;base64," + str));
			extentTest.log(LogStatus.FAIL, "Error : " + result.getThrowable().toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void onTestSkipped(ITestResult result) {
			
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		ExtentReportsUtils.endTest(extentTest);
		
	}

	
	
	

	
	
	

}
