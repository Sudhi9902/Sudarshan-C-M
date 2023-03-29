package Cars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_004_cars {
	@Parameters("browserName")
	@Test
	public void cars(@Optional("chrome") String sname) {
		System.out.println(sname);
		WebDriver driver = null;
		if (sname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (sname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			Reporter.log("please pass a valid browser name", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.porsche.com/middle-east/_india_/");
		String titles = driver.getTitle();
		Reporter.log(titles, true);
		driver.quit();
	}
}
