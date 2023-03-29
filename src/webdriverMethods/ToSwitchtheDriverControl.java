package webdriverMethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchtheDriverControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowId=driver.getWindowHandles();
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			String actualTittle=driver.getTitle();
			System.out.println(actualTittle);

		}
		driver.quit();
	}
}
