package AutoAssignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDimension {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension theSizeofWindow = new Dimension(100, 200);
		driver.get("https://www.facebook.com/");
		driver.manage().window().setSize(theSizeofWindow);
		Thread.sleep(2000);
		driver.quit();
	}

}
