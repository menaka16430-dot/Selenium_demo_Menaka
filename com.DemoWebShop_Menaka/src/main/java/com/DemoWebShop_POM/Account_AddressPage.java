package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_AddressPage {
	public Account_AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deletebutton;
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewbutton;

	public WebElement getDeletebutton() {
		return deletebutton;
	}

	public WebElement getAddNewbutton() {
		return addNewbutton;
	}
	
	

}
