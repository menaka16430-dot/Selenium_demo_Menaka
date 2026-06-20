package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booksearch_page {
	
	public Booksearch_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "As")
	private WebElement advancedsearch;
	
	@FindBy(id = "Cid")
	private WebElement category;
	
	@FindBy(id = "Mid")
	private WebElement manufacturer;
	
	@FindBy(id = "Pf")
	private WebElement pricerangefrom;
	
	@FindBy(id = "Pt")
	private WebElement pricerangeto;
	
	@FindBy(xpath = "Sid")
	private WebElement SearchInproductdescriptions;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement search;

	public WebElement getAdvancedsearch() {
		return advancedsearch;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getManufacturer() {
		return manufacturer;
	}

	public WebElement getPricerangefrom() {
		return pricerangefrom;
	}

	public WebElement getPricerangeto() {
		return pricerangeto;
	}

	public WebElement getSearchInproductdescriptions() {
		return SearchInproductdescriptions;
	}

	public WebElement getSearch() {
		return search;
	}
	

}
