package Test.AutomationFramework.Testngconcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderofEmployee {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:\\Users\\gurum\\Desktop\\Demo\\EmpData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sh = wb.getSheet("EmpDetails");
		int r = sh.getLastRowNum();

		for (int i = 1; i <= r; i++) {

			Row row = sh.getRow(i);
			String empname = row.getCell(0).getStringCellValue();
			int empid = (int) row.getCell(1).getNumericCellValue();
			int empsalary = (int) row.getCell(2).getNumericCellValue();

			System.out.println(empname + " " + empid + " " + empsalary);
		}

	}

}
