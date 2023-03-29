package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDifferentBetweenCloseandQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("///C:/Users/TECQNIO/Downloads/MultipleWindow.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Set<String> allwindowid=driver.getWindowHandles();
		System.out.println("size of set:="+" "+allwindowid.size());
		for(String Window:allwindowid) {
		System.out.println(Window);
		}
		Thread.sleep(5000);
		driver.quit();
	}
}