package WorkingWithTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutionConditionUsingDependMetho {
	
	@Test(dependsOnMethods = "register")
	public void createAccount() {
		Reporter.log("Account Created SucessFully", true);
	}
	@Test
	public void register() {
		Reporter.log("Registered SucessFully", true);
	}
	@Test(dependsOnMethods = {"createAccount","register"})
	public void modifyAccount() {
		int i=1/0;
		System.out.println(i);
		Reporter.log("Account Modified SucessFully", true);
	}
	@Test(dependsOnMethods = "createAccount")
	public void ammountTransfer() {
		Reporter.log("Ammount transferd SucessFully", true);
	}
	@Test(dependsOnMethods =  {"createAccount","modifyAccount"})
	public void deleteAccount() {
		Reporter.log("Account deleted SucessFully", true);
	}
	@Test
	public void aegister() {
		Reporter.log("Registered SucessFully", true);
	}
	@Test
	public void begister() {
		Reporter.log("Registered SucessFully", true);
	}
}
