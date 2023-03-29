package webdriverMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchDifferntPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		String expectedTittle = "Olive Garden Italian Restaurant | Family Style Dining | Italian Food";
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			String actualString = driver.getTitle();

			if (expectedTittle.equals(actualString)) {
				driver.manage().window().fullscreen();
				Thread.sleep(1000);
				System.out.println(actualString);
			}
		}
		driver.quit();
	}
}
