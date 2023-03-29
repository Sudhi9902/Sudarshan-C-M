package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLoginActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[@id='keepLoggedInCheckBoxContainer']")).click();
		driver.findElement(By.xpath("//div[text()='Login ' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
