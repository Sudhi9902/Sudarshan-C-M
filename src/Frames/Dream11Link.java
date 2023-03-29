package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.dream11.com/login");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("regEmail")).sendKeys("9019763441",Keys.ENTER);
		driver.findElement(By.partialLinkText("GET APP LINK")).click();
	}

}
////input[@placeholder='Enter Mobile Number']