package PopUpHandling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPop_upHandle {

	public static void main(String[] args) {
		LocalDateTime SystemDateTime = LocalDateTime.now().plusMonths(2);
		String monthName = SystemDateTime.getMonth().name();
		int year = SystemDateTime.getYear();
		int day = SystemDateTime.getDayOfMonth();
		String month = "" + monthName.charAt(0) + monthName.substring(1, monthName.length()).toLowerCase();

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);

		driver.get("https://www.makemytrip.com/");
		actions.click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + month + " " + year + "']/../..//p[text()='" + day + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
