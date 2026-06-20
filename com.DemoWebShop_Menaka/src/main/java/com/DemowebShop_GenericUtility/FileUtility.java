package com.DemowebShop_GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String dataFromeProperies(String key) throws IOException {
		FileInputStream fis=new FileInputStream(JavaAllPath.propertiesfile);
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String dataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(JavaAllPath.excellfile);
		Workbook web = WorkbookFactory.create(fis);
		String value = web.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		return value;
	}

}
