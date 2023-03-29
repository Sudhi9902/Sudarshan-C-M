import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRightClickOnTrelloPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("sudarshancm80@gmail.com");
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Brunda@99");
		WebElement password = driver.findElement(By.id("login-submit"));
		Thread.sleep(3000);
		password.click();
		driver.findElement(By.xpath("//div[@title='elf99']")).click();
		Thread.sleep(1000);
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium']"));
		Actions action=new Actions(driver);
		action.contextClick(selenium).perform();
		List<WebElement> contents = driver.findElements(By.xpath("//a[contains(@class,'quick-card-editor')]"));
		for(WebElement menu:contents) {
			System.out.println(menu.getText());
		}
		
	}

}
