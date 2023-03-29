package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStree2ndProductAddtoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/a[8]/p")).click();
		Thread.sleep(1000);
		String actualPrice = driver
				.findElement(By.xpath("(//div[contains(@id,'article')]//strong[contains(text(),'Rs')])[2]")).getText();
		System.out.println("the Cost Of the Product =" + " " + actualPrice);
		actualPrice = actualPrice.replace("Rs", "");
		actualPrice = actualPrice.replace(",", "");
		actualPrice = actualPrice.trim();
		int newPrice = Integer.parseInt(actualPrice);
		if (newPrice < 10000) {
			driver.findElement(By.xpath("//p[contains(text(),' Add to Cart')]")).click();

		} else {
			System.out.println("The Price is to High");
		}
	}

}
