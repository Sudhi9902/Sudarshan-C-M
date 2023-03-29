package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LanuchEmptyeEdgebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get(
				"https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
		String s = driver.getTitle();
		System.out.println(s);
		driver.close();

	}

}
