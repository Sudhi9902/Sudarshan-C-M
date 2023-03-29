package AssertValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FaceBookLoginValidation {
	@Test
	public void Login() {
		WebDriver driver = new ChromeDriver();
		SoftAssert soft = new SoftAssert();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		soft.assertEquals(driver.getTitle(), "Log in to Facebook", "Login Page is Not Displayed");
		driver.findElement(By.id("loginbutton")).click();
		Reporter.log("SucessFully clicked on Login Button", true);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='email_container']")));
		soft.assertEquals(driver.getCurrentUrl(),
				"https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100",
				"The url is MisMatched");
		WebElement txtField = driver.findElement(By.id("email"));
		soft.assertEquals(txtField.getCssValue("border"), "1px solid rgb(240, 40, 73)",
				"Border color of email text field is red");
		WebElement error = driver.findElement(By.xpath("//div[@id='email_container']"));
		soft.assertEquals(error.getText(),
				"The email address or mobile number you entered isn't connected to an account. Find your account and log in.",
				"error msg paassesd");
		driver.quit();
		soft.assertAll();
	}

}
