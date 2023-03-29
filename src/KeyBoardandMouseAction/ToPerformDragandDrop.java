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
public class ToPerformDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		WebElement source1 = driver.findElement(By.id("gallery"));
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		action.dragAndDrop(image2, trash).perform();
		action.clickAndHold(image3);
		action.dragAndDrop(image3, trash).perform();
		action.dragAndDrop(image4, trash).perform();
		Thread.sleep(2000);
		action.dragAndDrop(image4, source1).perform();
		action.dragAndDrop(image3, source1).perform();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[text()='Accepted Elements']")).click();
		WebElement frame2 = driver.findElement(
				By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/accepted-elements.html']"));
		driver.switchTo().frame(frame2);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement destini = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, destini).perform();
		String text = driver.findElement(By.id("droppable")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Propagation")).click();
		WebElement frame3 = driver
				.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/droppable/propagation.html']"));
		driver.switchTo().frame(frame3);
		WebElement source3 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement destini3 = driver.findElement(By.xpath("//p[text()='Inner droppable (not greedy)']"));

		action.dragAndDrop(source3, destini3).perform();
		String text1 = driver.findElement(By.id("droppable")).getText();
		System.out.println(text1);
		driver.quit();
	}
}
