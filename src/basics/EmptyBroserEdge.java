package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EmptyBroserEdge {

	public static void main(String[] args) {
		WebDriver driver=null;
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}

}
