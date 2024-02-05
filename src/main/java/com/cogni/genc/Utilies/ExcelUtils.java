package com.cogni.genc.Utilies;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	private static XSSFSheet wSheet;

	private static XSSFWorkbook wBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	
	
	public static Object[][] getExcelData(String SheetName) {

		String[][] tabArray = null;

		try {

			System.out.println("------------------------------------------");
//			System.out.println(SF_TestData.getAbsolutePath());
			FileInputStream ExcelFile = new FileInputStream("");

			// Access the required test data sheet

			wBook = new XSSFWorkbook(ExcelFile);

			wSheet = wBook.getSheet(SheetName);

			int startRow = 1;

			int startCol = 0;

			int ci, cj;

			int totalRows = wSheet.getLastRowNum();
			int totalCols = wSheet.getRow(0).getLastCellNum();

//			System.out.println("Last Row - " + totalRows);
//			System.out.println("Last Col - " + totalCols);

			tabArray = new String[totalRows][totalCols];

			ci = 0;

			for (int i = startRow; i <= totalRows; i++, ci++) {

				cj = 0;
				int totalCols1 = wSheet.getRow(i).getLastCellNum();
				// System.out.println("Last Col of "+i+" row = "+totalCols1 );
				for (int j = startCol; j <= totalCols1 - 1; j++, cj++) {

					tabArray[ci][cj] = getCellValue(i, j);

//					System.out.print(tabArray[ci][cj] + " | ");

				}

				System.out.println();

			}

		}

		catch (FileNotFoundException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e) {

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return (tabArray);

	}

	public static String getCellDatas(int RowNum, int ColNum) throws Exception {

		try {

			XSSFCell XSSFCell = wSheet.getRow(RowNum).getCell(ColNum);

			int dataType = Cell.getCellType();
			
			if (dataType == 3) {

				return "";

			} else {

				String CellData = Cell.getStringCellValue();

				return CellData;

			}

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

			throw (e);

		}

	}
	
	
	// This method is to read the test data from the Excel cell, in this we are
		// passing parameters as Row num and Col num

		public static String getCellValue(int RowNum, int ColNum) {

			try {

				return wSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

			} catch (Exception e) {

				return "";

			}

		}
	
	
}
