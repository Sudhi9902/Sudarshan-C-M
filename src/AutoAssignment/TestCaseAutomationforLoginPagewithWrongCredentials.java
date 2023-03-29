package AutoAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author sudarshan
 *
 */

public class TestCaseAutomationforLoginPagewithWrongCredentials {

	public static void main(String[] args) throws InterruptedException {
//UserData
		String urlData = "https://www.myntra.com/login/password";
		String expectedTttle = "Myntra";
		String username = "abc@gmail.com";
		String password = "Abc@123";
//Step 1: Launching Empty Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//step 2: Enter the valid URL(Navigate to Myntra)
		driver.get("https://www.myntra.com/login/password");
		String actualUrl = driver.getCurrentUrl(); 
		if (urlData.equals(actualUrl)) {
			System.out.println("user eneter the correct URL");
		} else {
			System.out.println("Wrong Url");
		}
//Step 3:Verify Wheater user navigate to Myntra
		String ActualTittle = driver.getTitle();
		if (expectedTttle.equals(ActualTittle)) {
			System.out.println("Login page displayed sucessfully");
		} else {
			System.out.println("Login page is not displayed");
		}
//Step 4:Enter Valid Email Id in email textFiled
		driver.findElement(By.id("mobileNumberPass")).sendKeys("abc@gmail.com");
		String actualUser=driver.findElement(By.id("mobileNumberPass")).getAttribute("value");
		if(username.equals(actualUser)) {
			System.out.println("User enter the valid email id in email textFiled");
		}
		else {
			System.out.println("User enter the Invalid mail id in email textFiled");
		}
//Step 5: Enter Valid Password in password Text field
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abc@123");
		String actualPasssword=driver.findElement(By.xpath("//input[@type='password']")).getAttribute("value");
		if(password.equals(actualPasssword)) {
			System.out.println("User enter the valid password in password Text field");
		}
		else {
			System.out.println("User entered the invalid password in password text field");
		}
//Step 6: Click on Login Button
		driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();
		Thread.sleep(2000);
		driver.quit();
	}

}
