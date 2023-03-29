package AutoAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BarbequeNationClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String expectedTittle = "#1 buffet grill barbeque restaurant near you. Exciting Offers on lunch dinner with our trademark. | Barbeque Nation";
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			String actualString = driver.getTitle();
			if (expectedTittle.equals(actualString)) {
				driver.manage().window().fullscreen();
				Thread.sleep(2000);
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.quit();
	}
}
