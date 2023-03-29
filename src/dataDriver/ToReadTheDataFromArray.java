package dataDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * This Program is used understand and Fetch the Data from Excel sheet by using
 * 2D Array
 * 
 * @author sudarshan
 *
 */
public class ToReadTheDataFromArray {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Step 1: Creating the Object For FIS file and Excel Work Book
		FileInputStream fis = new FileInputStream("./TestData/TwoDimensionalData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);

		// Step 2: Fetching Data From The Excel Sheet

		Sheet infoSheet = workbook.getSheet("StudentData");
		int rowCount = infoSheet.getPhysicalNumberOfRows();
		int columnCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String[][] srr = new String[rowCount][columnCount];

		// Step 3: Storing the All excel Data into an ARRAY

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				srr[i][j] = infoSheet.getRow(i).getCell(j).toString();
			}
		}
		// Step 4: Storing the All Excelldata into Array and Retrieve The Data from The
		// Array

		for (String[] arr : srr) {
			for (String data : arr) {
				System.out.println(data + " ");
			}
			System.out.println();
		}
	}

}
