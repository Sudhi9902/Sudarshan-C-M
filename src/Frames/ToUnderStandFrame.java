package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderStandFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		WebElement frameElement = driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[.='Maps']")).click();

	}

}
