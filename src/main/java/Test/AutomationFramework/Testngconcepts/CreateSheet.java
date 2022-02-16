package Test.AutomationFramework.Testngconcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheet {

	
	public static void main(String[] args) throws IOException {
		FileInputStream fi= new FileInputStream("C:\\Users\\gurum\\Desktop\\Demo\\TestData.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		
		XSSFSheet sh= wb.getSheet("Data");
		
		String userName=sh.getRow(1).getCell(0).getStringCellValue();
		
		String password= sh.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("UserName is ::"+userName+" Password is ::"+password);
		
		 
		
		
		/*
		 * XSSFWorkbook wb= new XSSFWorkbook(fi); wb.createSheet("Data");
		 * 
		 * FileOutputStream fo= new
		 * FileOutputStream("C:\\Users\\gurum\\Desktop\\Demo\\Testing.xlsx");
		 * 
		 * wb.close(); fi.close(); fo.close();
		 */
	}
}
