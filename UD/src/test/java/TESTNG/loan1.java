package TESTNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loan1 {
	@Test
	public  void  method1() {
		System.out.println("Methodloan1");
	}
	
	@Test(groups= {"smoke"})
	public void method2() {
		System.out.println("mnethodloan111");
	}
	
	@AfterSuite
	public void  aftersuite() {
		System.out.println("This is after suite");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Runs Before every method IN CLASS 1");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Runs AFTER every method IN CLASS 1");
	}

}
