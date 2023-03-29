package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireLawnExplict {
/***
 * 
 * @ sudarshan
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait Delay = new WebDriverWait(driver,20);
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.xpath("//span[text()='5.0']/../..//img[@alt='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.xpath("//input[@placeholder='580023']")).sendKeys("560005");
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check']"));
		Delay.until(ExpectedConditions.visibilityOf(checkButton));
		checkButton.click();
	}

}
