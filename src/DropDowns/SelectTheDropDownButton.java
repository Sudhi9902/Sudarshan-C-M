package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheDropDownButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.puma.com/in/");
		driver.findElement(By.linkText("Men")).click();
		WebElement dropDown = driver.findElement(By.id("product-list-sort-select"));
		Select drops = new Select(dropDown);
		List<WebElement> optionDrop = drops.getOptions();
		for(WebElement obj:optionDrop) {
			System.out.println(obj.getText());
		}
	drops.selectByIndex(1);
	}
}
