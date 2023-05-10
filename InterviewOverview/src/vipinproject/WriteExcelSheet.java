package vipinproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	// Write Data to Excel sheet

	File path = new File("F:\\Excel File read\\Donaldson.xlsx");
	FileInputStream fis = new FileInputStream(path);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = workbook.getSheetAt(1);

	// perform output action on output stream
	
	FileOutputStream write = new FileOutputStream(path);

	
//	sheet1.createRow(1).createCell(1).setCellValue("OnePlus");
//	workbook.write(write);
}
