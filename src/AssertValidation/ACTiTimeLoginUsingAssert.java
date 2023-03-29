package AssertValidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ACTiTimeLoginUsingAssert {
	@Test
	public void LoginPageAsAdmin() {
		String expectedTittleHomepage = "actiTIME - Login";
		String HomePageTittle = "actiTIME - Enter Time-Track";
		String userData = "admin";
		String PassWord = "manager";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicit = new WebDriverWait(driver, 15);
		SoftAssert soft = new SoftAssert();
		driver.get("https://demo.actitime.com/login.do");
		String actual = driver.getTitle();
		Assert.assertEquals(expectedTittleHomepage, actual, "Login Page is Dispalyed Sucessfully");
		WebElement user = driver.findElement(By.id("username"));
		user.clear();
		user.sendKeys(userData);
		String actualUser = user.getAttribute("value");
		Assert.assertEquals(userData, actualUser, "Please enter Vaid Username");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys(PassWord);
		String actPwd = pwd.getAttribute("value");
		Assert.assertEquals(PassWord, actPwd, "Enter Valid PassWord");
		driver.findElement(By.id("loginButton")).click();
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		String ActualHomeTittle = driver.getTitle();
		Assert.assertEquals(ActualHomeTittle, HomePageTittle, "Home Page is Displayed");
		driver.quit();
		soft.assertAll();

	}
}
