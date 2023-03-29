package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchTheBrowser {

	public static void main(String[] args) {
		WebDriver driver=null;
				driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://goa-tourism.com/");
		driver.quit();
		driver=new FirefoxDriver();
		driver.get("https://goa-tourism.com/");
		driver.quit();
	}

}
