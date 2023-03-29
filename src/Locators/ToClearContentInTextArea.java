package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearContentInTextArea {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		Thread.sleep(2000);
		WebElement usernameTextfield = driver.findElement(By.xpath("//input[@name='username']"));
		usernameTextfield.sendKeys("abhi");
		Thread.sleep(2000);
		usernameTextfield.clear();
		Thread.sleep(2000);
		usernameTextfield.sendKeys("Sudarshan");
		WebElement passWordTextField = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(2000);
		passWordTextField.sendKeys("abc@123");
		Thread.sleep(2000);
		passWordTextField.clear();
		passWordTextField.sendKeys("Ab@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		driver.quit();
	}
}
