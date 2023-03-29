package dataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Sudarshan
 *
 */
public class ToLanuchTheBrowserUsingPropFile {

	public static void main(String[] args) throws IOException {
		//Step 1: creating The Input File type
		File path = new File("./TestData/LanuchBrowser.properties");
		FileInputStream fis = new FileInputStream(path);
		
		// Step 2: Creating The Object of File Type
		Properties property = new Properties();
		property.load(fis);
		
		//Step 3: Read Methods
		String name = property.get("chromeBrowserKey").toString();
		String value = property.get("chromeBroserValue").toString();
		String url = property.get("Url").toString();
		
		//Step 4: WebDriver Actions
		System.setProperty(name, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();

	}

}
