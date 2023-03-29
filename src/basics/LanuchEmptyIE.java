package basics;

import org.openqa.selenium.safari.SafariDriver;

public class LanuchEmptyIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "./drivers/safaridriver.exe");
		SafariDriver driver=new SafariDriver();
		driver.quit();
		
	}

}
