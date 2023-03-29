package dataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XssFDataHandle {
	public static void main(String[] args) throws IOException {

		// Step 1 : Creating Input stream type object
		File absPath = new File("./TestData/Number.xlsx");
		FileInputStream fis = new FileInputStream(absPath);

		// Step 2 : Creating Object of the File Type

		try (Workbook workbook = new XSSFWorkbook(fis)) {
			// Step 3 : Read Methods
			String value = workbook.getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
			System.out.println(value);
		}

	}
}