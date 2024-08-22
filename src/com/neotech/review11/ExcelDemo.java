package com.neotech.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {

		// Google search: apache poi read excel file example

		String fullPath = System.getProperty("user.dir") + "/extra/Excel.xlsx";

		FileInputStream fis = new FileInputStream(fullPath);

		// Read the whole excel file
		Workbook book = new XSSFWorkbook(fis);

		// Get the sheet from the file
		Sheet sheet = book.getSheet("Sheet1");

		// Get the row (with index 2) from the sheet
		Row row2 = sheet.getRow(2);

		// Get the cell (with index 1) from the row
		Cell cell1 = row2.getCell(1);

		// Print the information of the cell
		System.out.println(cell1.toString());

		// Let's get all the headers of the sheet and print them
		Row headerRow = sheet.getRow(0);

		// The number of cells that have information (in that row)
		int cellNumber = headerRow.getLastCellNum();

		System.out.println("----------------------------------------------------");

		for (int i = 0; i < cellNumber; i++) {
			String cellData = headerRow.getCell(i).toString();
			System.out.print(cellData + " \t");
		}
		System.out.println();

		System.out.println("----------------------------------------------------");

		// How many rows are in the sheet?
		int rows = sheet.getPhysicalNumberOfRows();

		// I am skipping the row with index 0, because I already printed it
		for (int row = 1; row < rows; row++) {

			// For each row, iterate from (cell 0) to the (last cell)
			for (int cell = 0; cell < cellNumber; cell++) {
				String cellInfo = sheet.getRow(row).getCell(cell).toString();
				System.out.print(cellInfo + " \t\t");
			}
			System.out.println();

		}
	}

}
