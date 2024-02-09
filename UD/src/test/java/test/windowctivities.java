package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowctivities {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://tas2.checkboxtechnology.com/home");
		driver.navigate().back();
	
		
		


	}

}
