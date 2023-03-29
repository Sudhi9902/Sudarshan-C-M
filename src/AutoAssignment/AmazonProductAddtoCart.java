package AutoAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Sudarshan
 *
 */
public class AmazonProductAddtoCart {

	public static void main(String[] args) {
// Actual data of Website.
		String expectedTittle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String mobilePhoneTittle = "Smartphones: Buy Smart Mobile Phones Online at Best Prices in India - Amazon.in";
// step1:Lanuch The Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Empty Browser Launched Sucessfully");
		driver.manage().window().maximize();
		System.out.println("page is Maximized sucessfully");
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
// step2:Compare of Tittle of the Current Page
		String actualTiltle = driver.getTitle();
		if (expectedTittle.equals(actualTiltle)) {
			System.out.println("mobile page open Sucessfully");
			driver.findElement(By.linkText("Mobiles")).click();
		} else {
			System.out.println("Different Page");
		}
// step3: Click on 2nd product and checking the right tittle with data
		driver.findElement(By.xpath("//span[contains(text(),'Smartphones ')]")).click();
		String actual = driver.getTitle();
		System.out.println(actual);
		if (actual.equals(mobilePhoneTittle)) {
			System.out.println("Mobile List opened");
			driver.findElement(By.xpath("(//span[@class='a-list-item'])[2]")).click();
		} else {
			System.out.println("Wrong page");
		}
// step4: getting the Price Details
		String productRupee = driver.findElement(By.id("corePriceDisplay_desktop_feature_div")).getText();
		System.out.println("Actual Price of the Product" + " " + productRupee);
		productRupee = productRupee.replace("₹", "");
		productRupee = productRupee.replace(",", "");
		productRupee = productRupee.replace("00", "");
		productRupee = productRupee.trim();
		int newPrice = Integer.parseInt(productRupee);
// Step5:Comparison of Price and to Cart
		if (newPrice > 10000) {
			driver.findElement(By.id("submit.add-to-cart-announce")).submit();
			System.out.println("Price is moderate" + " " + "added to cart sucessfuly");
			driver.quit();
		} else {
			System.out.println("Price to Less" + " " + "the cost of the product is:" + " " + productRupee);
		}
	}
	// span[contains(text(),'Add to Cart')]

}
