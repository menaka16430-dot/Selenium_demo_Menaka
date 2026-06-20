package com.DemoWebShop_TestScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.DemoWebShop_POM.Account_AddressPage;
import com.DemowebShop_GenericUtility.BaseTest;
import com.DemowebShop_GenericUtility.WebdriverUtility;

public class Test002_DeleteAddresss extends  BaseTest{
	
	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		wedriverutilit.scrollIntoView(driver, home.getAddresslink());
		home.getAddresslink().click();
		Account_AddressPage accountaddress=new Account_AddressPage(driver);
		accountaddress.getDeletebutton().click();
		wait.until(ExpectedConditions.alertIsPresent());
		wedriverutilit.alertSwitchAccept(driver);
		Thread.sleep(2000);
		wedriverutilit.webPageScreenshot(driver);
	}

}
