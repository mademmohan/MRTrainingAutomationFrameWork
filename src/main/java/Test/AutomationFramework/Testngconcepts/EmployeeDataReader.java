package Test.AutomationFramework.Testngconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeDataReader {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\gurum\\Desktop\\Demo\\EmpData.xlsx");

		FileInputStream fi = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sh = wb.getSheet("EmpDetails");

		int rowcount = sh.getLastRowNum();// active rows of the sheet

		for (int i = 1; i <= rowcount; i++) {
			Row r = sh.getRow(i);//1, 2, 3,

			Object EmployeName = r.getCell(0).getStringCellValue();
			Object empid = r.getCell(1).getNumericCellValue();
			Object empsalary = r.getCell(2).getNumericCellValue();
			
			System.out.println("EmployeeName is "+EmployeName+" Employee id is::"+empid+" Employee salaray is ::"+empsalary);
		}
	}

}
