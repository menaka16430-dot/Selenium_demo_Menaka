package com.DemowebShop_GenericUtility;

public interface JavaAllPath {
	JavaUtility jut=new JavaUtility();
	String propertiesfile="./src/test/resources/testData/commanData.properties";
	String excellfile="./src/test/resources/testData/Address.xlsx";
	
	String screenshot="./screenshot/"+jut.dateAndTime()+".png";
	
	String extentreports="./reports"+jut.dateAndTime()+".html";

}
