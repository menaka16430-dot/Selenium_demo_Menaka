package com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNew_AddressPage {
	public AddNew_AddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "Address_FirstName")
	private WebElement address_firstTextfield;
	
	@FindBy(id = "Address_LastName")
	private WebElement address_lastTextfield;
	
	@FindBy(id = "Address_Email")
	private WebElement address_emailtextfield;
	
	@FindBy(id = "Address_CountryId")
	private WebElement address_countydropdown;
	
	@FindBy(id = "Address_City")
	private WebElement address_citytextfield;
	
	@FindBy(id = "Address_Address1")
	private WebElement address_Address1textfield;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement address_ziptextfield;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement address_phonenumbertextfield;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement save_button;

	public WebElement getAddress_firstTextfield() {
		return address_firstTextfield;
	}

	public WebElement getAddress_lastTextfield() {
		return address_lastTextfield;
	}

	public WebElement getAddress_emailtextfield() {
		return address_emailtextfield;
	}

	public WebElement getAddress_countydropdown() {
		return address_countydropdown;
	}

	public WebElement getAddress_citytextfield() {
		return address_citytextfield;
	}

	public WebElement getAddress_Address1textfield() {
		return address_Address1textfield;
	}

	public WebElement getAddress_ziptextfield() {
		return address_ziptextfield;
	}

	public WebElement getAddress_phonenumbertextfield() {
		return address_phonenumbertextfield;
	}

	public WebElement getSave_button() {
		return save_button;
	}
	
	

}
