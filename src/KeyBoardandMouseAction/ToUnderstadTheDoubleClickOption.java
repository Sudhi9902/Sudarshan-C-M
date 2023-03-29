package KeyBoardandMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstadTheDoubleClickOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=munit-testing");
		WebElement addIcon = driver.findElement(By.id("add"));
		Actions action=new Actions(driver);
		action.doubleClick(addIcon).doubleClick(addIcon).perform();	
		action.doubleClick(addIcon).doubleClick(addIcon).perform();	
		action.doubleClick(addIcon).doubleClick(addIcon).perform();	
		driver.quit();
	}

}
