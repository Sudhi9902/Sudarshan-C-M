package AutoAssignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Point positionOfBrowser = new Point(100, 50);
		driver.manage().window().setPosition(positionOfBrowser);
		Thread.sleep(2000);
		driver.quit();
	}
}
