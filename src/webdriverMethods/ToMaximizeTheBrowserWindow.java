package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
