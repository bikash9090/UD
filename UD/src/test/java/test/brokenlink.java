package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> links = driver.findElements(By.xpath("//tr/td/ul/li/a"));
		 
		 
		 
		 SoftAssert a = new SoftAssert();   //creating object of softassert
		 
		 
		//System.out.println(links);
		for(WebElement link: links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection ur= (HttpURLConnection) new URL(url).openConnection();
			ur.setRequestMethod("HEAD");
			ur.connect();
			int responsecode = ur.getResponseCode();
			System.out.println(responsecode);
			a.assertTrue(responsecode<400, "brokenlink"  + "   "   +link.getText()); //using softassert so the test doest not stop
			
			}
		a.assertAll();  //go get the report fo the failed test
		}
		
		
		

	}


