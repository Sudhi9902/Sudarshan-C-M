package CrossBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataEntryFromExcel {
	@DataProvider
	public String[][] fromexcell() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./TestData/ActiTime.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("actidata");
		int rowCount = sheet.getPhysicalNumberOfRows() - 1;
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][] = new String[rowCount][colCount];

		for (int i = 1, k = 0; i <= rowCount; i++,k++) {
			for (int j = 0; j < colCount; j++) {
				data[k][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	@Test(dataProvider = "fromexcell")
	public void test(String data[]) {
		System.out.println(data);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		driver.quit();
	}

}
