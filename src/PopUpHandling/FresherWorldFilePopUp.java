package PopUpHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FresherWorldFilePopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Sudarshan\\assignment\\child.png");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Sudarshan\\java1.pdf");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.reduceimages.com/");
		driver.findElement(By.xpath("//img[@alt='Upload image']")).click();
		driver.navigate().refresh();
		driver.quit();
	}

}
