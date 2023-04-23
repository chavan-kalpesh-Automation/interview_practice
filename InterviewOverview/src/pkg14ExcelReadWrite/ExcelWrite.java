package pkg14ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

		
		//Get Path of excel 
		File path =new File("F:\\Excel File read\\Book1.xlsx");
		
		//load excel fiile 
		FileInputStream load = new FileInputStream(path);
		
		//access the workbook
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		
		//get sheet from workbook 
		
		XSSFSheet sheet1 = workbook.getSheetAt(1);
		
		//perform output action on output stream 
		
		FileOutputStream write = new FileOutputStream(path);
		sheet1.createRow(1).createCell(1).setCellValue("OnePlus");
		workbook.write(write);
		
	}

}
