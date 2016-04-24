package com.GenericLib;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Initilization {
	
	public static WebDriver driver = null;
	public static Properties prop = null;
	public static ExtentReports report = null;
	public static ExtentTest logger = null;
	
	@BeforeTest
	public void setup(){
		
	}
	
	@AfterTest
	public void teadDown(){
		driver.quit();
	}

}
