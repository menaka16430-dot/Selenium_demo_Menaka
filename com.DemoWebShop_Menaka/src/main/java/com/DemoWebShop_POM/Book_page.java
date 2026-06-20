package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_page {
	public Book_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortby;
	
	@FindBy(id = "products-pagesize")
	private WebElement perpage;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewas;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addtocart;

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getPerpage() {
		return perpage;
	}

	public WebElement getViewas() {
		return viewas;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
