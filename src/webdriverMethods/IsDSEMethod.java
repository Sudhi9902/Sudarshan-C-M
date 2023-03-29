package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDSEMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		 WebElement checkbox=driver.findElement(By.id("RememberMe"));
		System.out.println(checkbox.isDisplayed());
		 System.out.println(checkbox.isSelected());
		 System.out.println(checkbox.isEnabled());
		 checkbox.click();
		 System.out.println("after click");
		 System.out.println(checkbox.isSelected());
		 driver.quit();
	}

}
