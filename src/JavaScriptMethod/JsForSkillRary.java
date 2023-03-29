package JavaScriptMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsForSkillRary {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Sudarshan';",disableElement);
		driver.navigate().refresh();
		js.executeScript("arguments[0].value='bru';",driver.findElement(By.xpath("//input[@class='form-control']")));
		
	}

}
