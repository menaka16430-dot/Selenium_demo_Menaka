package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippigaddress_Page {
	
	public Shippigaddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "PickUpInStore")
	private WebElement pickUpInStore;
	
	@FindBy(xpath = "(//input[@value='Continue'])[2]")
	private WebElement continuebutton;
	
	@FindBy(id = "shippingoption_0")
	private WebElement groundcheckbox;
	
	@FindBy(id = "shippingoption_1")
	private WebElement nextdayaircheckbox;
	
	@FindBy(id = "shippingoption_2")
	private WebElement secountddayaircheckbox;
	
	@FindBy(xpath = "(//input[@value='Continue'])[3]")
	private WebElement continuewbutton;

	public WebElement getPickUpInStore() {
		return pickUpInStore;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getGroundcheckbox() {
		return groundcheckbox;
	}

	public WebElement getNextdayaircheckbox() {
		return nextdayaircheckbox;
	}

	public WebElement getSecountddayaircheckbox() {
		return secountddayaircheckbox;
	}

	public WebElement getContinuewbutton() {
		return continuewbutton;
	}
	

}
