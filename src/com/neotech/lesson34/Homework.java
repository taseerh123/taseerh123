package com.neotech.lesson34;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework {

	public static void main(String[] args) throws IOException {
		// Read Homework.xlsx file
		// Read Companies sheet

		// 1. Read the third row (row index 2) and create an ArrayList of String. 
		// Then print the ArrayList.

		// 2. Read the fifth column (col index 4) and create an HashSet of Double. 
		// Then print the HashSet.

		//1st step: location
		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx"; 
		System.out.println(filePath);
		
		//2nd step: create a connection (stream) to the file
		FileInputStream fis = new FileInputStream(filePath);
		
		//if we open Excel using MS Excel app then we can see the first sheet and then move to 
		//others and so on
		//we want to do the same in code!!!
		
		//--> Excel file is a -- Workbook
		//--> Each workbook has multiple sheets
		
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Companies");
		
		
		//Read the third row (row index 2) and create an ArrayList of String.
		
		Row r = sheet.getRow(2);
		int cols = r.getLastCellNum();
		
		List<String> al = new ArrayList<>();
		
		
		for (int c = 0; c < cols; c++)
		{
			//read and add the value into an ArrayList
			al.add(r.getCell(c).toString());
			
			//same as if we did: 
			
			//String cellData = r.getCell(c).toString();
			//al.add(cellData);
			
		}
		
		System.out.println(al);
		
		
		// Read the fifth column (col index 4) and create an HashSet of Double.
		
		Set<Double> hs = new HashSet<>();
		
		//get the number of rows with data
		int rows = sheet.getPhysicalNumberOfRows();
		
		//we want to start at index 1, and we want to get the numeric value from each 
		//row at index column 4
		
		for (int i = 1; i < rows; i++)
		{
			hs.add(sheet.getRow(i).getCell(4).getNumericCellValue());
		}
		
		System.out.println(hs);
		
		
		
		
	}

}
