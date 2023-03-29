package webdriverMethods;
import java.util.Set;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigatepages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Navigation navigateToNewPage = driver.navigate();
		navigateToNewPage.forward();
		driver.get("https://www.youtube.com/");
		navigateToNewPage.back();
		Thread.sleep(2000);
		driver.get("https://www.isro.gov.in/");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		navigateToNewPage.refresh();
		navigateToNewPage.back();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		s.hashCode();
		for (String i : s) {
			System.out.println(driver.getTitle() + " " + driver.getCurrentUrl() + " ");
			i.charAt(3);
			System.out.println(s);
		}
		System.out.println("thankyou");
		driver.quit();
	}
}
