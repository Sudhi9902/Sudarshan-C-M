package PopUpHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriverWait explicit=new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		String parentid = driver.getWindowHandle();
		try {

			driver.findElement(By.linkText("Agents Portal")).click();
		} catch (ElementClickInterceptedException e) {
			js.executeScript("window.scrollBy(0,200);");
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		Alert popAlert = driver.switchTo().alert();
		System.out.println(popAlert.getText());
		popAlert.accept();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parentid);
		for(String n:allwindow ) {
			driver.switchTo().window(n);
		}
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(2000);
		String Text = driver.findElement(By.xpath("//li")).getText();
		System.out.println(Text);
		driver.quit();
	}
}
