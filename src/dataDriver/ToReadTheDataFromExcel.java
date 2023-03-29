package dataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File absPath = new File("./TestData/Number.xlsx");
		FileInputStream fis = new FileInputStream(absPath);

		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
		System.out.println(value);
	}
}
