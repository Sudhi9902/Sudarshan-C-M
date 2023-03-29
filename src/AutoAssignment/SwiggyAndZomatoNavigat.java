package AutoAssignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyAndZomatoNavigat {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigation navigateTo = driver.navigate();
		driver.get("https://www.swiggy.com/");
		System.out.println(driver.getCurrentUrl());
		navigateTo.forward();
		driver.get("https://www.zomato.com/");
		System.out.println(driver.getCurrentUrl());
		navigateTo.back();
		driver.get("https://www.flipkart.com/");
		navigateTo.refresh();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}