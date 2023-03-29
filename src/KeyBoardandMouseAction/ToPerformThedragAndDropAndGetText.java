package KeyBoardandMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformThedragAndDropAndGetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/accepted-elements.html']"));
		driver.switchTo().frame(frame2);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement destini = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source, destini).perform();
		String text = driver.findElement(By.id("droppable")).getText();
		System.out.println(text);
	}
}
