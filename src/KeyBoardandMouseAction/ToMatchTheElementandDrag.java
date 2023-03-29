package KeyBoardandMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * @author sudarshan
 *
 */

public class ToMatchTheElementandDrag {
	public static void main(String[] args) throws InterruptedException {

		// Step 1: Lanuching the Browser and The Url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://trello.com/login");

		// Step 2: Entering The Valid Login Details
		driver.findElement(By.id("user")).sendKeys("sudarshancm80@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Brunda@99");
		WebElement password = driver.findElement(By.id("login-submit"));
		password.click();
		driver.findElement(By.xpath("//div[@title='NewTask']")).click();
		Thread.sleep(2000);

		// Step 3: Storing The Required WebElements
		WebElement mainsource = driver.findElement(By.xpath("//span[text()='ProdutInterview']"));
		WebElement source1 = driver.findElement(By.xpath("//span[text()='Mockcompleted']"));
		WebElement source2 = driver.findElement(By.xpath("//span[text()='MockScheduled']"));
		WebElement source3 = driver.findElement(By.xpath("//span[text()='MockPending']"));

		WebElement maindestini = driver.findElement(By.xpath("//textarea[text()='status']"));
		WebElement destini1 = driver.findElement(By.xpath("//textarea[text()='Manual']"));
		WebElement destini2 = driver.findElement(By.xpath("//textarea[text()='Java']"));
		WebElement destini3 = driver.findElement(By.xpath("//textarea[text()='Selenium']"));
		WebElement LogOut = driver.findElement(By.xpath("//span[contains(@title,'Sudarshan')]"));

		// Step 6: Performing The Actions of Drag And Drop (Source to Destination)
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, destini1).perform();
		action.dragAndDrop(source2, destini2).perform();
		action.dragAndDrop(source3, destini3).perform();

		// Step 8: Click And Hold the Element
		action.moveByOffset( 25, 280).perform();
		Thread.sleep(5000);
		// Step 8: Performing Reverse Action
		action.clickAndHold(mainsource).perform();
		action.release(mainsource).perform();
		Thread.sleep(5000);
		action.dragAndDrop(source1, maindestini).perform();
		// Thread.sleep(5000);
		// action.dragAndDrop(source2, maindestini).perform();
		Thread.sleep(5000);
		// action.dragAndDrop(source3, maindestini).perform();
		LogOut.click();
		LogOut.findElement(By.xpath("//span[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout-submit")).click();
		driver.quit();
	}

}
