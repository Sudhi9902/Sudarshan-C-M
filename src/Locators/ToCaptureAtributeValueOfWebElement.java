package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAtributeValueOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careers.rolls-royce.com/sign-up");
		String Title=driver.findElement(By.xpath("//a[@class='fulllink']")).getAttribute("title");
		System.out.println(Title);
		driver.quit();
	}

}
