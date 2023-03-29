package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckPositionAndSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']/.."));
		Point user = userName.findElement(By.xpath("//input[@name='email']")).getLocation();
		Point pass = passWord.findElement(By.xpath("//input[@name='pass']/..")).getLocation();
		Dimension dimension = userName.getSize();
		int usernameField = dimension.getWidth();
		Dimension dimensionPss = passWord.getSize();
		int password = dimensionPss.getWidth();
		if (usernameField == password) {
			System.out.println("no overlap");
		}
		int username = user.getX();
		int passLocate = pass.getX();
		// System.out.println(dimension);
		// System.out.println(dimensionPss);
		if (username == passLocate) {
			System.out.println("no overlap");
			System.out.println(user);
			System.out.println(pass);
		} else {
			System.out.println("locatoin not profer");
		}
		driver.quit();
	}

}
