package CrossBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UrlEnteringUsing {
	@DataProvider
	public String[] url() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./TestData/ActiTime.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("url");
		int rowCount = infoSheet.getPhysicalNumberOfRows() - 1;
		String data[] = new String[rowCount];

		for (int i = 1; i < rowCount; i++) {
			data[i] = infoSheet.getRow(i+1).toString();
		}
		return data;

	}

	@Test(dataProvider = "url")
	public void differntSite(String data[]) {
		System.out.println(data);
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get(data[0]);
//		driver.quit();
	}

}
