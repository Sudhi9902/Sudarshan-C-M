package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderStandSelcetDropDownOfFaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
		WebElement Birthday = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select selectDay = new Select(Birthday);
		System.out.println(selectDay.isMultiple());
		List<WebElement> dob = selectDay.getOptions();
		for (WebElement day : dob) {
			System.out.print(day.getText() + " ");
		}
		selectDay.selectByVisibleText("25");
		System.out.println();
		System.out.println("==================");

		Select mon = new Select(month);
		List<WebElement> BirthMonth = mon.getOptions();
		for (WebElement ob2 : BirthMonth) {
			System.out.print(ob2.getText() + " ");
		}
		mon.selectByIndex(9);
		System.out.println();
		System.out.println("=========================");
		Select yr = new Select(year);
		List<WebElement> birthYr = yr.getOptions();
		for (WebElement ob3 : birthYr) {
			System.out.print(ob3.getText() + " ");
		}
		yr.selectByValue("2001");
		System.out.println();
		System.out.println("==============================");
		Select yr1 = new Select(year);
		List<WebElement> birthYr1 = yr1.getOptions();
		for (WebElement ob3 : birthYr1) {
			yr1.selectByVisibleText(ob3.getText());
			Thread.sleep(200);
		}
		yr1.selectByValue("1999");
	}
}
