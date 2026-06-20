package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_Page {
	
	public Billing_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	private WebElement Continuebutton;

	public WebElement getContinuebutton() {
		return Continuebutton;
	}
	
	

}
