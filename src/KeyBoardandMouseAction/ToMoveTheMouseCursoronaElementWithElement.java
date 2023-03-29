package KeyBoardandMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheMouseCursoronaElementWithElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement Service = driver.findElement(By.id("password"));
		Service.sendKeys("Sudarshan");
		
		Actions action=new Actions(driver);
		action.moveToElement(Service, 0, 240).click().perform();
	}
}
