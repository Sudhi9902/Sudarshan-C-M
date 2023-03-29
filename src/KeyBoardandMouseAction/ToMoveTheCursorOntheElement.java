package KeyBoardandMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheCursorOntheElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.isro.gov.in/");
		WebElement Service = driver.findElement(By.xpath("//span[text()='Services']"));
		System.out.println(driver.getTitle());

		Actions action = new Actions(driver);
		action.moveToElement(Service).perform();
		driver.findElement(By.linkText("Launch service")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
