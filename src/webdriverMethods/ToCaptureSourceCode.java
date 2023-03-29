package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.ferrari.com/en-IN");
		String s = Driver.getPageSource();
		System.out.println(s);
	}

}
