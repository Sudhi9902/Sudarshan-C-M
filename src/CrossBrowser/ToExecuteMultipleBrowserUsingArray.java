package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToExecuteMultipleBrowserUsingArray {
	@DataProvider(parallel = true)
	public String[] Data() {
		String arr[] = { "https://goa-tourism.com/", "https://www.tirumala.org/", "https://sringeri.net/",
				"https://itms.kar.nic.in/", "https://karnatakatourism.org/" };
		return arr;

	}

	@Test(dataProvider = "Data")
	public void test(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	
	}

}
