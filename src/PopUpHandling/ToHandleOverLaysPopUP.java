package PopUpHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleOverLaysPopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action=new Actions(driver);
		driver.get("https://www.cleartrip.com/");
		action.doubleClick().perform();
		Thread.sleep(5000);
		WebElement from = driver.findElement(By.xpath("//div[contains(@class,'field-1 flex flex-middle p-relative ')]"));
		js.executeScript("arguments[0].value='Banglore';", from);
		action.clickAndHold(from);
	}

}
