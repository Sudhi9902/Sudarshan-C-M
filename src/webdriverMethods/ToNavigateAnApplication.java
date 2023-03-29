package webdriverMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToNavigateAnApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdi");
		driver.get("https://www.bing.com/search?q=ferrari&form=ANSPH1&refig=9c8c47d3a94449b8843a9762af6308b1&pc=U531");
	}

}
