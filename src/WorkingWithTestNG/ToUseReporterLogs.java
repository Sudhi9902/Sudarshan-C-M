package WorkingWithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUseReporterLogs {
	@Test
	public void createAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://fireflink.com/");
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.quit();
	}

	@Test
	public void deleteAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.digikey.in/");
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.quit();
	}

	@Test
	public void modifyAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.isro.gov.in/");
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.quit();
	}

	@Test
	public void updateAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://hal-india.co.in/");
		String Title = driver.getTitle();
		Reporter.log(Title, true);
		driver.quit();
	}
}
