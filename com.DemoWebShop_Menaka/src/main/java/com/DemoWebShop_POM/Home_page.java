package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutbutton;
	
	@FindBy(partialLinkText = "Addresses")
	 private WebElement addresslink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booklink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcart;

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getBooklink() {
		return booklink;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	public WebElement getAddresslink() {
		return addresslink;
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement searchbutton;

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	

}
