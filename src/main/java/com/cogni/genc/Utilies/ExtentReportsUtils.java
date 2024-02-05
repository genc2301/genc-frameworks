package com.cogni.genc.Utilies;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportsUtils {
	
	private static ExtentReports extentReport;
	
	static {
		if (extentReport == null) {
			System.out.println("Called to create instance ");
			extentReport = new ExtentReports(System.getProperty("user.dir") + "\\Test_Report.html");
		}
	}
	
	
	/**
	 * Start Test
	 * @param testName
	 * @param desc
	 * @return
	 */
	public static ExtentTest startTest(String testName, String desc) {
		ExtentTest test = extentReport.startTest(testName, desc);
		return test;
	}
	
	
	public static void endTest(ExtentTest extentTest) {
		extentReport.endTest(extentTest);
		extentReport.flush();
		
	}
}
