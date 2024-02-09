package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class httpscertificaion {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions(); // handle ssl certification
		options.setAcceptInsecureCerts(true);        //accepct the error
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options); //pass the option in the driver
		
		
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().deleteAllCookies();  //delete all cookies
        driver.manage().deleteCookieNamed("cookiename");
        driver.manage().addCookie(null);
       
	}

}
