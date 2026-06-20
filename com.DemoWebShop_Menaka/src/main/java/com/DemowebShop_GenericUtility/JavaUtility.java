package com.DemowebShop_GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	public String dateAndTime() {
		String date = LocalDateTime.now().toString().replace("-", "").replace(":","").replace(",", "");
		return date;
	}

}
