package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmorder_Page {
	
	public Confirmorder_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmbutton;

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}
	

}
