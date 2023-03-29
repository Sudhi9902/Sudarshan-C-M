package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Abc@123");
		/*driver.findElement(By.xpath("//select[@id='day']")).sendKeys("1");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("oct");
		driver.findElement(By.xpath("select[@id='year']")).sendKeys("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();*/
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
