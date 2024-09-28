package webDriverTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		
		String filePath = "E:\\OneDrive\\Desktop\\Login.xlsx";
		//Open Excel file  (FileInputStream - Reading)
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		//Reading data
		for(int r =0; r<=rows ;r++) {
			Row row = sheet.getRow(r);
			for(int c=0; c<cols ; c++) {
				Cell data = row.getCell(c);
				System.out.println(data);
			}
		//Write in to cell
			Cell resultCell = row.createCell(2);
			resultCell.setCellValue("Passed");
		}
		//FileOutputStream - for writing
		FileOutputStream fos = new FileOutputStream(filePath);
		//Close all resources
		wb.write(fos);
		fos.close();
		wb.close();
		fis.close();
	}
}
