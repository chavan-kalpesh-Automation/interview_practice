package pkg14ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// get path of Excel file
		File path = new File("F:\\Excel File read\\Book1.xlsx");

		// load excel file
		FileInputStream load = new FileInputStream(path);

		// workbook of excel

		XSSFWorkbook workbook = new XSSFWorkbook(load);

		// get sheet from workbook where we want to read

		XSSFSheet sheet = workbook.getSheetAt(0);// Index number of sheet

		for (int i = 0; i <= 5; i++) {
			String reading = sheet.getRow(i).getCell(i).getStringCellValue();// index number of cell and row

			System.out.println(reading);

		}
	}

}
