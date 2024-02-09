package TESTNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class loan3 {

	@Test
	public void lognweb() {
	
		System.out.println("weblogin loan3");
	}

	
	
	@Test
	public void loginmobile() {
		
		System.out.println("mobile login loan3");
	}
	
	@Test
	public void loginapi() {
		System.out.println("loginapi loan3");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This will execute at last");
	}
	@Test(dependsOnMethods={"demo9"})
	public void 
	demo2() {
		System.out.println("DEMO2");
	}
	@Test()
	public void demo9() {
		System.out.println("DEMO9");
	}

}
