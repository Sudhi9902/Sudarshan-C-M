package AutoAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowClose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> MultipleId = driver.getWindowHandles();
		for (String allWindowId : MultipleId) {
			driver.switchTo().window(allWindowId);
			driver.close();
		}
		System.out.println("child window are closed");
		Thread.sleep(2000);
		driver.quit();
	}
}
