package VarietyBikes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001_BMW {
	@Test
	public void BMW() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.bmw-motorrad.in/en/models/tour/k1600-grand-america.html");
		String titles = driver.getTitle();
		Reporter.log(titles, true);
		driver.quit();
		
	}
}

