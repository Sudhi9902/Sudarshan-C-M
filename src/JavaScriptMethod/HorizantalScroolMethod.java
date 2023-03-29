package JavaScriptMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HorizantalScroolMethod {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.album.alexflueras.ro/#a7");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(4040,320);");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File trgetscreenShot = new File("./errorshots/snapCat.png");
		System.out.println(trgetscreenShot);
		FileHandler.copy(tempScreenShot, trgetscreenShot);

	}
}