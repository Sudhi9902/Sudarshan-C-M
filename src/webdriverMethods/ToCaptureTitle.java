package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/search?q=ferrari&form=ANSPH1&refig=9c8c47d3a94449b8843a9762af6308b1&pc=U531");
		String TitleOfPage=driver.getTitle();
		System.out.println(TitleOfPage);
		driver.close();
	}

}
