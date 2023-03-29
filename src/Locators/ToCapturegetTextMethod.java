package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturegetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sudarshan");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ab@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		String errormsg =driver.findElement(By.xpath("//p[@id='com-form-login-error']")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println(errormsg);
		Thread.sleep(2000);
		driver.quit();

	}

}