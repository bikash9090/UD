package TESTNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loan4 {
	
	@Test
	public void loginwebhome() {
		// code
		System.out.println("weblogin home loan4");
	}
    
	
	@Test
	public void loginmobile() {
		//
		System.out.println("mobile login home loan4");
	}
	
	@Test
	public void loginapi() {
		System.out.println("loginapi home ");
		
	}
	@BeforeTest
	public void beforetestmethod() {
		System.out.println("This should be exexuted first");
	}
	@Test
	public void demo3() {
		System.out.println("DEMO3");
	}


}
