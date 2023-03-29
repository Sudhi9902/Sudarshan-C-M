package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement css = driver.findElement(By.linkText("Jewelry"));
		System.out.println(css.getCssValue("font-size"));
		System.out.println(css.getCssValue("vertical-align"));
		System.out.println(css.getCssValue("background"));
		System.out.println(css.getCssValue("background-color"));
		driver.quit();
	}

}
