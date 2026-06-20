package com.DemowebShop_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerUtility implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot screen=(TakesScreenshot)BaseTest.sDriver;
		File tep = screen.getScreenshotAs(OutputType.FILE);
		File des=new File(JavaAllPath.screenshot);
		try {
			FileHandler.copy(tep, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
