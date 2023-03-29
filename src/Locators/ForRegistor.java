package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForRegistor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement Register = driver.findElement(By.linkText("Register"));
		Register.click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("sudarshan");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("ab");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("abc@123.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Abc@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc@123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
