package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentinformation_Page {
	
	public Paymentinformation_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[@href='#'])[4]")
	private WebElement backbutton;
	
	@FindBy(xpath = "(//input[@value='Continue'])[5]")
	private WebElement conituebutton;

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getConituebutton() {
		return conituebutton;
	}
	

}
