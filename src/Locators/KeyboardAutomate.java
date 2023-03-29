package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAutomate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dcs.suzuki.de/Login_SSO/sie/login/login.jsp");
		driver.findElement(By.name("txtUser")).sendKeys("sagar",Keys.CONTROL+"A");
		driver.findElement(By.name("txtUser")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("txtPasswd")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();

	}

}
