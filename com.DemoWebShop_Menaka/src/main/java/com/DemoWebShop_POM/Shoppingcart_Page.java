package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcart_Page {
	
	public Shoppingcart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox;
	
	@FindBy(name = "discountcouponcode")
	private WebElement discountcouponcode;
	
	@FindBy(id = "CountryId")
	private WebElement CountryId;
	
	@FindBy(id = "StateProvinceId")
	private WebElement statedropdown;
	
	@FindBy(id = "ZipPostalCode")
	private WebElement ZipPostalCode;
	
	@FindBy(id = "termsofservice")
	private WebElement agreecheckbox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbutton;

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDiscountcouponcode() {
		return discountcouponcode;
	}

	public WebElement getCountryId() {
		return CountryId;
	}

	public WebElement getStatedropdown() {
		return statedropdown;
	}

	public WebElement getZipPostalCode() {
		return ZipPostalCode;
	}

	public WebElement getAgreecheckbox() {
		return agreecheckbox;
	}
	
	

}
