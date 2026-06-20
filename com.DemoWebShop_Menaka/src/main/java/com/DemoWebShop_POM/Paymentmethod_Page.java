package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentmethod_Page {
	
	public Paymentmethod_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "paymentmethod_0")
	private WebElement cashondelivery;
	
	@FindBy(id = "paymentmethod_1")
	private WebElement check;
	
	@FindBy(id = "paymentmethod_2")
	private WebElement creatidcart;
	
	@FindBy(id = "paymentmethod_3")
	private WebElement purchaseorder;
	
	@FindBy(xpath = "(//input[@value='Continue'])[4]")
	private WebElement continuebutton;

	public WebElement getCashondelivery() {
		return cashondelivery;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getCreatidcart() {
		return creatidcart;
	}

	public WebElement getPurchaseorder() {
		return purchaseorder;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	

}
