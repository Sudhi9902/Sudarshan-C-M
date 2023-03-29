package webdriverMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebElement {
	/***
	 * This method is used to take the screen shot of webpage
	 * 
	 * @author sudarshan
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mangomist.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;// downcasting the webdriver object into take screenshot interface
		File tempScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File trgetscreenShot = new File("./errorshots/snap.png");
		System.out.println(tempScreenShot);
		System.out.println(trgetscreenShot);
		FileHandler.copy(tempScreenShot, trgetscreenShot);
		driver.quit();
	}

}