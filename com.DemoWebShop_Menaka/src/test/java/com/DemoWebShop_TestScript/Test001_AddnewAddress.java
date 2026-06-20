package com.DemoWebShop_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemoWebShop_POM.Account_AddressPage;
import com.DemoWebShop_POM.AddNew_AddressPage;
import com.DemoWebShop_POM.Home_page;
import com.DemowebShop_GenericUtility.BaseTest;
import com.DemowebShop_GenericUtility.WebdriverUtility;

public class Test001_AddnewAddress extends BaseTest {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {
		wedriverutilit.scrollIntoView(driver,home.getAddresslink());
		home.getAddresslink().click();
		 
		Account_AddressPage addnewbutton=new Account_AddressPage(driver);
		addnewbutton.getAddNewbutton().click();
		AddNew_AddressPage addnew=new AddNew_AddressPage(driver);
		addnew.getAddress_firstTextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 0));
		addnew.getAddress_lastTextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 1));
		addnew.getAddress_emailtextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 2));
		wedriverutilit.selectByVisibleText(addnew.getAddress_countydropdown(), fileutility.dataFromExcel("sheet1", 1, 3));
		addnew.getAddress_citytextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 4));
		addnew.getAddress_Address1textfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 5));
		addnew.getAddress_ziptextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 6));
		addnew.getAddress_phonenumbertextfield().sendKeys(fileutility.dataFromExcel("sheet1", 1, 6));
		addnew.getSave_button().click();
		
		Thread.sleep(3000);
		wedriverutilit.webPageScreenshot(driver);
		
	}

}
