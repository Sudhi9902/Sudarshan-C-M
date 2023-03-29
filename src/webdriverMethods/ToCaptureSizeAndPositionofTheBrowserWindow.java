package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSizeAndPositionofTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.vivo.com/in");
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		Point positionOfBrowser = new Point(0, 0);
		driver.manage().window().setPosition(positionOfBrowser);
		Thread.sleep(2000);
		Dimension SizeOftheBrowser = new Dimension(300, 300);
		driver.manage().window().setSize(SizeOftheBrowser);
		Thread.sleep(1000);
		System.out.println(SizeOftheBrowser);
		System.out.println(positionOfBrowser);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
