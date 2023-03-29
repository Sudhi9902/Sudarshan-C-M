package JavaScriptMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandTheAutoScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.linkText("2022 World Cup (Dec 1)")).click();
				break;
			} catch (NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,300);");
			}
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
