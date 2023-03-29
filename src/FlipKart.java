import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {
	public static Map<Integer, String> productDetais;
	public static WebDriverWait explicitWait;
	public static WebDriver driver = null;
	public static JavascriptExecutor js;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		searchAndAddProduct("vivo");
	}

	public static void searchAndAddProduct(String product) throws InterruptedException {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@data-tkid,'SEARCH')]/a")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for (String windowId : allWindowId) {
			driver.switchTo().window(windowId);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text(),'Add to Cart']")).click();
		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("q")).sendKeys(Keys.DELETE);
		driver.findElement(By.linkText("cart")).click();
		String lowestProduct="";
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@style,'box-shadow')]//span[contains(text(),'₹')])[position() mod 2=0]"));
		for(int i=1;i<=prices.size();i++) {
			int price=Integer.parseInt(prices.get(i-1).getText().replace("₹", "").replace(",", ""));
			productDetais.put(price,"Product"+i+"");
		}
		Set<Integer> costProduct = productDetais.keySet();
		for(int lowerCost:costProduct) {
			lowestProduct = productDetais.get(lowerCost);
			break;
		}
		char indexRemoveButton=lowestProduct.charAt(lowestProduct.length()-1);
		for(;;) {
			try {
				driver.findElement(By.xpath("(//div[text()='Remove'])["+indexRemoveButton+"]")).click();
				break;
			}
			catch(ElementClickInterceptedException e) {
				js.executeScript("window.scrollBy(0,250);");
			}
		}
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
	}

}
