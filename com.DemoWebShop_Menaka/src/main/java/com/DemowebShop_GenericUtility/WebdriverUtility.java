 package com.DemowebShop_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void webPageScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screen=(TakesScreenshot) driver;
		File tep = screen.getScreenshotAs(OutputType.FILE);
		 File des=new File(JavaAllPath.screenshot);
		 FileHandler.copy(tep, des);
		}
	
	public void webElementScreenshot(WebElement ele) throws IOException {
		
		File tep = ele.getScreenshotAs(OutputType.FILE);
		File des=new File(JavaAllPath.screenshot);
		FileHandler.copy(tep, des);
	}
	
	public void selectByVisibleText(WebElement ele,String text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void scrollIntoView(WebDriver driver,WebElement ele) {
		JavascriptExecutor jvs=(JavascriptExecutor) driver;
		jvs.executeScript("arguments[0].scrollIntoView(true);", ele);
		
	}
	public void javascriptClic(WebDriver driver,WebElement ele) {
		JavascriptExecutor jvs=(JavascriptExecutor) driver;
		jvs.executeScript("arguments[0].click();", ele);
	}
	public void alertSwitchAccept(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
}
