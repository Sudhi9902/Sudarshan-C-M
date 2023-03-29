package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExpression {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Sudarshan");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("cm");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("dineshgopalingalagi@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
