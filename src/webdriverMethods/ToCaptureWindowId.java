package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/search?q=ferrari&form=ANSPH1&refig=9c8c47d3a94449b8843a9762af6308b1&pc=U531");
		driver.get("https://www.ferrari.com/en-IN");
		driver.manage().window().maximize();
		String TitleOfPage = driver.getTitle();
		System.out.println(TitleOfPage);
		String s = driver.getWindowHandle();
		System.out.println(s);
		Thread.sleep(2000);
		driver.close();
	}

}