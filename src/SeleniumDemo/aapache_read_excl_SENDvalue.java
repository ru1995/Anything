package SeleniumDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aapache_read_excl_SENDvalue {
// open actitime and pass credentials from excel sheet
//refer aapache_read_excl_SENDvalueActitime
	
	public static String readcell(String path, String sheetname, int row, int col) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("sheet1");
		Cell c2=sh.getRow(row).getCell(col);
		return c2.toString();
	}
	
// needed for test NG	
/*	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	 <test name="Test">
	  <classes>
	   <class name="org.demo.tstNG.demo" />
	  </classes>
	 </test> <!-- Test -->
	</suite> <!-- Suite -->
*/
}
