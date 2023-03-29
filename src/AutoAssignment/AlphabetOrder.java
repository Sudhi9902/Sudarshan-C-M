package AutoAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlphabetOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		Set<String> MultipleId = driver.getWindowHandles();
		for (String allWindowId : MultipleId) {
			driver.switchTo().window(allWindowId);
			String MuT[] = { driver.getTitle() };
			for(String title:MuT) {
			System.out.println(title.charAt(0));
			}
			
		}
		driver.quit();
	}
}