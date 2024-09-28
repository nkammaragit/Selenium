package practicePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		String filePath = "E:\\OneDrive\\Desktop\\Test.xlsx";
		// Open the Excel file
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);  
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);

		for(int r=0;r<rows; r++) {
			Row row= sheet.getRow(r);
			for(int c=0; c<cols; c++) {
				Cell cell = row.getCell(c);
				System.out.println(cell);
			}
			
			 // Write the grade to the third column
            Cell gradeCell = row.createCell(2); // Create or get the cell in the third column
            gradeCell.setCellValue("xxxx");	}
		 // Save the changes to the Excel file
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        // Close resources
        fos.close();
        wb.close();
        fis.close();
        
//		for(Row row: sheet) {
//			for(Cell cel : row) {
//				System.out.println(cel.getStringCellValue());
//			}
//		}
	      

	}

}
