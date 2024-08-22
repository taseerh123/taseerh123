package com.neotech.lesson33;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {

		// lets get the location of our excel file
		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// get the file
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");

		// i want to add a new column called Country to the first row
		sheet.getRow(0).createCell(5).setCellValue("Country");

		// i want to add a new row
		sheet.createRow(3).createCell(0).setCellValue("Ebru");
		sheet.getRow(3).createCell(1).setCellValue("Demirer");

		// i want to add a new sheet
		book.createSheet("Emre");

		// its time to save our changes to the excel file
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);

		// close connections
		book.close();
		fos.close();
		fis.close();
	}

}
