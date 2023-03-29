package AutoAssignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}