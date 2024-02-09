package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loan2 {
	
	@Test(groups= {"smoke"})
	public void methodd() {
		System.out.println("methoddloan2");
	}
	@Test(dataProvider="datacombination")  //data provider is passed in this method named datacombination
	public void methods(String id , String pass) {// two strings are passed to catch the value from dataproviders below 
		System.out.println("methodsloan222");
		System.out.println(id);
		System.out.println(pass);
	}
	
	@BeforeSuite
	public void  beforesuite() {
		System.out.println("this is before suite");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("BEFORE CLASS");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("AFTER CLASS");
	}
	
	@Test	
	public void demo4() {
		System.out.println("DEMO4");
	}
	
	@DataProvider
	public Object[][] datacombination() {
		
		// 1st combination of user name and pass
		//2nd combination with user name and pass
		//3 aslo with 3rd combination
		
		
		Object[][] data = new Object[3][2];   // here  3 combination and 2 is the no of values we are passing
		
		 data[0][0]="username1";
		 data[0][1]="password1";
		 
		 data[1][0]="username2";
		 data[1][1]="password2";
		 
		 data[2][0]="username3";
		 data[2][1]="password3";
		 return data;
				 
		
		
		
	}
}

